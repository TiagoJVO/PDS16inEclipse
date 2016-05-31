/**
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.validation;

import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.pds16.pds16asm.pds16asm.Const4OrLabel;
import org.pds16.pds16asm.pds16asm.DirectOrLabel;
import org.pds16.pds16asm.pds16asm.Idx3OrLabel;
import org.pds16.pds16asm.pds16asm.Immediate8OrLabel;
import org.pds16.pds16asm.pds16asm.Offset8OrLabel;
import org.pds16.pds16asm.pds16asm.OperationShift;
import org.pds16.pds16asm.pds16asm.PDS16ASM;
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
  public void checkShift(final PDS16ASM general) {
    try {
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      _root.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Check
  public void checkShift(final OperationShift os) {
    int a = os.getSin();
    if (((a < 0) || (a > 1))) {
      this.warning("SIN should be only 0 or 1", 
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
      this.warning(("Number should be between 0 and " + Integer.valueOf(this.MAX_8BIT_NO_SIGNAL)), 
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
      this.warning(("Number should be between 0 and " + Integer.valueOf(this.MAX_7BIT_NO_SIGNAL)), 
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
      this.warning(("Number should be between 0 and " + Integer.valueOf(this.MAX_4BIT_NO_SIGNAL)), 
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
      this.warning(("Number should be between 0 and " + Integer.valueOf(this.MAX_3BIT_NO_SIGNAL)), 
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
      this.warning(((("Number should be between" + Integer.valueOf(this.MIN_8BIT_WITH_SIGNAL)) + " and ") + Integer.valueOf(this.MAX_8BIT_WITH_SIGNAL)), 
        Pds16asmPackage.Literals.OFFSET8_OR_LABEL__NUMBER, 
        "Invalid Number");
    }
  }
  
  @Check
  public void checkByte(final org.pds16.pds16asm.pds16asm.Byte b) {
    EList<org.pds16.pds16asm.pds16asm.Number> _numbers = b.getNumbers();
    boolean _equals = Objects.equal(_numbers, null);
    if (_equals) {
      return;
    }
    final EList<org.pds16.pds16asm.pds16asm.Number> list = b.getNumbers();
    int size = list.size();
    if ((size > 0)) {
      IntegerRange _upTo = new IntegerRange(0, (size - 1));
      final Consumer<Integer> _function = (Integer i) -> {
        org.pds16.pds16asm.pds16asm.Number item = list.get((i).intValue());
        boolean _or = false;
        int _value = item.getValue();
        boolean _lessThan = (_value < this.MIN_8BIT_WITH_SIGNAL);
        if (_lessThan) {
          _or = true;
        } else {
          int _value_1 = item.getValue();
          boolean _greaterThan = (_value_1 > this.MAX_8BIT_WITH_SIGNAL);
          _or = _greaterThan;
        }
        if (_or) {
          this.warning(((("One of the declared values isn\'t be between" + Integer.valueOf(this.MIN_8BIT_WITH_SIGNAL)) + " and ") + Integer.valueOf(this.MAX_8BIT_WITH_SIGNAL)), 
            Pds16asmPackage.Literals.BYTE__TAG, 
            "Invalid Number");
        }
      };
      _upTo.forEach(_function);
    }
  }
  
  @Check
  public void checkWord(final Word w) {
    EList<org.pds16.pds16asm.pds16asm.Number> _numbers = w.getNumbers();
    boolean _equals = Objects.equal(_numbers, null);
    if (_equals) {
      return;
    }
    final EList<org.pds16.pds16asm.pds16asm.Number> list = w.getNumbers();
    int size = list.size();
    IntegerRange _upTo = new IntegerRange(0, (size - 1));
    final Consumer<Integer> _function = (Integer i) -> {
      org.pds16.pds16asm.pds16asm.Number item = list.get((i).intValue());
      boolean _or = false;
      int _value = item.getValue();
      boolean _lessThan = (_value < this.MIN_16BIT_WITH_SIGNAL);
      if (_lessThan) {
        _or = true;
      } else {
        int _value_1 = item.getValue();
        boolean _greaterThan = (_value_1 > this.MAX_16BIT_WITH_SIGNAL);
        _or = _greaterThan;
      }
      if (_or) {
        this.warning(((("One of the declared values isn\'t be between" + Integer.valueOf(this.MIN_16BIT_WITH_SIGNAL)) + " and ") + Integer.valueOf(this.MAX_16BIT_WITH_SIGNAL)), 
          Pds16asmPackage.Literals.WORD__TAG, 
          "Invalid Number");
      }
    };
    _upTo.forEach(_function);
  }
}
