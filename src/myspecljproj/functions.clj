(ns myspecljproj.functions)

(defn simple-func
  ([] "simple"))

(defn one-param-func 
  ([a] (str "You passed " a)))

(defn two-param-func
  "this is a two parameter function"
  ([a b] (str a "|" b)))


