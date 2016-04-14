.section	 start
;.section	 1
;.section	 "oi"
.org	0

jmp	main
jmp interruption

.equ	EQUdecimal, 12
.equ	EQUoctal, 012
.equ	EQUhexa, 0x12
.equ	EQUnegativo, -12
.equ	EQUbinario, 1001b
.equ	EQUchar, 'A'
;.equ	EQUstring, "string" ;nao pode dar ORG, EQU, SET, BYTE, WORD, SPACE(value,e initvalue)
.equ	EQUlabel, main

.set	SETdecimal, 12
.set	SEToctal, 012
.set	SEThexa, 0x12
.set	SETnegativo, -12
.set	SETbinario, 1001b
.set	SETchar, 'A'
.set	SETlabel, main

.section data
.data
frase:
	.ascii "pidnvpej","asdf"
	;.ascii 12 ;nao pode, so pode string
	.ascii "pidnvpej"
	
fraseZ:
	.asciiz "pidnvpej","asdf"
	;.asciiz 'a' ;nao pode, so pode string
	.asciiz "pidnvpej"

bytes:
	.byte 123, 075, 0x21, -12, 10010b, 'a'
	.byte 0xff
	
words:
	.word 123, 075, 0x21, -12, 10010b, 'a', 0xf12f
	.word 0xff
	
	.space 2, 0x21
.bss
justSpace:
	.space 11
	.space 012
	.space 0x12
	;.space -11 ;valor negativo nao dá, mas nao dá erro, nao compila bem
	.space 110101b

.text

;main:  ;Label a seguir a outra Label!
imediato8:
	ldi r1,#12
	ldi r1,#012
	ldi r1,#0x12
	;ldi r1,#-12 ;nao pode ter negativos
	ldi r1,#110101b
	ld r1,'a'
	ldi r1,#bytes
	;ldi r1,bytes ;tem que ter #

direct7:
	ld r1,12
	ld r1,012
	ld r1,0x12
	;ld r1,-12 ;nao pode ter negativos
	ld r1,110101b	
	ld r1,'a'
	ld r1, bytes
	
idx3:
	;ld r0,[r1, #bytes] ;nao sei se pode, apenas nao pode passar dos 3bits (validator?)
	ld r0,[r1, #0x2]
	;ld r0,[r1, 0x2] ;tem que ter #

idxRegisto:
	ld r1,[r1,r1]
	
tresRegistos:
	add r1,r1,r1

constante4:
	add r1,r1,#0x2
	;add r1,r1,#bytes ;same, excede 4 bits
	;add r1,r1, 0x2 ;#   Só funciona com #
	
bit:
	shl r1,r2,#2,0
	;shl r1,r2,#2,0x1 ;Pode ser OCTA, HEXA, INT, BIT ou seja meter Numbers e dps fazer validator?
	;shl r1,r2,#2,2 ;nao pode, pode ser qqr coisa desde que o seu valor seja 0 ou 1... validator
	
offset8:
	je r1, #12
	je r1, #012
	je r1, #0x12
	je r1, #-12
	je r1, #110101b	
	je r1, #'a'	
	je r1, #bytes
	ret
	
interruption:
	mov r1,r0
	inc r0
	dec r0
	jmp $
	ret 
/*
verificar se existem tipos para
imediat8, direct7, idximediate 
e fazer validators caso passe do valor maximo
*/

.end
