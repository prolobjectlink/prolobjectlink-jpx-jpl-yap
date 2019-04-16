package org.prolobjectlink.db.prolog.jpl.yap;

import org.prolobjectlink.db.prolog.PrologDatabaseEngine;
import org.prolobjectlink.db.prolog.PrologDatabaseProvider;
import org.prolobjectlink.prolog.jpl.yap.YapProlog;

public class YapPrologDatabaseProvider extends YapProlog implements PrologDatabaseProvider {

	public PrologDatabaseEngine newEngine() {
		return new YapPrologDatabaseEngine(this);
	}

	public PrologDatabaseEngine newEngine(String path) {
		PrologDatabaseEngine engine = newEngine();
		engine.consult(path);
		return engine;
	}

}
