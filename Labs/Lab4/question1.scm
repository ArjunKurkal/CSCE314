#lang racket
(define (exist? x lst)

(cond

((null? lst) #f)

((eq? x (car lst)) #t)

(#t (exist? x (cdr lst)))

)
)

;(display (exist? 2 '(2 3 4)))
;(newline)
;(display (exist? 1 '(2 3 4)))


(define (set-difference lst1 lst2)
  (cond
    ((null? lst1) '())
    ((not (exist? (car lst1) lst2)) (cons (car lst1) (set-difference (cdr lst1) lst2)))
    ((set-difference (cdr lst1) lst2)))
)
(newline)
(display (set-difference '(1 2 3 -4) '(4 -1 2 5)))

(newline)

(display (set-difference '(5 6 7 8) '(1 2 3)))

(newline)