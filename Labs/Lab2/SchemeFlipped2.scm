; File: SchemeFlipped2.scm
; Written By: Nicole Magpantay
; Date: 9/3/2022
; TAMU email: magnipopam@tamu.edu
; Class: CSCE 314
; Description: displays parameter that is passed in

(define (simpleParameter x)
	(display x)
	)

(define (main)  (simpleParameter 0)
		(newline)
		(simpleParameter "hello")
		)

(main)
(exit)

