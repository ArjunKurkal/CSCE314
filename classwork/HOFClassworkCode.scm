(define (curry-sub f) 
    (lambda (x) 
        ( lambda (y) 
            ( lambda (z) 
                ( (f x (+ y z)) ) ) ) ) ) 



(display ((((curry-sub -) 15) 5) 1))