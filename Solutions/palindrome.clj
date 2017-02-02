
(ns FreeCodeCamp)

(require '[clojure.string :as string])

(defn palindrome [word]
    (= (string/join "" (reverse word)) word)
)

(print (palindrome "racecar"))