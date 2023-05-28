import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Object {
    @DataProvider(name = "Provider")
    public java.lang.Object[][] dataProvider(){
        java.lang.Object[][] data = new java.lang.Object[4][2];
        data [0][0] = 568;
        data[0][1]= "Ishak";
        data [1][0] = 564;
        data [1][1] = "wwgd";
        data [2][0] = 236;
        data [2][1] = "wgwg";
        data [3][0] = 568;
        data [3][1]= "data";
        return data;

    }



    @Test(dataProvider = "Provider")
    public void Test4( int number, String name){
        System.out.println("number is "+ number);
        System.out.println(" The name is "+ name);

    }
}
