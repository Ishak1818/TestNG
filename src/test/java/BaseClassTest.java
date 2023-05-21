import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassTest {
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println(" Inside before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println(" inside after method");
        System.out.println();}
}
