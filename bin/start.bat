@echo off

SET CURRENT_DIRECTORY=%~dp0
for %%B in (%CURRENT_DIRECTORY%.) do set PROLOBJECTLINK_HOME=%%~dpB
SET CLASSPATH=%PROLOBJECTLINK_HOME%lib\*

: default jdk
java -classpath %CLASSPATH% io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -m
java -classpath %CLASSPATH% io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -j %PROLOBJECTLINK_HOME%lib\prolobjectlink-jpx-model.jar
java -classpath %CLASSPATH% io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -z 9110