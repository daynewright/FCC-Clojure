
(ns FreeCodeCamp)

(defn factorialize [n]
    (loop [n n
           acc 1]
    (if (= 0 n)
     acc
     (recur (dec n) (* n acc)))))

(print (factorialize 10))