(defn factorial [n]
  (reduce * (map #(+ 1 %) (range n))))
