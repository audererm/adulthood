(ns adulthood.core
  (:gen-class)
  (:require [clj-time.core :as t]))

(require '[clj-time.core :as t])

(defn -main
  "Print how many days left until I turn 18."
  [& args]
  (println "You have" 
           (t/in-days (t/interval (t/now) (t/date-time 2015 7 27)))
           "days remaining until adulthood."))