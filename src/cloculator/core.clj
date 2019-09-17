(ns cloculator.core
  (:gen-class))

(defn -main []
  (defn sqrs [n]
    (->> (range)
         (map #(* % %))
         (filter even?)
         (take n)))
  ;;(0 4 16)
  (println (sqrs 3))
  ;;(0 4 16 36 64 100 144 196 256 324)
  (println (sqrs 10)))
  

    
  

  
  
