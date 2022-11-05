; File: SchemeFlipped5.scm
; Written By: Nicole Magpantay
; Date: 09/03/2022
; TAMU email: magnipopam@tamu.edu
; Class: CSCE 314
; Description: accepts 3 parameters, integer, multiply, and add

(define (multiply x)
	(* x 1.2)
	)

(define (add x)
	(+ x 5)
	)

(define (DoubleFunc x y z)
	(display (z (y x)))
	)

(define (main) (DoubleFunc 10 multiply add)
		(newline)
		(DoubleFunc 10 add multiply)
	)

(main)
(exit) 
