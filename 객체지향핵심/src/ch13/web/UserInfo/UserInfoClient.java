package ch13.web.UserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.UserInfoDao;
import ch13.domain.userInfo.dao.oracle.mysql.UserInfoMySqlDao;
import ch13.domain.userInfo_oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		
		
		FileInputStream fis=new FileInputStream("db_properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String dbType=prop.getProperty("DBTYPE");
		
		
		
		UserInfo userInfo=new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao=null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao=new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao=new UserInfoMySqlDao();
		}
		
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.inserUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.DeleteUserInfo(userInfo);
	}

}
