/*-
 * #%L
 * prolobjectlink-jpx-jpl-yap
 * %%
 * Copyright (C) 2012 - 2019 Prolobjectlink Project
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
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
