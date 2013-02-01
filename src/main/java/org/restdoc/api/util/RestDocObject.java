/**
 * Copyright 2012 Thorsten Höger, RestDoc.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.restdoc.api.util;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;

/**
 * @author hoegertn
 * 
 */
public class RestDocObject {

	protected final HashMap<String, Object> additionalFields = new HashMap<String, Object>();

	/**
	 * @return the map of additional fields
	 */
	@JsonAnyGetter
	public Map<String, Object> getAdditionalFields() {
		return this.additionalFields;
	}

	/**
	 * Add additional field
	 * 
	 * @param key
	 *            the field name
	 * @param value
	 *            the field value
	 */
	@JsonAnySetter
	public void setAdditionalField(final String key, final Object value) {
		this.additionalFields.put(key, value);
	}

}
