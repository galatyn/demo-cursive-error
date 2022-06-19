(defproject demo-cursive-error "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-mock "0.4.0"]
                 [metrics-clojure-ring "2.10.0"]
                 [metosin/reitit-ring "0.5.18"]
                 [metosin/reitit-core "0.5.18"]]
  :repl-options {:init-ns demo-cursive-error.core})
