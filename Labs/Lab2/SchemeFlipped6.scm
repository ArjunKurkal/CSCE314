; File: SchemeFlipped6.scm
; Written By: Nicole Magpantay
; Date: 09/03/2022
; TAMU email: magnipopam@tamu.edu
; Class: CSCE 314
; Description: takes in the radius of a circle and returns the area

(define (CircleArea x)
	(* 3.14 x x)
	)

(define (main) (display (CircleArea 2))
		(newline)
		(display (CircleArea 4))
		)

(main)
(exit)
