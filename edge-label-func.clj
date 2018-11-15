(def graph (empty-graph))
(def graph (add-vertex graph :A))
(def graph (add-vertex graph :B))
(def graph (add-vertex graph :C))
(def graph (add-edge graph :A :B 7))
(def graph (add-edge graph :A :C 3))

(defn edge-label-func [g]
  (fn [a b] ((g :edges) [a b])) )

((edge-label-func graph) :A :C) 
