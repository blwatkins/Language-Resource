import PythonEuterpea as pe

#60 = middle C
note = pe.Note(60)

rest = pe.Rest(0.25)

section = pe.Seq(note, rest)

measure = pe.Seq(section, section)

#MIDI file extension = '.MID'
pe.musicToMidi("myNote.MID", measure)