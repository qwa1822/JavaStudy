package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {

	
	
	void insertUserInfo(UserInfo userInfo);     //��ü�� ���޹���
	void updateUserInfo(UserInfo userInfo);		 //��ü�� ���޹���
	void deleteUserInfo(UserInfo userInfo);		 //��ü�� ���޹���
}
