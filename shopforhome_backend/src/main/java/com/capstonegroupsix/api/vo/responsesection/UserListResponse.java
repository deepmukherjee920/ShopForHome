package com.capstonegroupsix.api.vo.responsesection;

import java.util.List;

import com.capstonegroupsix.api.entity.User;

public class UserListResponse {
	
	private List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
