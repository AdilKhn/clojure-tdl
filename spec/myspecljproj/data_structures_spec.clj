(ns myspecljproj.core-spec
  (:require [speclj.core :refer :all]
            [myspecljproj.core :refer :all]
            [myspecljproj.data_structures :refer :all]))

(describe "Data Structures Module"
(it "hello method in data structures module gets called"
           (should= "hello yo" (hello "yo"))))

(describe "Maps"
(it "Use get to get a value for the key in map"
          (should= 20 (get fruit-count :bananas)))

(it "Can use indexed key to get the value"
  (should= 3 (:pears fruit-count)))

(it "gets a default value if key isnt found"
  (should= 0 (get-fruit-count :mango))))

(describe "Vectors"
(it "gets the first element using index 0"
  (should= "homer" (get my-vector 0)))
(it "create a vector using the vector keyword"
  (should= [ 1 2 ] (vector 1 2 ) ))
(it "add additional elements to end of vector using conj"
  (should= [1 2 3] (conj [1 2] 3))))

(describe "Lists"
(it "creates a list using the single quote"
  (should= '(1 2 "homer" "marge") my-list))
(it "gets an element using the nth function"
  (should= "foo" (nth '("foo" "fee") 0)))
(it "conj function adds elements to start of a list"
  (should= '("a" "b" "c") (conj '("b" "c") "a"))))
