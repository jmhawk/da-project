(ns main
  (:require [ring.adapter.jetty :as jetty]
            [server :as server]))

(defn devmain
  []
  (def server (jetty/run-jetty server/app {:port 8080 :join? false})))