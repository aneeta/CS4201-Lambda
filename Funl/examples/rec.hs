main = apply(rec, x) where { x = 5 }

inner x = if x <= 0 then 0 else apply(inner, (x-1))

rec n = if n <= 0 then 0 else apply(inner, apply(rec, n-2))