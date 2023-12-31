@echo off
set path=%PATH%;C:\Program Files\Java\jdk-19\bin
pause
javac
echo Your java Path succsussfully set.
javac %Name%classes/Main.java
pause
echo Successfully Compiled
java %Name%classes/Main
pause