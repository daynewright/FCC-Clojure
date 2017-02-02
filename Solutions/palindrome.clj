
(ns FreeCodeCamp)

(require '[clojure.string :as string])

(defn palindrome [word]
    (let [n (apply str (filter #(#{\0,\1,\2,\3,\4,\5,\6,\7,\8,\9} %) word))]
        (= (string/join "" (reverse n)) n)
    )
)

(print (palindrome "a man, a plan, a canal panama"))