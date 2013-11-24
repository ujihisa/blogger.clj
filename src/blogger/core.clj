(ns blogger.core
  (:import [com.google.api.client.googleapis.javanet GoogleNetHttpTransport]
           [com.google.api.services.blogger Blogger$Builder
                                            BloggerRequestInitializer]
           [com.google.api.client.json.jackson2 JacksonFactory])
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(def API-KEY "aaa")

(defn -main []
  (let [builder (doto (Blogger$Builder.
                        (GoogleNetHttpTransport/newTrustedTransport)
                        (JacksonFactory.)
                        nil)
                  (.setApplicationName "blogger.clj")
                  (.setGoogleClientRequestInitializer
                    (BloggerRequestInitializer. API-KEY)))
        blogger (.build builder)]
    (prn 'builder builder)
    (prn 'blogger blogger))
  (prn 'ok))
