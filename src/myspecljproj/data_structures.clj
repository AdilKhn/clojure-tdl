(ns myspecljproj.data_structures)
(defn hello [a]
  (str "hello " a))

(def fruit-count {
  :apple 10
  :bananas 20
  :pears 3
  })

(defn get-fruit-count [my-key]
  (get fruit-count my-key 0))

(def my-vector ["homer", "bart", "lisa", "marge", "maggie"])

(def my-list '(1 2 "homer" "marge"))

(def my-set (hash-set "homer" "marge" 1 1 "homer" 2 "bart" "marge"))
