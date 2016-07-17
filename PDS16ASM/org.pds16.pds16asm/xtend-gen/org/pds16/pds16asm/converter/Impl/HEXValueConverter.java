package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class HEXValueConverter extends AbstractLexerBasedConverter<Integer> {
  @Override
  public Integer toValue(final String string, final INode node) throws ValueConverterException {
    boolean _isEmpty = Strings.isEmpty(string);
    if (_isEmpty) {
      throw new ValueConverterException("Couldn\'t convert empty string to an hexadecimal value.", node, null);
    }
    try {
      String cut = "";
      if ((string.startsWith("-") || string.startsWith("+"))) {
        char _charAt = string.charAt(0);
        int _length = string.length();
        String _substring = string.substring(3, _length);
        String _plus = (Character.valueOf(_charAt) + _substring);
        cut = _plus;
      } else {
        int _length_1 = string.length();
        String _substring_1 = string.substring(2, _length_1);
        cut = _substring_1;
      }
      int intValue = Integer.parseInt(cut, 16);
      return Integer.valueOf(intValue);
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        throw new ValueConverterException((("Couldn\'t convert \'" + string) + "\' to an hexadecimal value."), node, e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
