#!/usr/bin/bash
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -m
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -c "$(dirname "$(pwd)")/lib/prolobjectlink-jpx-model.jar"
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -j "$(dirname "$(pwd)")/lib/prolobjectlink-jpx-model.jar"