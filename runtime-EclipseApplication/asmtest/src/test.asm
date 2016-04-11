.section directData
.org 016
var4x12:
.byte 12, 13, 14, 32, 98, 255; decimal
.byte 014 ;octal
.byte 0xC ;hexadecimal
.byte -12 ; negativos -> -n�mero
.byte 1100b ;binario
.section indirectData
varChar:
.byte 'A', 'B', 'C',0x0a,0x0d, 0 /* v�rios bytes com os c�digos ascii das letras */
varWord:
.word 0xA25C ; dois bytes
varWord:
.word main, l1, rotina ; inicia array com os endere�os das v�rias refer�ncias
varArray:
.space 5, 0xAB ;preenche 5 bytes com o valor 0xAB
.space 3 ;reserva 3 bytes e inicia com zero
varTexto:
.ascii "isto � texto que n�o acaba com um byte a zero"
.ascii "isto �", " texto que" , " n�o acaba com um byte a zero"
/* c�digo */
.section start
.org 0
ld r7,[r7,#1] ; jmp main
jmp isr
.word main
/* utilizam-se as mesmas primitivas que em .data ou as seguintes */
.equ const1, 86
.set const2, 10
.word 0xA25C /* dois bytes */
.space 3, 0xAB
.section main
.org 0x2000
main: 
ldi r0,#123
ld r1,[r7,#1]
jmp l1
.word main
l1: 
ldi r2,#low(varArray)
ldih r3,#high(varArray)
jmpl rotina
jmp $
rotina: 
st r0,[r2,#0]
ld r0,[r1,#4]
ld r3,var4x12+4
movf r0,r2
inc r2
ret
/* fim do modulo */
.end