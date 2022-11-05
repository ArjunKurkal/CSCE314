#lang racket
(define (square-number lst)
  (map (lambda (x) (expt x 2)) lst)
)

(define (even-square-number lst)
  (filter even? (square-number lst))
)

(display (even-square-number '(1 2 3 4)))