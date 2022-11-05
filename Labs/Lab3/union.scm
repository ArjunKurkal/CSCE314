; File: union.scm
; Written By: Arjun Kurkal
; Date: 9/11/2022
; TAMU email: arjunkurkal@tamu.edu
; Class: CSCE 314
; Description: return the union of two lists

(define (contains lst z)
    (cond ((null? lst) #f)
        ((equal? (car lst) z) #t)
        (else (contains (cdr lst) z))
    )
)

(define (union x y)
    (if (null? y) x
        (if (contains x (car y))
            (union x (cdr y))
        )
        (else
            (cons x (car y))
            (union (x cdr y))
            )
    )
)

(define (main)
    (display (union '(0 1 2 3) '(0 1 2 5 8 9)))
)

(main)
(exit)