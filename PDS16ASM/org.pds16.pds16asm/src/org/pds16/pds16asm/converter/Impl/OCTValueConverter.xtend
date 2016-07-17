package org.pds16.pds16asm.converter.Impl

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class OCTValueConverter extends AbstractLexerBasedConverter<Integer> {
	
	override toValue(String string, INode node) throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to an hexadecimal value.", node, null);
		
		try {
			//By grammar definition, value should be compatible with Integer.decode octal definition
			var int intValue = Integer.decode(string);
			
			//return an Integer object, not int
			return Integer.valueOf(intValue);
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an hexadecimal value.", node, e);
		}
		
	}
}
