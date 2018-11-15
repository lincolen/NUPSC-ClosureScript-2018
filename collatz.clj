(defn fcollatz [prev]
  (if(> prev 1)
    (if(= (mod prev 2) 0)
       (/ prev 2)
       (+ (* 3 prev) 1))
    1))

(defn until [pred f]
  #(loop [state %]
    (if (pred state)
       state
       (recur (f state)))))

(defn check-collatz [n] 
  (if (> n 0)
  (loop [m n]
    (if( = m 0)
       true
       (if (= ((until #(= % 1) fcollatz ) m) 1) 
                                              ;feels redundent   
           (recur (- m 1))
           false)))
    nil))

;;will never return false, would rather enter an infinte loop
