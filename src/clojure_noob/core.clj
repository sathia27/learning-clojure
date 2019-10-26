(ns clojure-noob.core
  (:gen-class))

(defn test-my-function
  [parammeter]
  (if (= parammeter :works)
      "Parameter works"
      "Otherwise also works"))

(defn test-destructuring
  [[name1 name2 & other_names]]
  (println (clojure.string/join ", " [name1 name2]))
  (println (clojure.string/join ", " other_names)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (println "\n1. Learning if else")
  (if (or (= 1 2) (= 1 1))
    (do (println "I am learning if else. it works"))
    (do (println "bro u have'nt learnt yet")))

  (println "\n2. Learning when")
  (when (= 1 1)
    (println "This works crazy 1")
    (println "This works crazy 2"))

  (println "\n3. Learning one line if-else")
  (println (or nil false :tenerary_operator_works :this_sucks))

  (println "\n4. Learning variable declaration")
  (def variable-declaration-sample
     ["sathia", "vikki"])
  (println variable-declaration-sample)

  (println "\n5. Learning function")
  (println (test-my-function :works))

  (println "\n6. Learning vector, list, maps")
  ;vecors are same as in other languages
  ;maps are like dictionary in python, hash in ruby
  (def my-vector
     (vector :sathia :vikki))
  (println (get my-vector 0))
  (def my-map
    (hash-map :first-key 10 :second-key 20))
  (println (get my-map :first-key))

  (println "\n7. Learning destructuring")
  ;this let's you bind values within collection
  (println (test-destructuring [:sathia, :vikki, :test1, :test2])))
