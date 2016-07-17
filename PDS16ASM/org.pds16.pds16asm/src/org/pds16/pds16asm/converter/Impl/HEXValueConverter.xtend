package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class HEXValueConverter extends AbstractLexerBasedConverter<Integer>{

	override toValue(String string, INode node) throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Couldn't convert empty string to an hexadecimal value.", node, null)
		
		try {
			//removing "0x" from the string
			var cut = "";
			if (string.startsWith("-") || string.startsWith("+")) //if has signal character
				cut = string.charAt(0) + string.substring(3,string.length)
			else //if its just the hexa number
				cut = string.substring(2,string.length)
				
			//parsing the string 'cut' to a base 16 number (hexadecimal)
			var intValue = Integer.parseInt(cut,16)
			
			//return an Integer object, not int
			return Integer.valueOf(intValue)
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an hexadecimal value.", node, e)
		}
	}
}
