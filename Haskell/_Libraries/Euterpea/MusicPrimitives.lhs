-- Brittni Watkins
-- 2 February 2017
-- Music Primitives in Haskell

> module MusicPrimitives where
> import Euterpea

> -- Prim (Note dur (PitchClass, Octave))

> twinkle:: Music Pitch
> twinkle = Prim (Note qn (C, 4)) :+: Prim (Note qn (C, 4))
>    :+: Prim (Note qn (G, 4)) :+: Prim (Note qn (G, 4))
>    :+: Prim (Note qn (A, 4)) :+: Prim (Note qn (A, 4))
>    :+: Prim (Note hn (G, 4))
