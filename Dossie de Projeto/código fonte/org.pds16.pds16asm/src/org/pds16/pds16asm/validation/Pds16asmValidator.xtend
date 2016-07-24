/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.pds16.pds16asm.validation

import org.eclipse.xtext.validation.Check
import org.pds16.pds16asm.pds16asm.OperationShift
import org.pds16.pds16asm.pds16asm.Pds16asmPackage
import org.pds16.pds16asm.pds16asm.Const4OrLabel
import org.pds16.pds16asm.pds16asm.Idx3OrLabel
import org.pds16.pds16asm.pds16asm.DirectOrLabel
import org.pds16.pds16asm.pds16asm.Immediate8OrLabel
import org.pds16.pds16asm.pds16asm.Offset8OrLabel
import org.pds16.pds16asm.pds16asm.Word
import org.pds16.pds16asm.pds16asm.Byte
import java.util.List
import org.pds16.pds16asm.pds16asm.PDS16ASM
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.emf.common.util.EList
import org.pds16.pds16asm.pds16asm.Space

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class Pds16asmValidator extends AbstractPds16asmValidator {
	
	val MIN_16BIT_WITH_SIGNAL = -32768
	val MAX_16BIT_WITH_SIGNAL = 32767
	
	val MIN_8BIT_WITH_SIGNAL = -128
	val MAX_8BIT_WITH_SIGNAL = 127
	
	val MAX_8BIT_NO_SIGNAL = 255
	
	val MAX_7BIT_NO_SIGNAL = 127
	
	val MAX_4BIT_NO_SIGNAL = 15
	
	val MAX_3BIT_NO_SIGNAL = 7
	
	@Check
	def checkGeneral(PDS16ASM general){
		//deletes all markers on the resource file, since PDS16ASM its the base of the AST 
		ResourcesPlugin.workspace.root.deleteMarkers(IMarker.PROBLEM,true,IResource.DEPTH_INFINITE)
	}
	
	@Check
	def checkShift(OperationShift os){
		var int a = os.sin.value
		if(a<0 || a>1){
				warning('SIN should be only 0 or 1', 
						Pds16asmPackage.Literals.OPERATION_SHIFT__SIN,
						"Invalid Number")
		}
	}
	
	@Check
	def checkImmediate8(Immediate8OrLabel i){
		if(i.number == null)//in case of this instance has the value from a label
			return;
		var Integer value = i.number.value;
		if(value < 0 || value > MAX_8BIT_NO_SIGNAL )
			warning('Number should be between 0 and ' + MAX_8BIT_NO_SIGNAL, 
					Pds16asmPackage.Literals.IMMEDIATE8_OR_LABEL__NUMBER,
					"Invalid Number")
	
	}
	
	@Check
	def checkDirect7(DirectOrLabel d){
		if(d.number == null)//in case of this instance has the value from a label
			return;
		var Integer value = d.number.value;
		if(value < 0  || value > MAX_7BIT_NO_SIGNAL)
			warning('Number should be between 0 and ' + MAX_7BIT_NO_SIGNAL, 
					Pds16asmPackage.Literals.DIRECT_OR_LABEL__NUMBER,
					"Invalid Number")
	}
	
	@Check
	def checkConst4(Const4OrLabel c){
		if(c.number == null)//in case of this instance has the value from a label
			return;		
		var Integer value = c.number.value;
		if(value < 0  || value > MAX_4BIT_NO_SIGNAL)
			warning('Number should be between 0 and ' + MAX_4BIT_NO_SIGNAL, 
					Pds16asmPackage.Literals.CONST4_OR_LABEL__NUMBER,
					"Invalid Number")
	}

	@Check
	def checkIdx3(Idx3OrLabel i){
		if(i.number == null)//in case of this instance has the value from a label
			return;	
		var Integer value = i.number.value;
		if(value < 0  || value > MAX_3BIT_NO_SIGNAL)
			warning('Number should be between 0 and ' + MAX_3BIT_NO_SIGNAL, 
					Pds16asmPackage.Literals.IDX3_OR_LABEL__NUMBER,
					"Invalid Number")
	}

	@Check
	def checkOffset8(Offset8OrLabel o){
		if(o.number == null)//in case of this instance has the value from a label
			return;
		var Integer value = o.number.value;
		if(value < MIN_8BIT_WITH_SIGNAL  || value > MAX_8BIT_WITH_SIGNAL)
			warning('Number should be between' + MIN_8BIT_WITH_SIGNAL + ' and ' + MAX_8BIT_WITH_SIGNAL, 
					Pds16asmPackage.Literals.OFFSET8_OR_LABEL__NUMBER,
					"Invalid Number")
	}
	
	@Check
	def checkSpace(Space s){
		if(s.byteValue == null)
			return;
		var Integer value = s.byteValue.value;
		if(value < MIN_8BIT_WITH_SIGNAL  || value > MAX_8BIT_NO_SIGNAL)
			warning('Number should be between' + MIN_8BIT_WITH_SIGNAL + ' and ' + MAX_8BIT_WITH_SIGNAL + "or 0 and " + MAX_8BIT_NO_SIGNAL, 
					Pds16asmPackage.Literals.SPACE__BYTE_VALUE,
					"Invalid Number")
	}
	
	@Check
	def checkByte(Byte b){
		if(b.numbers == null)//if numbers list hasn't been defined
			return;
		val list = b.numbers;
		var int size = list.size();
		if(size>0)
		(0..size-1).forEach[i | 
			var item = list.get(i);
				if(item.value < MIN_8BIT_WITH_SIGNAL  || item.value > MAX_8BIT_WITH_SIGNAL)
					warning("One of the declared values isn't be between" + MIN_8BIT_WITH_SIGNAL + ' and ' + MAX_8BIT_WITH_SIGNAL, 
						Pds16asmPackage.Literals.BYTE__NUMBERS,
						"Invalid Number")
		]	

	}
	
	@Check
	def checkWord(Word w){
		if(w.numbers == null)//if numbers list hasn't been defined
			return;
		val list = w.numbers;
		var int size = list.size();
		if(size>0)
		(0..size-1).forEach[i | 
			var item = list.get(i);
				if(item.value < MIN_16BIT_WITH_SIGNAL  || item.value > MAX_16BIT_WITH_SIGNAL)
					warning("One of the declared values isn't be between" + MIN_16BIT_WITH_SIGNAL + ' and ' + MAX_16BIT_WITH_SIGNAL, 
						Pds16asmPackage.Literals.WORD__NUMBERS,
						"Invalid Number")
		]	

	}
		
}
