package ch13.domain.userInfo_oracle;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void inserUserInfo(UserInfo userInfo) {

		System.out.println("Insert Into ORACLE DB userID= "+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {

		System.out.println("Update Into ORACLE DB userID= "+userInfo.getUserId());
	}

	@Override
	public void DeleteUserInfo(UserInfo userInfo) {

		System.out.println("Delete Into ORACLE DB userID= "+userInfo.getUserId());
	}


}
