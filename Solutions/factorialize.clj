
(ns FreeCodeCamp)

(defn factorize [n]
    (loop [n n
           acc 1]
    (if (= 0 n)
     acc
     (recur (dec n) (* n acc)))))

(print (factorize 10))