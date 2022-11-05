#lang racket
(define (grand-slam name)

   (cond

     ((eq? name "Wimbledon") (display "It's played on grass court\n"))

     ((eq? name "US Open") (display "It's played on hard court!\n"))

     ((eq? name "French Open ") (display "It’s played on clay court\n"))

     ((eq? name "Australian Open") (display "It's played on grass court\n"))
     ((display "Does not exist \n"))

     )
  )

(grand-slam "Wimbledon")

(grand-slam "APT Tour")