import PythonEuterpea as pe

#60 = middle C
note = pe.Note(60, pe.EN)

rest = pe.Rest(pe.QN)

quarter = pe.Seq(note, note)

half = pe.Seq(quarter, rest)

measure = pe.Seq(half, half)

#MIDI file extension = '.MID'
pe.musicToMidi("mySong.MID", measure)
