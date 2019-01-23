/*
 * #%L
 * prolobjectlink-db-jpl7-swi
 * %%
 * Copyright (C) 2019 Prolobjectlink Project
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
package org.worklogic.prolog.jpl.swi;

import org.logicware.prolog.jpl.yap.YapProlog;
import org.worklogic.db.HierarchicalCache;
import org.worklogic.db.etc.Settings;
import org.worklogic.db.prolog.PrologContainerFactory;

public final class YapPrologContainerFactory extends PrologContainerFactory {

	public YapPrologContainerFactory(Settings settins) {
		super(settins, new YapProlog());
	}

	public HierarchicalCache createHierarchicalCache() {
		return new YapPrologHierarchicalCache(getProvider(), getSettings(), this);
	}

}
