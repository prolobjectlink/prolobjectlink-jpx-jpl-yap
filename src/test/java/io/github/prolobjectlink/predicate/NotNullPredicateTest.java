/*
 * #%L
 * prolobjectlink-jpx-jpl-yap
 * %%
 * Copyright (C) 2019 Prolobjectlink Project
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
package io.github.prolobjectlink.predicate;

import org.junit.Test;

import io.github.prolobjectlink.db.predicate.NotNullPredicate;

public class NotNullPredicateTest extends BasePredicateTest {

	@Test
	public final void testEvaluate() {
		assertTrue(new NotNullPredicate<Object>(), a);
		assertFalse(new NotNullPredicate<Object>(), null);
	}

}
