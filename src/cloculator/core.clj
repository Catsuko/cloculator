(ns cloculator.core
  (:gen-class))

(defn -main []
  (println "Please enter your expression:")
  (println ">")
  (println(str "Answer is: " (read-line))))
