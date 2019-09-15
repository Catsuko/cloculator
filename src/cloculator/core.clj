(ns cloculator.core
  (:gen-class))

(defn -main []
  (defn parse-int [s] (Integer. (re-find  #"\d+" s)))
  (defn evaluate_operator [expression, operator]
    ((resolve (symbol operator)) (parse-int expression) (parse-int (subs expression 2))))
  (defn cloculate [expression] 
    (evaluate_operator expression "+"))
  (println (cloculate "1+1")))

  
  
