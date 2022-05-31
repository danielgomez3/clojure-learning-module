(ns learning-guide.read-file)

(require '[clojure.java.io :as io]) ;This is so that we can load the options file from '/resources' dir

(defn read-content [arg]
  ;(println "DEBUG: read-content")
  (def string-var (slurp (io/resource arg)))
  (println string-var)
)
