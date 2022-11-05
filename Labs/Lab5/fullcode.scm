(define (leaf? node)
  (null? (children node)))

(define (datum node)
  (car node))

(define (children node)
  (cdr node))

(define (count-leaves tree)
  (if (leaf? tree)
      1
      (count-leaves-in-forest (children tree))
  )
)

(define (count-leaves-in-forest forest)
  (if (null? forest)
      0
      (+ (count-leaves (car forest))
         (count-leaves-in-forest (cdr forest)))
  )
)

(define (count-helper tree)
  (if (null? tree)
      0
      (+ (count-nodes (car tree))
         (count-helper (cdr tree)))
      )
  )
 
(define (count-nodes forest)
  (if (leaf? forest)
      0
      (+ (count-helper (children forest))1)
  )
  )
  

(define (make-node datum children)
  (cons datum children))

(define (leaf datum)
  (make-node datum '())
)

(define (cities name-list)
  (map leaf name-list)
)

(define (in-tree? place tree)
  (or (equal? place (datum tree))
      (in-forest? place (children tree))
  )
)

(define (in-forest? place forest)
  (if (null? forest)
      #f
      (or (in-tree? place (car forest))
	    (in-forest? place (cdr forest)))
  )
)

(define (locate city tree)
  (if (equal? city (datum tree))
      tree
      (let ((subpath (locate-in-forest city (children tree))))
        (if subpath
            subpath
            #f))))

(define (locate-in-forest city forest)
  (if (null? forest)
      #f
      (or (locate city (car forest))
	  (locate-in-forest city (cdr forest)))))

(define (left-most forest)
  (if (leaf? forest)
      forest
      (left-most (car(children forest)))
      )
  )

(define (last-node list)
  (if (null? (cdr list)) list
      (last-node (cdr list))
  )
)

(define (last-helper path)
  (if (null? (cdr(path)))
      (if (null? (children(car(path))))
          null
          (last-node(children(car(path)))))
      (cdr path))
  )
      
  
 
(define (last-in-country country forest)
  (last-helper (children(locate country forest)))
  )

  
(define (find-replace city1 city2 list)
 (cond
  ((null? list) '())
  ((list? (car list)) (cons (find-replace city1 city2 (car list)) (find-replace city1 city2 (cdr list))))
  ((eq? (car list) city1) (cons city2 (find-replace city1 city2 (cdr list))))
  (else
  (cons (car list) (find-replace city1 city2 (cdr list))))))
      

(define world-tree2
  (make-node
   'world
   (list (make-node
          'italy
          (cities '(venezia riomaggiore firenze roma)))
         (make-node
          '(united states)
          (list (make-node
                 'california
                 (cities '(berkeley (san francisco) gilroy)))
                (make-node
                 'massachusetts
                 (cities '(cambridge amherst sudbury)))
                (make-node 'ohio (cities '(kent)))))
         (make-node 'zimbabwe (cities '(harare hwange)))
         (make-node 'china
		        (cities '(beijing shanghai guangzhou suzhou)))
         (make-node
          '(great britain)
          (list 
           (make-node 'england (cities '(liverpool)))
           (make-node 'scotland
		            (cities '(edinburgh glasgow (gretna green))))
           (make-node 'wales (cities '(abergavenny)))))
         (make-node
          'australia
          (list
           (make-node 'victoria (cities '(melbourne)))
           (make-node '(new south wales) (cities '(sydney)))
           (make-node 'queensland
		            (cities '(cairns (port douglas))))))
         (make-node 'honduras (cities '(tegucigalpa))))))


(display (datum (car (children (caddr (children (cadr(children world-tree2))))))))
(newline)
(display (count-nodes world-tree2))
(newline)
(display (datum(left-most world-tree2)))
(newline)
(children(locate 'australia world-tree2))
(newline)
(find-replace 'roma 'hi world-tree2)