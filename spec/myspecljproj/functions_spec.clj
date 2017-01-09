(ns myspecljproj.core-spec
  (:require [speclj.core :refer :all]
            [myspecljproj.functions :refer :all]))

(describe "simple function"
          (it "returns a simple string"
              (should= "simple" (simple-func))))

(describe "Func with 1 param"
          (it "uses one parameter"
              (should= "You passed homer" (one-param-func "homer"))))

(describe "func with 2 params"
          (it "uses two parameters"
              (should= "clo|jure" (two-param-func "clo" "jure"))))

(describe "multi-arity function"
          (it "multiplies by 2 with parameter"
              (should= 10 (multi-arity 5)))
          (it "adds to each other with two parameters" 
              (should= 7 (multi-arity 5 2)))
          )

(describe "default parameter using recursion"
          (it "simulates use of default parameter"
              (should= "hello|bye" (default-parameter "hello" ))))
