main = apply(fact,10)

fact n = if n == 0 then 1 else  n * apply(fact, (n - 1))
