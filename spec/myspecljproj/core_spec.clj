(ns myspecljproj.core-spec
  (:require [speclj.core :refer :all]
            [myspecljproj.core :refer :all]))

(describe "a test"
  (it "FIXME, I fail."
    (should= 1 1))
  (it " one plus one is two"
   (should= 2 (+ 1 1))))
