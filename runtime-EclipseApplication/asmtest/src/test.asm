/*LDI*/
	ldi r1, #0x2f

/*LDIH*/
	ldih r1, #0x2f

/*LD direct*/
	;ldb r1, var1
	ldb r1, 0x25
	;ld r3, var1
	ld r3, 0x25

/*LD indexed*/
	ld r0, [r7, #5]
	ldb r1, [r2, #3]
	ldb r3,[r1,#0x0]

/*LD based indexed*/
	ld r0, [r1, r2]
	ldb r2,[r0, r1]

/*ADD registers*/
	add r0,r7,r2
	addf r0,r7,r2
	
/*ADD registers with CY flag*/
	adc r0,r7,r2
	adcf r0,r7,r2

/*ADD constant*/
	add r0,r7,#15
	addf r1,r2,#0
/*ADD constant with CY flag*/
	adc r0,r7,#12
	adcf r0,r7,#12

/*SUB registers*/
	sub r0,r7,r2
	subf r0,r7,r2
	;subr r2,r2,r3

/*SUB registers with borrow*/
	sbb r0,r7,r2
	sbbf r0,r7,r2
	
/*SUB constant*/
	sub r0,r7,#5
	subf r0,r7,#5
	
/*SUB constant with borrow*/
	sbb r0,r7,#3
	sbbf r0,r7,#3

/*AND registers*/
	anl r0,r7,r2
	anlf r0,r7,r2
	;anlr r2,r2,r3

/*OR registers*/
	orl r0,r7,r2
	orlf r2,r3,r3	

/*XOR registers*/
	xrl r0, r7,r2
	xrlf r0, r7,r2

/*NOT register*/
	not r0,r1
	notf r0,r1

/*Shift left register*/
	shl r0,r2,#5,0

/*Shift right register*/
	shr r0,r2,#5,0

/*Rotate right least significant bit*/
	rrl r0, r2, #12

/*Rotate right must significant bit*/
	rrm r0, r2, #3

/*Rotate with carry right*/
	rcr r0, r2

/*Rotate with carry left*/
	rcl r0, r3
	
;Comentario LD R1,[R2,#0xF]

