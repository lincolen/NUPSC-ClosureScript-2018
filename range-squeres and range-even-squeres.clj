(defn range-squares [n]
  (map #(* % %) (range n)))

(defn range-even-squares [n]
  (filter #(= (mod % 2) 0) (range-squares n)))