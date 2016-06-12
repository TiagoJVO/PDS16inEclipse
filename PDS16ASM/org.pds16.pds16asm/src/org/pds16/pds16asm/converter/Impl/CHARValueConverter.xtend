package org.pds16.pds16asm.converter.Impl

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class CHARValueConverter extends AbstractLexerBasedConverter<Integer> {
	private val CHAR_MAX = 256;
	
	override toValue(String string, INode node) throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to an ascii value.", node, null);
		try {
			var int intValue
			if(string.length == 3){
				intValue = string.charAt(1)
				checkIfIsAscii(intValue, node)
			}else{
				intValue = string.charAt(2)
				checkIfIsAscii(intValue, node)
				intValue = -intValue
			}
			return Integer.valueOf(intValue);
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an ascii value.", node, e);
		}
		
	}
	
	def checkIfIsAscii(int a, INode node){
		if(a<0 || a >= CHAR_MAX)
			throw new ValueConverterException("Couldn't convert string to an ascii value.", node, null);
	}
	
	override String toEscapedString(Integer value) {
		return "0" + Integer.toOctalString(value)
	}
	
	override void assertValidValue(Integer value) {
		super.assertValidValue(value);
	}
}
