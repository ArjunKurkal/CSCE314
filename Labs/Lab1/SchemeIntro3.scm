; File: SchemeIntro3
; Author: Arjun Kurkal
; Date: 08/28/2022
; Class: CSCE 314
; Section: 599

(define (fact n) (if (< n 2) 1 (* n (fact (- n 1)))))
(trace fact)
(fact 5)


(define (fibo n) (if (< n 3) 1 (+ (- n 2) (fibo(- n 1)))))
(trace fibo)
(fibo (read))

(define (fib n) (if (< n 3) 1 ( + (fib (- n 1)) (fib ( - n 2)))))
(trace fib)
(fib (read))



(exit)
