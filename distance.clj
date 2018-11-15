(defn square [x]
  (* x x))

(defn distance [x1 y1 x2 y2]
  ( Math/sqrt 
    (+ (square (- x2 x1)) 
       (square (- y2 y1)) )))