(defproject blogger "0.1-SNAPSHOT"
  :description "library for blogspot.com (blogger) api 3"
  :url "http://example.com/FIXME"
  :license {:name "GNU GPL v3+"
            :url "http://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.google.apis/google-api-services-blogger "v3-rev25-1.17.0-rc"]
                 [com.google.http-client/google-http-client-jackson2 "1.17.0-rc"]]
  :aot :all
  :main blogger.core)
