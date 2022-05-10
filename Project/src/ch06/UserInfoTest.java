package ch06;

public class UserInfoTest {

	public static void main(String[] args) {

		
		
		UserInfo T1=new UserInfo("asdzxc1822","hello","梯熱團");
		UserInfo T2=new UserInfo();
		
		
		T2.userId="sumin1223@naver.com";
	
		T2.userName="熱團梯";
		
		
		
		System.out.println(T2.showUserInfo());
		System.out.println(T1.showUserInfo());
	}

}
