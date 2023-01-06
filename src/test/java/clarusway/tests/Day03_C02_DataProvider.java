package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C02_DataProvider {
// user name ,Email, passord, number
    @Test(dataProvider = "getData")
    public void test(String userName , String email , String password , int number) {
        System.out.println(userName);
        System.out.println(password);
        System.out.println(email);
        System.out.println(number);


    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data={
                {"Karl","karl@cw.com","123",1},
                {"Drake","drake@cw.com","12",2},
                {"Garry","garry@cw.com","3",3},
                {"Elly","elly@cw.com","4",4}
        };

        return data;
    }
}
