package org.pds16.pds16asm.converter;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import com.google.inject.Inject
import org.eclipse.xtext.conversion.IValueConverterService
import org.pds16.pds16asm.converter.Impl.HEXValueConverter
import org.pds16.pds16asm.converter.Impl.OCTValueConverter
import org.pds16.pds16asm.converter.Impl.BINValueConverter
import org.pds16.pds16asm.converter.Impl.CHARValueConverter

class Pds16asmValueConverter extends DefaultTerminalConverters implements IValueConverterService{
	
	@Inject
	private HEXValueConverter hexValueConverter
	@Inject
	private OCTValueConverter octValueConverter
	@Inject
	private BINValueConverter binValueConverter
	@Inject
	private CHARValueConverter charValueConverter
	
	@ValueConverter(rule = "HEX")
    def IValueConverter<Integer> getHexConverter() {
        return hexValueConverter
	}
	
	@ValueConverter(rule = "OCT")
    def IValueConverter<Integer> getOctConverter() {
        return octValueConverter
	}
	
	@ValueConverter(rule = "BIN")
    def IValueConverter<Integer> getBinConverter() {
        return binValueConverter
	}
	
	@ValueConverter(rule = "CHAR")
    def IValueConverter<Integer> getCharConverter() {
        return charValueConverter
    }
}
