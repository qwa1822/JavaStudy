package ch06;

public class UserInfoTest {

	public static void main(String[] args) {

		
		UserInfo userLee=new UserInfo();
		userLee.userId="a12345";
		userLee.userPassWord="zxcvbn12345";
		userLee.userName="�����";
		userLee.phoneNumber="01034556699";
		userLee.userAddress="Seoul, korea";
		
		System.out.println(userLee.showUserInfo());
		
		
		
		UserInfo userKim=new UserInfo("b12345", "09876mnvbc", "kim");
		System.out.println(userKim.showUserInfo());
		
		
		
		Order or=new Order();
		or.address="����ð�����";
		or.menuNumber=0003;
		or.price=35000;
		or.orderTime=130258;
		or.orderDate=20201102;
		or.PhoneNumber=01023450001;
		or.orderNumber=202011020;
		
		
		System.out.println(or.showInfO());
	}

}
