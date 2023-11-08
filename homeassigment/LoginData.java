package homeassigment;

public class LoginData extends TestData {

		// TODO Auto-generated method stub

	
	
	public void enterUserName() {
		
		System.out.println("enter the username");
		
	}
	
	public void enterPassword() {
		
		System.out.println("enter the password");
	}
	
		public static void main(String[] args) {
         
			LoginData obj = new LoginData();
			
			obj.enterCrdentials();
			obj.navigateToHomePage();
			obj.enterUserName();
			obj.enterPassword();
	
	}

}
