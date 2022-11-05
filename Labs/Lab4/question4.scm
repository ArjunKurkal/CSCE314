#lang racket
(define (deeplist-merger func list1 list2)
    (map max list1 list2)
)

(define (list-max list1 list2)
    (deeplist-merger max list1 list2)
)

(define (max x y)
    (if (not (list? x))
        (if (> x y) x y)
        (map max x y)
    )
)

(display (list-max '(3 (1) 3) '(3 (4) 2)))
(newline)
(display (list-max '(3 (1) 3 (1 2 3 (2 3 4))) '(3 (4) 2 (2 3 1 (8 3 2)))))
