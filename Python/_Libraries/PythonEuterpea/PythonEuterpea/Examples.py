'''
Some example melodies in PythonEuterpea using different tree structures.
Donya Quick

Alterations made by Brittni Watkins
'''

from PythonEuterpea import EN, SN, QN, DQN, HN
from PythonEuterpea import pdPairsToMusic, pitchListToMusic, chordListToMusic, chord, line

# Another tree structure for the same thing. This creates inner nodes that
# represent two-measure chunks. Subtrees within that are still skewed.

mcdonaldPs2 = [
    [60,60,60,55,57,57,55,64,64,62,62,60,55],
    [60,60,60,55,57,57,55,64,64,62,62,60,55,55],
    [60,60,60,55,55,60,60,60],
    [60,60,60,60,60,60],
    [60,60,60,60,60,60],
    [60,60,60,55,57,57,55,64,64,62,62,60]
]

mcdonaldDs2 = [
    [EN,EN,EN,EN,EN,EN,QN,EN,EN,EN,EN,DQN,EN],
    [EN,EN,EN,EN,EN,EN,QN,EN,EN,EN,EN,DQN,SN,SN],
    [EN,EN,EN,SN,SN,EN,EN,QN],
    [SN,SN,EN,SN,SN,EN],
    [SN,SN,SN,SN,EN,EN],
    [EN,EN,EN,EN,EN,EN,QN,EN,EN,EN,EN,HN]
]

mcdonald2 = line(map(lambda x: pdPairsToMusic(zip(x[0], x[1])), zip(mcdonaldPs2, mcdonaldDs2)))

# "Another tree structure for "This Old Man"

oldmanPs2 = [
    [67,64,67,67,64,67],
    [69,67,65,64,62,64,65,64,65],
    [67,60,60,60,60,62,64,65,67],
    [67,62,62,65,64,62,60]
]
oldmanDs2 = [
    [EN,EN,QN,EN,EN,QN],
    [EN,EN,EN,EN,EN,EN,EN,SN,SN],
    [EN,EN,EN,EN,SN,SN,SN,SN,QN],
    [EN,EN,EN,EN,EN,EN,QN]
]
oldman2 = line(map(lambda x: pdPairsToMusic(zip(x[0], x[1])), zip(oldmanPs2, oldmanDs2)))


# Just some chords. It is represented two ways: a sequence of chords, and a parallel
# composition of 3 melodies.

#          C  E  G     A  C  E     C  E  G     B  D  G     C  E  G     C  F  A     B  F  G     C  E  G
chords = [[60,64,67], [57,60,64], [60,64,67], [59,62,67], [60,64,67], [60,65,69], [59,65,67], [60,64,67]]

chordMusic1 = chordListToMusic(chords, QN) # this is an outer sequential composition of parallels

mel1 = pitchListToMusic([60, 57, 60, 59, 60, 60, 59, 60], QN)
mel2 = pitchListToMusic([64, 60, 64, 62, 64, 65, 65, 64], QN)
mel3 = pitchListToMusic([67, 64, 67, 67, 67, 69, 67, 67], QN)
chordMusic2 = chord([mel1,mel2,mel3]) # this is an outer parallel composition of sequentials
