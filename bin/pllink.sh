#!/usr/bin/bash
java -classpath "$(dirname "$(pwd)")/lib/*" org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole ${1+"$@"}