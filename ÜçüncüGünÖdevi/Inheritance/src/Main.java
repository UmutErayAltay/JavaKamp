
public class Main {

	public static void main(String[] args) {
		RegisterStudent registerStudent = new RegisterStudent();
		Login login = new Login();
		StudentManager studentManager = new StudentManager();
		System.out.println("-----------------------------------------------");
		registerStudent.setId(1);
		registerStudent.setName("Umut Eray Altay");
		registerStudent.setEmail("umuterrayy@gmail.com");
		registerStudent.setPassword("umut1234");
		registerStudent.setTruePassword("umut1234");
		studentManager.Registered(registerStudent);
		System.out.println("-----------------------------------------------");
		RegisterStudent registerStudent2 = new RegisterStudent();
		registerStudent2.setId(2);
		registerStudent2.setName("Ali Yýldýrým");
		registerStudent2.setEmail("AliYýldýrým18@gmail.com");
		registerStudent2.setPassword("ali18ali");
		registerStudent2.setTruePassword("ali18al");
		studentManager.Registered(registerStudent2);
		System.out.println("-----------------------------------------------");
		login.setId(3);
		login.setEmail("engindemirog@gmail.com");
		login.setPassword("EnginDemirog_!17");
		login.setName("Engin Demiroð");
		studentManager.Login(login);
		System.out.println("-----------------------------------------------");
	}

}
