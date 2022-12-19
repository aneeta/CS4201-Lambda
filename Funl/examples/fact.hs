main = apply(fact,3)

fact n = if n == 0 then 1 else  n * apply(fact, (n - 1))
