/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.validation;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.pds16.pds16asm.pds16asm.Const4OrLabel;
import org.pds16.pds16asm.pds16asm.DirectOrLabel;
import org.pds16.pds16asm.pds16asm.Idx3OrLabel;
import org.pds16.pds16asm.pds16asm.Immediate8OrLabel;
import org.pds16.pds16asm.pds16asm.Offset8OrLabel;
import org.pds16.pds16asm.pds16asm.OperationShift;
import org.pds16.pds16asm.pds16asm.Pds16asmPackage;
import org.pds16.pds16asm.pds16asm.Word;
import org.pds16.pds16asm.validation.AbstractPds16asmValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class Pds16asmValidator extends AbstractPds16asmValidator {
  private final int MIN_16BIT_WITH_SIGNAL = (-32768);
  
  private final int MAX_16BIT_WITH_SIGNAL = 32767;
  
  private final int MIN_8BIT_WITH_SIGNAL = (-128);
  
  private final int MAX_8BIT_WITH_SIGNAL = 127;
  
  private final int MAX_8BIT_NO_SIGNAL = 255;
  
  private final int MAX_7BIT_NO_SIGNAL = 127;
  
  private final int MAX_4BIT_NO_SIGNAL = 15;
  
  private final int MAX_3BIT_NO_SIGNAL = 7;
  
  @Check
  public void checkShift(final OperationShift os) {
    int a = os.getSin();
    if (((a < 0) || (a > 1))) {
      this.error("SIN should be only 0 or 1", 
        Pds16asmPackage.Literals.OPERATION_SHIFT__SIN, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkImmediate8(final Immediate8OrLabel i) {
    org.pds16.pds16asm.pds16asm.Number _number = i.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    org.pds16.pds16asm.pds16asm.Number _number_1 = i.getNumber();
    Integer value = Integer.valueOf(_number_1.getValue());
    if ((((value).intValue() < 0) || ((value).intValue() > this.MAX_8BIT_NO_SIGNAL))) {
      this.error(("Number should be between 0 and " + Integer.valueOf(this.MAX_8BIT_NO_SIGNAL)), 
        Pds16asmPackage.Literals.IMMEDIATE8_OR_LABEL__NUMBER, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkDirect7(final DirectOrLabel d) {
    org.pds16.pds16asm.pds16asm.Number _number = d.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    org.pds16.pds16asm.pds16asm.Number _number_1 = d.getNumber();
    Integer value = Integer.valueOf(_number_1.getValue());
    if ((((value).intValue() < 0) || ((value).intValue() > this.MAX_7BIT_NO_SIGNAL))) {
      this.error(("Number should be between 0 and " + Integer.valueOf(this.MAX_7BIT_NO_SIGNAL)), 
        Pds16asmPackage.Literals.DIRECT_OR_LABEL__NUMBER, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkConst4(final Const4OrLabel c) {
    org.pds16.pds16asm.pds16asm.Number _number = c.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    org.pds16.pds16asm.pds16asm.Number _number_1 = c.getNumber();
    Integer value = Integer.valueOf(_number_1.getValue());
    if ((((value).intValue() < 0) || ((value).intValue() > this.MAX_4BIT_NO_SIGNAL))) {
      this.error(("Number should be between 0 and " + Integer.valueOf(this.MAX_4BIT_NO_SIGNAL)), 
        Pds16asmPackage.Literals.CONST4_OR_LABEL__NUMBER, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkIdx3(final Idx3OrLabel i) {
    org.pds16.pds16asm.pds16asm.Number _number = i.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    org.pds16.pds16asm.pds16asm.Number _number_1 = i.getNumber();
    Integer value = Integer.valueOf(_number_1.getValue());
    if ((((value).intValue() < 0) || ((value).intValue() > this.MAX_3BIT_NO_SIGNAL))) {
      this.error(("Number should be between 0 and " + Integer.valueOf(this.MAX_3BIT_NO_SIGNAL)), 
        Pds16asmPackage.Literals.IDX3_OR_LABEL__NUMBER, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkOffset8(final Offset8OrLabel o) {
    org.pds16.pds16asm.pds16asm.Number _number = o.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    org.pds16.pds16asm.pds16asm.Number _number_1 = o.getNumber();
    Integer value = Integer.valueOf(_number_1.getValue());
    if ((((value).intValue() < this.MIN_8BIT_WITH_SIGNAL) || ((value).intValue() > this.MAX_8BIT_WITH_SIGNAL))) {
      this.error(((("Number should be between" + Integer.valueOf(this.MIN_8BIT_WITH_SIGNAL)) + " and ") + Integer.valueOf(this.MAX_8BIT_WITH_SIGNAL)), 
        Pds16asmPackage.Literals.OFFSET8_OR_LABEL__NUMBER, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkByte(final org.pds16.pds16asm.pds16asm.Byte b) {
    EList<Integer> _number = b.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    final List<Integer> list = b.getNumber();
    int size = list.size();
    IntegerRange _upTo = new IntegerRange(0, (size - 1));
    final Consumer<Integer> _function = (Integer i) -> {
      Integer value = list.get((i).intValue());
      if ((((value).intValue() < this.MIN_8BIT_WITH_SIGNAL) || ((value).intValue() > this.MAX_8BIT_WITH_SIGNAL))) {
        this.error(((("Number should be between" + Integer.valueOf(this.MIN_8BIT_WITH_SIGNAL)) + " and ") + Integer.valueOf(this.MAX_8BIT_WITH_SIGNAL)), 
          Pds16asmPackage.Literals.BYTE__NUMBER, 
          "Invalid Number");
      }
    };
    _upTo.forEach(_function);
  }
  
  @Check
  public void checkWord(final Word w) {
    EList<Integer> _number = w.getNumber();
    boolean _equals = Objects.equal(_number, null);
    if (_equals) {
      return;
    }
    final List<Integer> list = w.getNumber();
    int size = list.size();
    IntegerRange _upTo = new IntegerRange(0, (size - 1));
    final Consumer<Integer> _function = (Integer i) -> {
      Integer value = list.get((i).intValue());
      if ((((value).intValue() < this.MIN_16BIT_WITH_SIGNAL) || ((value).intValue() > this.MAX_16BIT_WITH_SIGNAL))) {
        this.error(((("Number should be between" + Integer.valueOf(this.MIN_16BIT_WITH_SIGNAL)) + " and ") + Integer.valueOf(this.MAX_16BIT_WITH_SIGNAL)), 
          Pds16asmPackage.Literals.WORD__NUMBER, 
          "Invalid Number");
      }
    };
    _upTo.forEach(_function);
  }
}
