
public class StudentManager {
	public void Registered(RegisterStudent registerStudent) {
		if (registerStudent.getPassword()==registerStudent.getTruePassword()) {
		System.out.println(registerStudent.getName() + " isimli ��renci kay�t edildi.");
		}
		else {
			System.out.println("�ifrenizi kontrol ediniz.");
		}
	}
	public void Login(Login login) {
		System.out.println(login.getName() + " ismi ile sisteme giri� yap�ld�.");
	}
	
	
	
}
