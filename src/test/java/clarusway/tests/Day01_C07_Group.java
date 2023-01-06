package clarusway.tests;

import org.testng.annotations.Test;
/*
groups
- Aynı işlevselliğe ait farklı test senaryolarını gruplamak için
kullanılır.
- Bu bölümü daha sonra xml. dosyalarında ele alacağız.
 */
public class Day01_C07_Group {

    @Test(groups = {"smoke","regression"})
    public void loginTest() {
    }
    @Test(groups = {"regression"})
    public void aboutTest() {
    }
    @Test(groups = {"regression"})
    public void contacTest() {
    }
    @Test(groups = {"regression","smoke"})
    public void registrstionTest() {
    }
    @Test(groups = {"regression","smoke"})
    public void checkOutTest() {
    }




}
