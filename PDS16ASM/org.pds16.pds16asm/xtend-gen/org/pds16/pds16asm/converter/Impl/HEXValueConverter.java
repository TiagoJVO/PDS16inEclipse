package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class HEXValueConverter extends AbstractLexerBasedConverter<Integer> {
  @Override
  public Integer toValue(final String s, final INode node) throws ValueConverterException {
    boolean _isEmpty = Strings.isEmpty(s);
    if (_isEmpty) {
      throw new ValueConverterException("Couldn\'t convert empty string to an hexadecimal value.", node, null);
    }
    try {
      String _xifexpression = null;
      boolean _startsWith = s.startsWith("-");
      if (_startsWith) {
        int _length = s.length();
        String _substring = s.substring(3, _length);
        _xifexpression = ("-" + _substring);
      } else {
        int _length_1 = s.length();
        _xifexpression = s.substring(2, _length_1);
      }
      String cut = _xifexpression;
      int _parseInt = Integer.parseInt(cut, 16);
      short intValue = ((short) _parseInt);
      return Integer.valueOf(intValue);
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        final NumberFormatException e = (NumberFormatException)_t;
        throw new ValueConverterException((("Couldn\'t convert \'" + s) + "\' to an hexadecimal value."), node, e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public String toEscapedString(final Integer value) {
    String _string = Integer.toString((value).intValue(), 16);
    return ("0x" + _string);
  }
  
  @Override
  public void assertValidValue(final Integer value) {
    super.assertValidValue(value);
  }
}
