package org.pds16.pds16asm.converter.Impl

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class CHARValueConverter extends AbstractLexerBasedConverter<Integer> {
	private val CHAR_MAX = 256
	
	/**
	 * <p>Creates a value from the given input. The input is conformant
	 * to a data type or terminal rule.</p> 
	 * 
	 * <p>The given <code>string</code>
	 * or <code>node</code> may be null but not both of them.</p>
	 * 
	 * @param string the string that was inferred from the node. Usually the node's text
	 * but may be reduced to the parts of the node that are not 
	 * {@link org.eclipse.xtext.nodemodel.ILeafNode#isHidden() hidden}.
	 * 
	 * @param node the parsed node including hidden parts.
	 * @return the new value
	 * @throws ValueConverterException indicates that the string or node did not fulfil
	 * the expected format.
	 */	
	override toValue(String string, INode node) throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to an ascii value.", node, null)
		
		try {
			var int intValue
			//normal case lenght 3
			//(e.g. "'c'" )
			if(string.length == 3){
				intValue = string.charAt(1)
				checkIfIsAscii(intValue, node)
				
			//From the grammar definition, if just can have length of 3 or 4
			//By that reason, this case has length of 4, where the first char is the signal (+/-)
			//(e.g. "-'c'" )
			}else{
				intValue = string.charAt(2)
				checkIfIsAscii(intValue, node)
				//if signal is negative, value -= value
				intValue = if(string.charAt(0).equals("-")) -intValue else intValue
			}
			
			//return an Integer object, not int
			return Integer.valueOf(intValue)
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an ascii value.", node, e)
		}
		
	}
	
	def checkIfIsAscii(int a, INode node){
		if(a<0 || a >= CHAR_MAX)
			throw new ValueConverterException("Couldn't convert string to an ascii value.", node, null)
	}
}
