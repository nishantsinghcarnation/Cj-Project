package com.cts.cj.dto;

public class IsUniqueResponse {

	private boolean isUnique;

	public IsUniqueResponse(boolean isUnique) {
		super();
		this.isUnique = isUnique;
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}

}
