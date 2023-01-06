package clarusway.tests;

import org.testng.annotations.Test;
/*
XML (Extensible Markup Language), hem insanlar hem de bilgisayar sistemleri tarafından kolayca okunabilen belgeler
        oluşturmak için kullanılan bir işaretleme dilidir. W3C tarafından tanımlanan bir standarttır.
TestNG.xml dosyasının başlıca avantajları şunlardır:
• Test yöntemlerinin paralel yürütülmesini sağlar.
• Bir test yönteminin başka bir test yöntemine bağımlılığına izin verir.
• Test yöntemlerimize öncelik vermemize yardımcı olur.
• Test yöntemlerinin test grupları halinde gruplandırılmasını sağlar.
• @Parameters annotation kullanarak test senaryolarının parametreleştirilmesini destekler.
• @DataProvider annotation kullanarak veriye dayalı testlerde yardımcı olur.
• Beklenen sonuçların gerçek sonuçlarla doğrulanmasına yardımcı olan farklı türde iddialara sahiptir.
• Test özetimizi daha iyi ve net bir şekilde anlamak için farklı HTML raporları, kapsam raporları vb. vardır

 */
public class Day02_C01_TestNGXML_Groups {


    @Test(groups = {"regression"})
    public void test01(){
        System.out.println("Test01 - Regression testi calisti");
}

@Test(groups = {"regression"})
public void test02(){
    System.out.println("Test02 - Regression testi calisti");
}

@Test(groups = {"regression"})
public void test03(){
    System.out.println("Test03 - Regression testi calisti");
}

@Test(groups = {"smoke"})
public void test04(){
    System.out.println("Test04 - Smoke testi calisti");
}

    @Test(groups = {"smoke"})
    public void test05(){
        System.out.println("Test05 - Smoke testi calisti");
    }

    @Test(groups = {"smoke"})
    public void test06(){
        System.out.println("Test06 - Smoke testi calisti");
    }

    @Test(groups = {"regression", "smoke"})
    public void test07(){
        System.out.println("Test07 - Smoke regression testi calisti");
    }
}
