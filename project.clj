(defproject prone "0.1.0"
  :description "Better exception reporting middleware for Ring."
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[flare "0.1.1"]]
                   :injections [(require 'flare.clojure-test)
                                (flare.clojure-test/install!)]}})
