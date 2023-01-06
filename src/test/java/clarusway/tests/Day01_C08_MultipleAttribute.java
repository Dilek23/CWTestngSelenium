package clarusway.tests;

import org.testng.annotations.Test;


//Bir test methoduna  birden fazla attribute eklenilebilir
public class Day01_C08_MultipleAttribute {
    @Test(
            description = "This is a test case",
            priority = 10,
            groups = {"regression"},
            enabled = false
    )
    public void test(){

    }
}
