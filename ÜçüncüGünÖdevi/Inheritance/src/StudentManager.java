
public class StudentManager {
	public void Registered(RegisterStudent registerStudent) {
		if (registerStudent.getPassword()==registerStudent.getTruePassword()) {
		System.out.println(registerStudent.getName() + " isimli öðrenci kayýt edildi.");
		}
		else {
			System.out.println("Þifrenizi kontrol ediniz.");
		}
	}
	public void Login(Login login) {
		System.out.println(login.getName() + " ismi ile sisteme giriþ yapýldý.");
	}
	
	
	
}
