/*
 * generated by Xtext 2.10.0
 */
lexer grammar InternalPds16asmLexer;

@header {
package org.pds16.pds16asm.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Section : '.'('S'|'s')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Asciiz : '.'('A'|'a')('S'|'s')('C'|'c')('I'|'i')('I'|'i')('Z'|'z');

Ascii : '.'('A'|'a')('S'|'s')('C'|'c')('I'|'i')('I'|'i');

Space : '.'('S'|'s')('P'|'p')('A'|'a')('C'|'c')('E'|'e');

Byte : '.'('B'|'b')('Y'|'y')('T'|'t')('E'|'e');

Data : '.'('D'|'d')('A'|'a')('T'|'t')('A'|'a');

Text : '.'('T'|'t')('E'|'e')('X'|'x')('T'|'t');

Word : '.'('W'|'w')('O'|'o')('R'|'r')('D'|'d');

Bss : '.'('B'|'b')('S'|'s')('S'|'s');

End : '.'('E'|'e')('N'|'n')('D'|'d');

Equ : '.'('E'|'e')('Q'|'q')('U'|'u');

Org : '.'('O'|'o')('R'|'r')('G'|'g');

Set : '.'('S'|'s')('E'|'e')('T'|'t');

Adcf : ('A'|'a')('D'|'d')('C'|'c')('F'|'f');

Addf : ('A'|'a')('D'|'d')('D'|'d')('F'|'f');

Anlf : ('A'|'a')('N'|'n')('L'|'l')('F'|'f');

Decf : ('D'|'d')('E'|'e')('C'|'c')('F'|'f');

High : ('H'|'h')('I'|'i')('G'|'g')('H'|'h');

Incf : ('I'|'i')('N'|'n')('C'|'c')('F'|'f');

Iret : ('I'|'i')('R'|'r')('E'|'e')('T'|'t');

Jmpl : ('J'|'j')('M'|'m')('P'|'p')('L'|'l');

Ldih : ('L'|'l')('D'|'d')('I'|'i')('H'|'h');

Movf : ('M'|'m')('O'|'o')('V'|'v')('F'|'f');

Notf : ('N'|'n')('O'|'o')('T'|'t')('F'|'f');

Orlf : ('O'|'o')('R'|'r')('L'|'l')('F'|'f');

Sbbf : ('S'|'s')('B'|'b')('B'|'b')('F'|'f');

Subf : ('S'|'s')('U'|'u')('B'|'b')('F'|'f');

Subr : ('S'|'s')('U'|'u')('B'|'b')('R'|'r');

Xrlf : ('X'|'x')('R'|'r')('L'|'l')('F'|'f');

PSW : ('P'|'p')('S'|'s')('W'|'w');

Adc : ('A'|'a')('D'|'d')('C'|'c');

Add : ('A'|'a')('D'|'d')('D'|'d');

Anl : ('A'|'a')('N'|'n')('L'|'l');

Dec : ('D'|'d')('E'|'e')('C'|'c');

Inc : ('I'|'i')('N'|'n')('C'|'c');

Jae : ('J'|'j')('A'|'a')('E'|'e');

Jbl : ('J'|'j')('B'|'b')('L'|'l');

Jmp : ('J'|'j')('M'|'m')('P'|'p');

Jnc : ('J'|'j')('N'|'n')('C'|'c');

Jne : ('J'|'j')('N'|'n')('E'|'e');

Jnz : ('J'|'j')('N'|'n')('Z'|'z');

Ldb : ('L'|'l')('D'|'d')('B'|'b');

Ldi : ('L'|'l')('D'|'d')('I'|'i');

Low : ('L'|'l')('O'|'o')('W'|'w');

Mov : ('M'|'m')('O'|'o')('V'|'v');

Nop : ('N'|'n')('O'|'o')('P'|'p');

Not : ('N'|'n')('O'|'o')('T'|'t');

Orl : ('O'|'o')('R'|'r')('L'|'l');

Rcl : ('R'|'r')('C'|'c')('L'|'l');

Rcr : ('R'|'r')('C'|'c')('R'|'r');

Ret : ('R'|'r')('E'|'e')('T'|'t');

Rrl : ('R'|'r')('R'|'r')('L'|'l');

Rrm : ('R'|'r')('R'|'r')('M'|'m');

Sbb : ('S'|'s')('B'|'b')('B'|'b');

Shl : ('S'|'s')('H'|'h')('L'|'l');

Shr : ('S'|'s')('H'|'h')('R'|'r');

Stb : ('S'|'s')('T'|'t')('B'|'b');

Sub : ('S'|'s')('U'|'u')('B'|'b');

Xrl : ('X'|'x')('R'|'r')('L'|'l');

LR : ('L'|'l')('R'|'r');

PC : ('P'|'p')('C'|'c');

Jc : ('J'|'j')('C'|'c');

Je : ('J'|'j')('E'|'e');

Jz : ('J'|'j')('Z'|'z');

Ld : ('L'|'l')('D'|'d');

R0 : ('R'|'r')'0';

R1 : ('R'|'r')'1';

R2 : ('R'|'r')'2';

R3 : ('R'|'r')'3';

R4 : ('R'|'r')'4';

R5 : ('R'|'r')'5';

R6 : ('R'|'r')'6';

R7 : ('R'|'r')'7';

St : ('S'|'s')('T'|'t');

NumberSign : '#';

DollarSign : '$';

LeftParenthesis : '(';

RightParenthesis : ')';

PlusSign : '+';

Comma : ',';

LeftSquareBracket : '[';

RightSquareBracket : ']';

// Rules duplicated to allow inter-rule references

RULE_HEX : RULE_SIGN? ('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_OCT : RULE_SIGN? '0' ('0'..'7')+;

RULE_BIN : RULE_SIGN? ('0'|'1')+ 'b';

RULE_CHAR : RULE_SIGN? '\'' RULE_ANY_OTHER '\'';

fragment RULE_SIGN : ('-'|'+');

RULE_OPERANDS : (RULE_SIGN|'*'|'/');

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_IDLABEL : ('a'..'z'|'A'..'Z'|'_'|'0'..'9')+ ':';

RULE_INT : RULE_SIGN? ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : ';' ( options {greedy=false;} : . )*'\n';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

fragment RULE_ANY_OTHER : .;
