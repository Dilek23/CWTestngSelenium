package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C03_DependsOn {
    // Homepage testimiz login testimize bağlı oldgundan dependsOn attribute kullanabliriz
    // Bagimli olunan test fail olurssa bağimli olan method ignore(göz ardı ) edilir.
    // Bagimli olan method alfabetik execution a bakilmaksizin bagimli olunan metoddan sonra calisir
    // Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir
         /*
         dependsOn
  - İkinci test methodu birinci test methoduna bağımlı olmak
    istediğinde bu attribute kullanılır.
    - Birinci test methodu başarısız olursa, birinci test
    methodundaki bağımlı method, yani ikinci test methodu
   çalışmayacaktır.
- Bir parametrede bir method veya birden çok method
   iletilebilir
          */

    @Test()

    public void loginTest() {

        System.out.println("Login testi yapiliyor...");
    }
    @Test(dependsOnMethods = {"registrationTest", "loginTest"})// "registration kayıt
    public void homePageTest() {

        System.out.println("HomePage testi yapiliyor...");

    }
    @Test
    public void registrationTest(){
        System.out.println("Kayıt testi yapiliyor...");
    }
}
