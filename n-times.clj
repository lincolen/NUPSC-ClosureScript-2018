(defn n-times [n f]
  #(loop [m      0
         state   %]
    (if (< m n)
        (recur (+ m 1) (f state))
        state)))

;;assumes an extra external start state