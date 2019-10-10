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

import org.prolobjectlink.db.ObjectConverter;
import org.prolobjectlink.db.prolog.PrologDatabaseEngine;
import org.prolobjectlink.db.prolog.PrologObjectConverter;
import org.prolobjectlink.db.prolog.PrologProgrammer;
import org.prolobjectlink.prolog.PrologProvider;
import org.prolobjectlink.prolog.PrologTerm;
import org.prolobjectlink.prolog.jpl.yap.YapPrologEngine;

public class YapPrologDatabaseEngine extends YapPrologEngine implements PrologDatabaseEngine {

	private final ObjectConverter<PrologTerm> converter;

	YapPrologDatabaseEngine() {
		super(new YapPrologDatabaseProvider());
		converter = new PrologObjectConverter(provider);
	}

	YapPrologDatabaseEngine(PrologProvider provider) {
		super(provider);
		converter = new PrologObjectConverter(provider);
	}

	YapPrologDatabaseEngine(PrologProvider provider, String file) {
		super(provider, file);
		converter = new PrologObjectConverter(provider);
	}

	public boolean unify(Object x, Object y) {
		PrologTerm xt = converter.toTerm(x);
		PrologTerm yt = converter.toTerm(y);
		return unify(xt, yt);
	}

	public PrologProgrammer getProgrammer() {
		return new YapPrologProgrammer(getProvider());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((converter == null) ? 0 : converter.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		YapPrologDatabaseEngine other = (YapPrologDatabaseEngine) obj;
		if (converter == null) {
			if (other.converter != null)
				return false;
		} else if (!converter.equals(other.converter))
			return false;
		return true;
	}

}
