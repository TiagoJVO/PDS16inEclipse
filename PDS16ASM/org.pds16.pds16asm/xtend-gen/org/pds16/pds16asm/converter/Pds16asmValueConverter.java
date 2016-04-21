package org.pds16.pds16asm.converter;

import com.google.inject.Inject;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverter;
import org.pds16.pds16asm.converter.Impl.BINValueConverter;
import org.pds16.pds16asm.converter.Impl.CHARValueConverter;
import org.pds16.pds16asm.converter.Impl.HEXValueConverter;
import org.pds16.pds16asm.converter.Impl.OCTValueConverter;

@SuppressWarnings("all")
public class Pds16asmValueConverter extends DefaultTerminalConverters implements IValueConverterService {
  @Inject
  private HEXValueConverter hexValueConverter;
  
  @Inject
  private OCTValueConverter octValueConverter;
  
  @Inject
  private BINValueConverter binValueConverter;
  
  @Inject
  private CHARValueConverter charValueConverter;
  
  @ValueConverter(rule = "HEX")
  public IValueConverter<Integer> getHexConverter() {
    return this.hexValueConverter;
  }
  
  @ValueConverter(rule = "OCT")
  public IValueConverter<Integer> getOctConverter() {
    return this.octValueConverter;
  }
  
  @ValueConverter(rule = "BIN")
  public IValueConverter<Integer> getBinConverter() {
    return this.binValueConverter;
  }
  
  @ValueConverter(rule = "CHAR")
  public IValueConverter<Integer> getCharConverter() {
    return this.charValueConverter;
  }
}
