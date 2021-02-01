/**
 * 
 */
package com.cts.cj.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Shikha.Mishra
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupMessagingClass {
	
	private Long groupId;
	private String from;
	private String strMessage;
	/**
	 * @return the groupId
	 */
	public Long getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the strMessage
	 */
	public String getStrMessage() {
		return strMessage;
	}
	/**
	 * @param strMessage the strMessage to set
	 */
	public void setStrMessage(String strMessage) {
		this.strMessage = strMessage;
	}
	

}
