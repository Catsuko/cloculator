(ns cloculator.core
  (:gen-class))

(defn -main []
  (defn parseNum [item] 
    (if (re-matches #"\A\d*\z" item) (Integer/parseInt item) item))
  (defn tokenize [expression] 
    (map parseNum (clojure.string/split expression #"\b")))
  (defn simplify [tokens] 
    ((resolve (symbol (nth tokens 1))) 
     (nth tokens 0) 
     (nth tokens 2)))
  (println "Enter an expression below:")
  (println)
  (println (simplify (tokenize (read-line)))))
  

  
  
