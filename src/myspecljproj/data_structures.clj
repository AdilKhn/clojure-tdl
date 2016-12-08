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
