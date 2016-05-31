package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class HEXValueConverter extends AbstractLexerBasedConverter<Integer>{

	override toValue(String s, INode node) throws ValueConverterException {
		if (Strings.isEmpty(s))
			throw new ValueConverterException("Couldn't convert empty string to an hexadecimal value.", node, null);
		try {
			var cut = if (s.startsWith("-")) "-" + s.substring(3,s.length) else s.substring(2,s.length)
			var intValue = Integer.parseInt(cut,16) as short
			return Integer.valueOf(intValue);
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + s + "' to an hexadecimal value.", node, e);
		}
	}
	
	override String toEscapedString(Integer value) {
		return "0x" + Integer.toString(value,16)
	}
	
	override void assertValidValue(Integer value) {
		super.assertValidValue(value);
	}
}
