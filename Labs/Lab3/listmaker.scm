; File: listmaker.scm
; Written By: Arjun Kurkal
; Date: 9/11/2022
; TAMU email: arjunkurkal@tamu.edu
; Class: CSCE 314
; Description: take an integer argument n and return a list from 0 to n - 1

(define (listmaker n)
    (if (= n 1) (list 0)
        (append (list (- n 1)) (listmaker (- n 1)))
    )
)

(define (main)
    (display (listmaker 99))
    (newline)
    (display (listmaker 7))
    (newline)
    (display (listmaker 9))
)

(main)
(exit)