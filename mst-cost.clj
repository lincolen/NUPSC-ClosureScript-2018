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
(def points [a b c d])

(defn mst-cost [points] 
  (loop [edges (get-edges (minimal-spanning-tree (comp-graph  (count points)) #(+ %)))
         i 0
         sum 0]
    (if (< i (count edges))
           (recur edges (+ i 1) (+ sum (get (nth edges i) 2)) ) 
           sum)))


(mst-cost [1 2 3 7 4 2 0 9 6])
