(ns myspecljproj.functions)

(defn simple-func
  ([] "simple"))

(defn one-param-func 
  ([a] (str "You passed " a)))

(defn two-param-func
  "this is a two parameter function"
  ([a b] (str a "|" b)))

(defn multi-arity
  "this function is overloaded"
  ([ one-argument-to-multiply ]
   (* one-argument-to-multiply  2))
  ( [two-arguments get-added]
   (+ two-arguments get-added)))

(defn default-parameter
  "this is recursive" 
  ([start end] 
   (str start "|" end))
  ([start]
   (default-parameter start "bye")))
