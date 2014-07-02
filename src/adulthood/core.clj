(ns adulthood.core
  (:gen-class)
  (:require [clj-time.core :refer [in-days interval date-time]]))


(defn time-til [when]
  (in-days (interval (now) when)))

(defn -main
  "Print how many days left until I turn 18."
  [& args]
  (println "You have" 
           (time-til (date-time 2015 7 27))
           "days remaining until adulthood."))
