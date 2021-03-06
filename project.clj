(defproject clj-webdriver "0.2.7"
  :description "Clojure wrapper around Selenium-WebDriver library"
  :dependencies [[org.clojure/clojure "1.2.1"]
		 [org.seleniumhq.selenium/selenium-server "2.0b3"]]
  :dev-dependencies [[swank-clojure "1.3.0-SNAPSHOT"]
		     [marginalia "0.5.0"]
                     [ring "0.3.7"]
                     [enlive "1.0.0"]
                     [net.cgrand/moustache "1.0.0"]]
  :repositories {"selenium-repository", "http://selenium.googlecode.com/svn/repository/"})