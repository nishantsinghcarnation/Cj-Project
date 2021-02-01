package com.cts.cj.dto;

import java.io.Serializable;
import java.util.List;

import com.cts.cj.domain.PostPrevious;

public class SharePostResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public List<PostPrevious> getPostExists() {
		return postExists;
	}

	public void setPostExists(List<PostPrevious> postExists) {
		this.postExists = postExists;
	}

	private List<PostPrevious> postExists;
	
	

}
