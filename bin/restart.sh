#!/usr/bin/bash
kill $(jps -l | grep org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole | awk '{print $1}')
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -m
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -j "$(dirname "$(pwd)")/lib/prolobjectlink-jpx-model.jar"
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole -z 9110