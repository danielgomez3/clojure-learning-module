"
Sucessfuly added namespace, you can run this code with the command:
> lein run
Make sure 'learning_guide' is the parent file
"
(ns learning-guide.core
  (:gen-class)
  (:use [learning-guide.prompt-user :as pu])
)



(defn -main [& args]
  ;(println "DEBUG: main")
  (pu/greet)
)
