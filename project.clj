(defproject da-project "0.1.0-SNAPSHOT"
:description "haters gonna hate, hackers gonna hack"
:url "https://github.com/jmhawk/da-project.git"
:license {:name "Eclipse Public License"
          :url "https://www.eclipse.org/legal/epl-v10.html"}
:dependencies [[org.clojure/clojure "1.8.0"]]
:main ^:skip-aot my-stuff.core
:target-path "target/%s"
:profiles {:uberjar {:aot :all}})