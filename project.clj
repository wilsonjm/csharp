(defproject com.lighttable/csharp "0.0.1"
 :description "CSHARP language plugin for Light Table"
  :plugins [[lein-cljsbuild "0.2.7"]]
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :cljsbuild {
  :builds [{
  :source-path "src/lt/plugins"
  :compiler {
  :output-to "csharp_compiled.js"
  :optimizations :advanced
  :pretty-print true}}]})

