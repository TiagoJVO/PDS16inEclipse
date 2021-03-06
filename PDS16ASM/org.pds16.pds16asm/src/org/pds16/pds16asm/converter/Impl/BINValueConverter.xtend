package org.pds16.pds16asm.converter.Impl

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class BINValueConverter extends AbstractLexerBasedConverter<Integer> {
	
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
	 * @return the new value.
	 * @throws ValueConverterException indicates that the string or node did not fulfil
	 * the expected format.
	 */
	override toValue(String string, INode node) throws ValueConverterException {
		
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to an binary value.", node, null)
		
		try {
			//removing 'b' character from the end of the string
			var String from = string.substring(0, string.length()-1)
			
			//parsing the string 'from' to a base 2 number (binary)
			var int intValue = Integer.parseInt(from, 2)
			
			//return an Integer object, not int
			return Integer.valueOf(intValue)
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an binary value.", node, e)
		}
		
	}
}
