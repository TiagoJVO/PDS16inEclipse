package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class HEXValueConverter extends AbstractLexerBasedConverter<Integer>{

	override toValue(String string, INode node) throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to an hexadecimal value.", node, null);
		try {
			var int intValue = Integer.decode(string);
			return Integer.valueOf(intValue);
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an hexadecimal value.", node, e);
		}
		
	}
	
	override String toEscapedString(Integer value) {
		return "0x" + Integer.toHexString(value)
	}
	
	override void assertValidValue(Integer value) {
		super.assertValidValue(value);
	}
}
