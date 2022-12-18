main = apply(fib, x) where x = 42

fib n = if n == 0 then 0
        else if n == 1 then 1 else apply(fib, (n - 1)) + apply(fib, (n - 2))