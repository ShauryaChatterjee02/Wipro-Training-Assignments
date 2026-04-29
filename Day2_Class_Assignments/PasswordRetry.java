package Day2_Class_Assignments;

public class PasswordRetry {
public static void main(String[] args) {
String correctPassword = "admin@1234";
String enteredPassword = "admin@1234";
int attempts = 0;
int maxAttempts = 3;
while(attempts<maxAttempts) {
	if(enteredPassword==correctPassword) {
		System.out.println("Login Successful");
		break;
	}else {
		System.out.println("Wrong Password");
	}
	attempts++;
}
if(attempts==maxAttempts) {
	System.out.println("Account Locked");
}
}
}

