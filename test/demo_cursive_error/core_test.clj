(ns demo-cursive-error.core-test
  (:require
    [clojure.test :refer :all]
    [ring.mock.request :as mr]
    [metrics.ring.instrument :as ri]
    [reitit.ring :as ring]
    [reitit.core :as r]))

(def test-api
  (ring/router
    [["" {:post {:name ::test
                 :handler (fn [& _]
                            (is true))}}]]))

(def router
  (ring/router
    [["/test" (r/routes test-api)]]))

(deftest min-test
  (let [handler (-> (ring/ring-handler router)
                    ri/instrument)]
    (-> (mr/request :post "/test")
        (handler))))
