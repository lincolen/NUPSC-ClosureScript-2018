(def names [:alice :steve :jacob :john])
(def ages [7 10 17 16])

;;without order correction using a loop
(defn table->map [names ages]
  (loop [newMap {}
         n (count names)]
    (if (> n 0)
      (recur (assoc newMap (get names (- (count names) n)) ( get ages (- (count names) n))) 
             (- n 1))
      newMap)))

;;with order correction using loop
(defn table->map [names ages]
  (loop [newMap {}
         n 0]
    (if (< n (count names))
      (recur (assoc newMap (get names n) ( get ages n)) 
             (+ n 1))
      newMap)))

;;by recursion
(defn table->map [names ages]
  (if (empty? names)
    {}
    (assoc (table->map (drop-last names) (drop-last ages))    (last names) (last ages))))

(table->map names ages)