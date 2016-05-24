(ns foobaz.core
  (:gen-class))

(defn -main []
  (doseq [n (range 1 101)]
    (cond (and (== (mod n 3) 0) (== (mod n 5) 0)) (println "FooBaz")
          (== (mod n 3) 0) (println "Foo")
          (== (mod n 5) 0) (println "Baz")
          :else
          (println n))))
