package clarusway.tests;

import org.testng.annotations.Test;
   /*
   enabled
   - Belirli test yöntemini mevcut suitte/class’ta çalıştırmak
   isteyip istemediğimizi belirlememize yardımcı olur.
   Gereksinimin/fonksiyonun sık sık değişmesi gibi bazı
   nedenlerden dolayı bazen birkaç test yapmak istemiyoruz ve
   o belirli fonksiyon için mevcut çalışmayı bozmak istemiyoruz.
   - Bu durumlarda, bu özelliği
   @Test(enabled = false) olarak ayarlayarak söz konusu testi
   görmezden gelebilir/devre dışı bırakabiliriz.
   */
public class Day01_C04_Enabled {

    @Test(enabled = true)// enabled(etkinlestirilmiş)
    public void enabledtest() {

    }

    @Test(enabled = false)// disabled engellenmis
    public void disabledtest() {

    }

}
