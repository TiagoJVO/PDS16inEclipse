package org.pds16.pds16asm.converter.Impl

import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.util.Strings

class BINValueConverter extends AbstractLexerBasedConverter<Integer> {
	
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
