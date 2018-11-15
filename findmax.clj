(defn findmax [s]
  (reduce #(if (> %2 %)
               %2
               %) 
          s))