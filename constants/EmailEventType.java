package com.cts.cj.constants;

public enum EmailEventType {
	SIGNUP("signup"), FORGET_PASSWORD("forget"), CHANGE_PASSWORD("changepass"), ADMIN_APPROVAL("approval"), UNREAD("unread"), USER_UPDATE("updateuser"),USER_INVITE("invite"),CANCELL_MEETING("cancelmeeting");

	private String name;

	private EmailEventType(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static EmailEventType getByName(String name) {
		for (EmailEventType status : EmailEventType.values()) {
			if (status.getName().equalsIgnoreCase(name)) {
				return status;
			}
		}
		return null;
	}
}
