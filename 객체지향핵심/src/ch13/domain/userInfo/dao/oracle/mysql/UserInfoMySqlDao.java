package ch13.domain.userInfo.dao.oracle.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void inserUserInfo(UserInfo userInfo) {

		System.out.println("Insert Into MySQL DB userID= "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {

		System.out.println("Update Into MySQL DB userID= "+userInfo.getUserId());
	}

	@Override
	public void DeleteUserInfo(UserInfo userInfo) {

		System.out.println("Delete Into MySQL DB userID= "+userInfo.getUserId());
	}

	
}
