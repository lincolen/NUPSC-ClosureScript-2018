(defn sum [s]
  (loop [l   s
         sum 0]
    (if (empty? l)
        sum
        (recur (rest l) (+ sum (first l))))))