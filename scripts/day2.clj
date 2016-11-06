; Sequence
(every? number? [1 2 3 :four])
(every? number? [1 2 3])
(some nil? [1 2 nil])
(some nil? [1 2])
(not-ecery? odd? [1 3 5])
(not-every? odd? [1 3 5])
(not-every? odd? [:1])
(not-every? odd? [1])
(not-every? odd? ["a"])
(not-every? odd? [1])
(def words ["luke" "chewie" "han" "lando"])
(filter (fn [word] (> (count word) 4) words)
(filter (fn [word] (> (count word) 4)) words)
(def colors ["red" "blue"])
(def toys ["block" "car"])
(for [x colors] (str "I like " x))
(for [x color, y toys] (str "I like " x " " y "s"))
(for [x colors, y toys] (str "I like " x " " y "s"))
(defn small-word? [w] (< (count w) 4))
(for [x colors, y toys, :when (small-words? y)] (str "I like " x " " y "s"))
(for [x colors, y toys, :when (small-word? y)] (str "I like " x " " y "s"))

; Lazy evaluation
(renge 1 10)
(range 1 10)
(range 1 10 3)
(range 10)
(take 3 (repeat "Use the Force, Luke"))
(take 5 (cycle [:lather :rinse :repeat]))
(take 5 (drop 2 (cycle [:lather :rinse :repeat])))
(->> [:lather :rinse :repeat] (cycle) (drop 2) (take 5))
(->> [:lather :rinse :repeat] (cycle))
(->> [:lather :rinse :repeat] (cycle) (drop 2) )
(->> [:lather :rinse :repeat] (cycle) (take 5))
(->> [:lather :rinse :repeat] (cycle) (take 5000))
(take 5 (interpose :and (cycle [:lather :rinse :repeat])))
(take 20 (interleave (cycle (range 2)) (cycle (range 3)))
)
(take 5 (iterate inc 1))
(take 5 (iterate dec 0))
(defn fib-pair [[a b]] [b (+ a b)])
(fib-pair [3 5])
(defprotocol Compass
 (direction [c])
 (left [c])
 (right [c]))
(def directions [:north :east :south :west])
(defn turn
 [base amunt]
 (rem (+ base amunt) (count directions)))
(turn 1 1)
(turn 3 1)
(turn 2 3)
(defrecord SimpleCompass [bearing] Compass)
(direction [_] (directions bearing))

; Macro
(defn unless [test body] (if (not test9 body))
(defn unless [test body] (if (not test) body))
(unless true (println "Denget"))
(macroexpand ''something-we-do-not-want-interpreted)
(macroexpand '#(count %))
(defmacro unless [test body] (list 'if (list 'not test) body))
(macroexpand '(1 2 3))
(macroexpand ''(1 2 3))
(macroexpand #(count %))
(defmacro unless [test body] (list 'if (list 'not test) body))
(macroexpand '(unless condition body))
(unless true (println "Hoge"))
(unless false (println "Hoge"))
