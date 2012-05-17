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

/**
 * @author hoegertn
 * 
 */
public class RestDoc {

	private GlobalHeader headers = new GlobalHeader();

	private Collection<RestResource> resources = new ArrayList<RestResource>();

	/**
	 * @return the headers
	 */
	public GlobalHeader getHeaders() {
		return this.headers;
	}

	/**
	 * @param headers
	 *            the headers to set
	 */
	public void setHeaders(GlobalHeader headers) {
		this.headers = headers;
	}

	/**
	 * @return the resources
	 */
	public Collection<RestResource> getResources() {
		return this.resources;
	}

	/**
	 * @param resources
	 *            the resources to set
	 */
	public void setResources(Collection<RestResource> resources) {
		this.resources = resources;
	}

}
