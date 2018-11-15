(def graph (empty-graph))
(def graph (add-vertex graph :A))
(def graph (add-vertex graph :B))
(def graph (add-vertex graph :C))
(def graph (add-edge graph :A :B 7))
(def graph (add-edge graph :C :A 3))

(defn edge-label-func [g]
  (fn [a b] ((g :edges) [a b])) )

(defn shortest-path-length [g from to]
  (loop [vertexes (shortest-path g (fn [r] r) from to)
         i 0
         sum 0]
      (if (< (+ i 1) (count vertexes))
        (recur vertexes (+ i 1) (+ sum ((edge-label-func g) (get vertexes i) (get vertexes (+ i 1))) ))
        sum)))

(shortest-path-length graph :C :B)
