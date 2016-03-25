(ns saying-hello)

(do
  (println "Hello, what is your name?")
  (flush)
  (let [stripWhitespace #(.replaceAll % "\\s+" "")
        line (read-line)
        name (stripWhitespace line)
        greeting (str "Hello, " name ", nice to meet you!")]
    (print greeting)))


