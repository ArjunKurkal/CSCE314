; File: SchemeFlipped1.scm
; Written By: Nicole Magpantay
; Date: 09/03/2022
; TAMU email: magnipopam@tamu.edu
; Class: CSCE 314
; Description: checks if a number is between two other numbers

(define (BetweenNums x y z)  ;x is the value checked, y is lower bound, z is upper bound
	display (and (> x y) (< x z))
	)

(define (main) (display (BetweenNums 2 1 3))
		(newline)
		(display (BetweenNums 1 2 3)) 
		)

(main)
(exit)
