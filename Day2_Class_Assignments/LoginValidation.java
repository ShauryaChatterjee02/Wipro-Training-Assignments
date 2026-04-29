package Day2_Class_Assignments;

public class LoginValidation {
public static void main(String[] args) {
	String correctUserName = "admin";
	String correctPassword = "admin@123";
	
	String UserName = "admin09";
	String Password = "admin@1234";
	
	if (UserName == correctUserName && Password == correctPassword) {
        System.out.println("Login Successful");
    } else {
        System.out.println("Login Failed");
    }
}
}
