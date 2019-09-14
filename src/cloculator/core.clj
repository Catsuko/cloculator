(ns cloculator.core
  (:gen-class))

(defn -main []
  (defn cloculate [expression] (clojure.string/split "Hello Hello" #" "))
  (doseq [item (cloculate "1 + 1")] (println item)))

  
  
