#!/usr/bin/bash
kill $(jps -l | grep org.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole | awk '{print $1}')