(ns myspecljproj.core-spec
  (:require [speclj.core :refer :all]
            [myspecljproj.functions :refer :all]))

(describe "simple function"
  (it "returns a simple string"
  (should= "simple" (simple-func))))

(describe "Func with 1 param"
  (it "uses one parameter"
  (should= "You passed homer" (one-param-func "homer"))))
