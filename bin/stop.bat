@echo off
FOR /F "tokens=1,2 delims= " %%G IN ('jps -l') DO IF %%H==io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole taskkill /F /PID %%G