(defproject foobaz "0.1.0-SNAPSHOT"
  :description "Name says it all"
  :url "https://github.com/gamma235/foobaz"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot foobaz.core
  :aot [foobaz.core])
