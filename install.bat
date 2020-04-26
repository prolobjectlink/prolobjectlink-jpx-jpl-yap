@echo off

SET CURRENT_DIRECTORY=%~dp0
SET CLASSPATH=%CURRENT_DIRECTORY%lib\*

: default jdk
java -classpath %CLASSPATH% io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -g
java -classpath %CLASSPATH% io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -s
