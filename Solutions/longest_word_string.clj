
(ns FreeCodeCamp)

(require '[clojure.string :as str])

(defn longestWord [s] (reduce (fn [a b]
    (if (> (count a) (count b)) a b))
      (str/split s #" ")))

(print (longestWord "The quick brown fox jumped over the lazy dog"))
