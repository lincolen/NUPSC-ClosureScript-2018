(defn factorial [n]
  (loop [m    1
         prod 1]
    (if (<= m n)
      (recur (+ m 1) (* prod m))
      prod)))