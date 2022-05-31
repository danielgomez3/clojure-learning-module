(ns learning-guide.prompt-user
  (:use[learning-guide.read-file :as rf])
)


;; (defn evaluate-option [arg]
;;    (if-let [result (compare arg "1")]
;;   (println "You entered:" result)
;;   (println "Please enter valid option")))

;TODO: make this a bool
(defn evaluate [arg]
   (cond
  (= arg "5") (rf/read-content "anonfuncs.txt")
  (= arg "4") (rf/read-content "apply.txt")
  (= arg "3") (rf/read-content "partial.txt")
  (= arg "2") (rf/read-content "sequences.txt")
  (= arg "1") (rf/read-content "tailrecursion.txt")
  (= arg "0") (do (rf/read-content "exit.txt") (System/exit 0))
  :else (println "Please enter valid input"))
)

(defn greet []
  ;TODO: put loop and recur right here
  (loop [sentinel false]
  (rf/read-content "options.txt")
  (def response (str(read-line)))
  (evaluate response)
  ;TODO: if response returns true, print what they entered.
  ;else, recur back to top
  (recur ())
)
)



  ;(println "DEBUG: greet")
;(println "You entered:" arg)
