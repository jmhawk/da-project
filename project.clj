(defproject da-project "0.1.0-SNAPSHOT"
:description "haters gonna hate, hackers gonna hack"
:url "https://github.com/jmhawk/da-project.git"
:license {:name "Eclipse Public License"
          :url "https://www.eclipse.org/legal/epl-v10.html"}
:dependencies [[org.clojure/clojure "1.8.0"]
               [org.clojure/tools.cli "1.0.194"]
               [ring "1.9.4"]
               [ring/ring-json "0.5.1"]
               [cheshire "5.10.1"]
               [compojure "1.6.2"]
               [clj-http "3.12.3"]]
:main ^:skip-aot my-stuff.core
:target-path "target/%s"
:profiles {:uberjar {:aot :all}})