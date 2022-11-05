; File: remove-item.scm
; Written By: Arjun Kurkal
; Date: 9/11/2022
; TAMU email: arjunkurkal@tamu.edu
; Class: CSCE 314
; Description: removes an item from a list

(define (flatten list)
        (cond ((null? list) `())
        ((list? (car list)) (append (flatten (car list)) (flatten (cdr list))))
        (else (cons (car list) (flatten (cdr list))))
))

(define (remove arr elem)
        (if (null? arr) arr
        (if (equal? elem (car arr)) (remove (cdr arr) elem)
        (cons (car arr) (remove (cdr arr) elem))))
        )

(define (remove-item arr elem)
        (remove (flatten arr) elem)
        )

(define (main) (display (remove-item '((1)(2 3)(4 5 6)) 5))
                (newline)
                (display (remove-item '(5 2 9 5 1 (2 5)) 2))
)

(main)
(exit)