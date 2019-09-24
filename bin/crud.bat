@echo off

SET CURRENT_DIRECTORY=%~dp0
for %%B in (%CURRENT_DIRECTORY%.) do set PROLOBJECTLINK_HOME=%%~dpB
SET CLASSPATH=%PROLOBJECTLINK_HOME%lib\*

: default jdk
java -classpath %CLASSPATH% org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -m
java -classpath %CLASSPATH% org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -c %PROLOBJECTLINK_HOME%lib\prolobjectlink-jpx-model.jar
java -classpath %CLASSPATH% org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -j %PROLOBJECTLINK_HOME%lib\prolobjectlink-jpx-model.jar