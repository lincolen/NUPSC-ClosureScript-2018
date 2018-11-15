(defn sum-even [n]
  (loop [m   0
         sum 0]
    (if (< m (+ n 1))
        (if (= (mod m 2) 0)
            (recur (+ m 1) (+ sum m))
            (recur (+ m 1) sum))
        sum)))
