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
package org.prolobjectlink.reference;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.prolobjectlink.BaseTest;
import org.prolobjectlink.prolog.PrologEngine;
import org.prolobjectlink.prolog.PrologQuery;

public class ReferenceTest extends BaseTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		PrologEngine engine = provider.newEngine();
		PrologQuery query = engine.query("jpl_new( 'javax.swing.JFrame', ['frame with dialog'], F)");
		Map<String, Object> m = query.oneVariablesResult();
		assertEquals(JFrame.class, m.get("F").getClass());
	}

}
