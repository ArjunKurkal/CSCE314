; File: triple-everything.scm
; Written By: Arjun Kurkal
; Date: 9/11/2022
; TAMU email: arjunkurkal@tamu.edu
; Class: CSCE 314
; Description: take a list of numbers and return a list of the triple of each element

(define (triple-everything x)
    (if (null? x) x
        (cons (* (car x) 3) (triple-everything (cdr x)))
    )
)

(define (main) 
    (display (triple-everything '(8 33.5 4/5 5-2i)))
)

(main)
(exit)

