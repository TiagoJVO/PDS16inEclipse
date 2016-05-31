package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CHARValueConverter extends AbstractLexerBasedConverter<Integer> {
  private final int CHAR_MAX = 256;
  
  @Override
  public Integer toValue(final String string, final INode node) throws ValueConverterException {
    boolean _isEmpty = Strings.isEmpty(string);
    if (_isEmpty) {
      throw new ValueConverterException("Couldn\'t convert empty string to an ascii value.", node, null);
    }
    try {
      int intValue = 0;
      int _length = string.length();
      boolean _equals = (_length == 3);
      if (_equals) {
        char _charAt = string.charAt(1);
        intValue = _charAt;
        this.checkIfIsAscii(intValue, node);
      } else {
        char _charAt_1 = string.charAt(2);
        intValue = _charAt_1;
        this.checkIfIsAscii(intValue, node);
        intValue = (-intValue);
      }
      return Integer.valueOf(intValue);
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        throw new ValueConverterException((("Couldn\'t convert \'" + string) + "\' to an ascii value."), node, e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void checkIfIsAscii(final int a, final INode node) {
    if (((a < 0) || (a > 255))) {
      throw new ValueConverterException("Couldn\'t convert string to an ascii value.", node, null);
    }
  }
  
  @Override
  public String toEscapedString(final Integer value) {
    String _octalString = Integer.toOctalString((value).intValue());
    return ("0" + _octalString);
  }
  
  @Override
  public void assertValidValue(final Integer value) {
    super.assertValidValue(value);
  }
}
