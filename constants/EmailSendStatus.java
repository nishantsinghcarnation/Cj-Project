package com.cts.cj.constants;

public enum EmailSendStatus {
	PENDING("pending"), FAILED("failed"), SENT("sent"), READ("read"), UNREAD("unread");

	private String name;

	private EmailSendStatus(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static EmailSendStatus getByName(String name) {
		for (EmailSendStatus status : EmailSendStatus.values()) {
			if (status.getName().equalsIgnoreCase(name)) {
				return status;
			}
		}
		return null;
	}
}
