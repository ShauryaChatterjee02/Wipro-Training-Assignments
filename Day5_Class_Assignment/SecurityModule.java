package Day5_Class_Assignment;
final class SecurityModuleDemo {
    void encrypt() {
        System.out.println("Encryption logic running...");
    }
}
public class SecurityModule {
    public static void main(String[] args) {
        SecurityModuleDemo security = new SecurityModuleDemo();
        security.encrypt();
    }
}