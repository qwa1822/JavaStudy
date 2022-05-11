package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class userInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");

		Properties prop = new Properties();
		prop.load(fis);

		String dbType = prop.getProperty("DBTYPE");

		UserInfo userInfo = new UserInfo();

		UserInfoDao userInfoDao = null;
		userInfo.setUserId("12345");
		userInfo.setPassword("#!@#@!");
		userInfo.setUserName("Lee");
		
		if (dbType.equals("ORACLE"))
			userInfoDao = new UserInfoOracleDao();

		else if (dbType.equals("MYSQL"))
			userInfoDao = new UserInfoMysqlDao();

		else {
			System.out.println("db error");
			return;
		}

		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);

	}

}
