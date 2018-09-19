(ns ch1.apollo)

(def mission-defaults {:orbits 0, :evas 0})

(defn make-mission
  [name system launched manned? opts]
  (let [{:keys [cm-name ;; command module
                lm-name ;; lunar module
                orbits
                evas]} (merge mission-defaults opts)]))

(def apollo-4
  (make-mission "Apollo 4"
                "Saturn 4"
                #inst "1967-11-09T12:00:01-00:00"
                false
                {:orbits 3}))

;; or

(defn make-mission-or-defaults
  [name system launched manned? & opts]
  (let [{:keys [cn-name ;; command module
                lm-name ;; lunar module
                orbits
                evas]
         :or {orbits 0, evas 0}} opts]
    ))
