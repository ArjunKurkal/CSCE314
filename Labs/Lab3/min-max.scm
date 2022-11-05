; File: min-max.scm
; Written By: Arjun Kurkal
; Date: 9/11/2022
; TAMU email: arjunkurkal@tamu.edu
; Class: CSCE 314
; Description: return the biggest and smallest values in a list


(define (min-list-value x)
    (if (null? (cdr x))
        (car x)
        (if (< (car x) (min-list-value (cdr x)))
            (car x)
            (min-list-value (cdr x))
        )
    )
)


(define (max-list-value x)
    (if (null? (cdr x))
        (car x)
        (if (> (car x) (max-list-value (cdr x)))
            (car x)
            (max-list-value (cdr x))
        )
    )
)

(define (min-max-list-value x)
    (cons (min-list-value x) (list (max-list-value x)))
)

(define (main) 
    (display (min-max-list-value '(1 2 3 4)))
    (newline)
    (display (min-max-list-value '(0 1 2 3 4 6)))
)

(main)
(exit)

