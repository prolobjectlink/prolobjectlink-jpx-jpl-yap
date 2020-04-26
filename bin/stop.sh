#!/usr/bin/bash
kill $(jps -l | grep io.github.prolobjectlink.db.prolog.jpl.yap.YapPrologDatabaseConsole | awk '{print $1}')