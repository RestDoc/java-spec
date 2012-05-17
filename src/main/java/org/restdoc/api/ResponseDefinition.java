/**
 * Copyright 2012 Thorsten Höger, RestDoc.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.restdoc.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hoegertn
 * 
 */
public class ResponseDefinition {

	private final Collection<Representation> types = new ArrayList<Representation>();

	private final Map<String, HeaderDefinition> headers = new HashMap<String, HeaderDefinition>();

	/**
	 * @return the types
	 */
	public Collection<Representation> getTypes() {
		return this.types;
	}

	/**
	 * @return the headers
	 */
	public Map<String, HeaderDefinition> getHeaders() {
		return this.headers;
	}

}