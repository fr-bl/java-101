@echo off

javac Spielfeld.java Spieler.java Spielelogik.java
 
set /p end="Press [Y] to quit the shell."

if %end% == "Y" exit
