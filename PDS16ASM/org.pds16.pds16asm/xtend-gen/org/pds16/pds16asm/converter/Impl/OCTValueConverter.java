package org.pds16.pds16asm.converter.Impl;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class OCTValueConverter extends AbstractLexerBasedConverter<Integer> {
  /**
   * <p>Creates a value from the given input. The input is conformant
   * to a data type or terminal rule.</p>
   * 
   * <p>The given <code>string</code>
   * or <code>node</code> may be null but not both of them.</p>
   * 
   * @param string the string that was inferred from the node. Usually the node's text
   * but may be reduced to the parts of the node that are not
   * {@link org.eclipse.xtext.nodemodel.ILeafNode#isHidden() hidden}.
   * 
   * @param node the parsed node including hidden parts.
   * @return the new value
   * @throws ValueConverterException indicates that the string or node did not fulfil
   * the expected format.
   */
  @Override
  public Integer toValue(final String string, final INode node) throws ValueConverterException {
    boolean _isEmpty = Strings.isEmpty(string);
    if (_isEmpty) {
      throw new ValueConverterException("Couldn\'t convert empty string to an hexadecimal value.", node, null);
    }
    try {
      int intValue = (Integer.decode(string)).intValue();
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
