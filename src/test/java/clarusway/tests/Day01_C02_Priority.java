package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C02_Priority {
    /*
    Create a class.
    Create 2 test methods.
    Use TestNG annotations that can be used in the class.
    Interpret output in console.

     */
    // TestNG (default) olarak @Test annotationları alfabetik sıraya göre execute eder
    // TestNG prioritysinin sayi degeri en az olan testi ilk once calistirir
    // Priporty attribute u icin negatif degerler kullanilabilir
     // TestNg default priority =0 dir
        /*
        TestNG Annotation Attributes
@Test annotationda attributeleri açıkça belirtebiliriz. Test attributeleri teste özeldir ve @Test notasyonunun hemen
yanında belirtilir
         */
    @Test(priority =1000 )
    public void test02() {

    }

    @Test(priority =1001 )
    public void test04() {
    }

    @Test
    public void test01() {// önce default test calışır sonra diger testlerin sırasıyla priotriy degerlerine göre
        //  konsolda kücüken büyüge sıralar
    }

    @Test(priority =2000 )
    public void test03() {
    }

}
