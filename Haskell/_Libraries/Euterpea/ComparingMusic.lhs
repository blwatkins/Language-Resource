-- Brittni Watkins
-- 2 February 2017
-- Comparing Music

> module ComparingMusic where
> import Euterpea

> twinkle = c 4 qn :+: c 4 qn
>     :+: g 4 qn :+: g 4 qn
>     :+: a 4 qn :+: a 4 qn
>     :+: g 4 hn

> twinkle2 = (c 4 qn :+: c 4 qn
>     :+: g 4 qn :+: g 4 qn)
>     :+: (a 4 qn :+: a 4 qn
>     :+: g 4 hn)

> -- comparing tree structures
> equal_trees = twinkle == twinkle2

> -- comparing sound
> equal_sound = perform twinkle == perform twinkle2
