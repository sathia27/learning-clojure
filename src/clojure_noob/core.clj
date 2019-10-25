(ns clojure-noob.core
  (:gen-class))

(defn test-my-function
  [parammeter]
  (if (= parammeter :works)
      "Parameter works"
      "Otherwise also works"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (if (or (= 1 2) (= 1 1))
    (do (println "I am learning if else. it works"))
    (do (println "bro u have'nt learnt yet")))
  (when (= 1 1)
    (println "This works crazy 1")
    (println "This works crazy 2"))
  (println (or nil false :tenerary_operator_works :this_sucks))
  (def variable-declaration-sample
     ["sathia", "vikki"])
  (println variable-declaration-sample))
  (println (test-my-function :works))
