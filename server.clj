(ns server
  (:require [compojure.core :refer [defroutes routes GET POST]]
            [compojure.route :as route]
            [ring.util.response :refer [response not-found]]
            [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.json :refer [wrap-json-response]]))


(defroutes public-routes
  (GET "/info" _req
    (response (merge {:status 200
                      :message "look at us go"})))

  (route/not-found (response {:message "not found"})))

(def app (-> (routes public-routes)
             (wrap-json-response)
             (wrap-params)))