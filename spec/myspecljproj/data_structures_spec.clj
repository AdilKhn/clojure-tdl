(ns myspecljproj.core-spec
  (:require [speclj.core :refer :all]
            [myspecljproj.core :refer :all]
            [myspecljproj.data_structures :refer :all]))

(describe "Data Structures Module"
(it "hello method in data structures module gets called"
           (should= "hello yo" (hello "yo"))))

(describe "Maps"
(it "Use get to get a value for the key in map"
          (should= 20 (get fruit-count :bananas))))
