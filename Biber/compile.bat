@echo off

javac Biber.java Teller.java Queue.java Stack.java BiberEssensAusgabe.java
 
set /p end="Press [Y] to quit the shell."

if %end% == "Y" exit
