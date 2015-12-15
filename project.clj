(defproject me.arnaudsj/cld "0.1.2"
  :description "Clojure Language Detection wrapper around langdetect java lib"
  :url "https://github.com/arnaudsj/cld"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.youcruit.com.cybozu.labs/langdetect "1.1.2-20151117"]]
  :profiles {:dev {:dependencies [[criterium "0.4.3"]]}}
  :resource-paths ["resources"]
  :global-vars {*warn-on-reflection* true
                *unchecked-math* :warn-on-boxed})
