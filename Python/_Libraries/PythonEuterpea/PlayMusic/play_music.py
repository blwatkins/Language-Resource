from MusicPlayer import *
from SimpleMelodies import *

# open simple synth
# output 1
m = MusicPlayer(1)
m.printDevices()
m.playMusic(row)
m.playMusic(yankee)
m.close()