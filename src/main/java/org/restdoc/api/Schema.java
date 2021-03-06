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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;

import org.restdoc.api.util.RestDocObject;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({"type", "url", "schema"})
public class Schema extends RestDocObject {
	
	private String type = "inline";
	
	private String url;
	
	private JsonSchema schema;
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return this.url;
	}
	
	/**
	 * @param url the url to set
	 */
	public void setUrl(final String url) {
		this.url = url;
	}
	
	/**
	 * @return the schema
	 */
	public JsonSchema getSchema() {
		return this.schema;
	}
	
	/**
	 * @param schema the schema to set
	 */
	public void setSchema(final JsonSchema schema) {
		this.schema = schema;
	}
	
	// #############################################################
	// nice builder methods
	// #############################################################
	
	/**
	 * @param _schema
	 * @return this
	 */
	public Schema schema(final JsonSchema _schema) {
		this.setType("inline");
		this.setSchema(_schema);
		return this;
	}
	
	/**
	 * @param _url
	 * @return this
	 */
	public Schema url(final String _url) {
		this.setType("url");
		this.setUrl(_url);
		return this;
	}
}
