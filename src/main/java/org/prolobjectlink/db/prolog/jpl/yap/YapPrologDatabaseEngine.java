package org.prolobjectlink.db.prolog.jpl.yap;

import org.prolobjectlink.db.prolog.PrologDatabaseEngine;
import org.prolobjectlink.db.prolog.PrologProgrammer;
import org.prolobjectlink.prolog.PrologProvider;
import org.prolobjectlink.prolog.jpl.yap.YapPrologEngine;

public class YapPrologDatabaseEngine extends YapPrologEngine implements PrologDatabaseEngine {

	YapPrologDatabaseEngine() {
		super(new YapPrologDatabaseProvider());
	}

	YapPrologDatabaseEngine(PrologProvider provider) {
		super(provider);
	}

	YapPrologDatabaseEngine(PrologProvider provider, String file) {
		super(provider, file);
	}

	public PrologProgrammer getProgrammer() {
		return new YapPrologProgrammer(getProvider());
	}

}
