(defn prod [s]
  (loop [l   s 
         prod 1] 
        (if (empty? l)
            prod
            (recur (rest l) (* prod (first l) )))))