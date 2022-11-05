; File: SchemeFlipped4.scm
; Written By: Nicole Magpantay
; Date: 09/03/2022
; TAMU email: magnipopam@tamu.edu
; Class: CSCE 314
; Description: returns 15 percent of a total

(define (fifteen-percent x)
	(* x .15)
	)

(define (main) (display (fifteen-percent 100)) ;should be 15
		(newline)
		(display (fifteen-percent 50.0)) ;should be 7.5
		)

(main)
(exit)
