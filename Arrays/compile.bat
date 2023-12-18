@echo off

javac Laeufer.java Wettlauf.java
 
set /p end="Press [Y] to quit the shell."

if %end% == "Y" exit
