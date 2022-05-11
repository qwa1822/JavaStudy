package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {

	
	
	void insertUserInfo(UserInfo userInfo);     //객체를 전달받음
	void updateUserInfo(UserInfo userInfo);		 //객체를 전달받음
	void deleteUserInfo(UserInfo userInfo);		 //객체를 전달받음
}
