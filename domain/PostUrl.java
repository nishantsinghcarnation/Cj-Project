/**
 * 
 */
package com.cts.cj.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author Shikha.Mishra
 *
 */
@NodeEntity
public class PostUrl {

	@Id
	@GeneratedValue
	private Long id;

	private String type;

	private String url;

//	private boolean isPrimary = false;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the isPrimary
	 */
	/*
	 * public boolean isPrimary() { return isPrimary; }
	 * 
	 *//**
		 * @param isPrimary the isPrimary to set
		 *//*
			 * public void setPrimary(boolean isPrimary) { this.isPrimary = isPrimary; }
			 */

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

}
