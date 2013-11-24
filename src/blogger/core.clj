(ns blogger.core
  (:import [com.google.api.client.googleapis.javanet GoogleNetHttpTransport]
           [com.google.api.services.blogger Blogger$Builder]
           [com.google.api.client.json.jackson2 JacksonFactory])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main []
  (let [builder (Blogger$Builder.
                  (GoogleNetHttpTransport/newTrustedTransport)
                  (JacksonFactory.)
                  nil)]
    (prn builder))
  (prn 'ok))
