@echo off

javac Katze.java Mensch.java Saeugetier.java Main.java
 
set /p end="Press [Y] to quit the shell."

if %end% == "Y" exit
