(defn square [x]
  (* x x))

(defn qsolve [a b c]
  (if  (< (- (square b)
             (* 4 a c))
          0)
        0
        (/ (+ (- 0 b) 
              (Math/sqrt (- (square b)
                            (* 4 a c))))
           (* 2 a))))

(defn qsolve [a b c]
  (if  (< (- (square b)
             (* 4 a c))
          0)
    
        []
    
        [(/ (+ (- 0 b) 
              (Math/sqrt (- (square b)
                            (* 4 a c))))
            (* 2 a))
         (/ (- (- 0 b) 
              (Math/sqrt (- (square b)
                            (* 4 a c))))
            (* 2 a))])) 