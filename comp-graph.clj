(defn comp-graph [n]
  (loop [newGraph (empty-graph)
         m         0
         i         0
         j         1]
    (if(< m n)
      (recur (add-vertex newGraph (+ m 1))  (+ m 1) i j)
      (if (< i n)
        (if (< j n)
          (recur (add-edge newGraph (+ i 1) (+ j 1) :void) m i (+ j 1))
          (recur newGraph m (+ i 1) (+ i 2)))
        newGraph))))

(def edges (get-edges (comp-graph 4) ))
