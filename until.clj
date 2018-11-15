(defn until [pred f]
  #(loop [state %]
    (if (pred state)
       state
       (recur (f state)))))
