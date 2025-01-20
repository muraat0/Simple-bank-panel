import java.util.Arrays;
import java.util.Scanner;
import java.util.Map;

public class bank
{
    public static void main(String [] args)
    {
        Scanner entry = new Scanner(System.in);

            //User1
        String correctUsername = "Murat";
        String correctPassword = "123123";

        //Kullanıcı girişi
        System.out.print("Kullanıcı adı: ");
        String username = entry.nextLine();

        //Şifre girişi
        System.out.print("Şifre: ");
        String password = entry.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Giriş başarılı! Hoş geldiniz, " + username + "!");
        }
        else
        {
            System.out.println("Hatalı kullanıcı adı veya şifre! Giriş başarısız.");
            entry.close();
            return; // Programı bitir
        }

        System.out.print("1: Hesap Makinesi \n2: Doviz Hesaplama\n3: Para transferi\n4: Başvurular\n5: QR işlemler\n6: Çıkış\n");
        System.out.print(username + " hangi işlemi yapmak istersin?: ");
        int secim = entry.nextInt();

        switch (secim)
        {
            case 1:
        System.out.print("Hesap makinesi işlemleri için (1: +, 2: -, 3: *, 4: /): ");
        int choice = entry.nextInt();

        switch (choice)
        {
            case 1:
                System.out.print(username + " kaç sayıyı işleme almak istiyorsun?: ");
                int sayilar = entry.nextInt();
                double toplam = 0;
            for (int i = 1; i <= sayilar; i++)
            {
                System.out.print("Sayı gir: ");
                int sayi = entry.nextInt();
                toplam += sayi;

            }
                System.out.println("Girdiğin sayıların toplamı: " + toplam);
                entry.close();
            break;
            case 2:
                System.out.print("Birinci sayıyı gir: ");
                int sayi1 = entry.nextInt();
                System.out.print("İkinci sayıyı gir: ");
                int sayi2 = entry.nextInt();
                System.out.println("Sonuç: " + (sayi1-sayi2));
                entry.close();
                break;
            case 3:
                System.out.print(username + " kaç sayıyı işleme almak istiyorsun?: ");
                int sayilar2 = entry.nextInt();
                double toplamcarp = 1;
                for (int i = 1; i <= sayilar2; i++)
                {
                    System.out.print("Sayı gir: ");
                    int sayicarp = entry.nextInt();
                    toplamcarp = sayicarp * sayicarp;
                }
                System.out.println("Sonuç: " + toplamcarp);
                entry.close();
                break;
            case 4:
                System.out.print("Birinci sayıyı gir: ");
                int sayibol1 = entry.nextInt();
                System.out.print("İkinci sayıyı gir: ");
                int sayibol2 = entry.nextInt();
                System.out.println("Sonuç: " + (sayibol1/sayibol2));
                break;
            default:
                System.out.println(username + "Geçersiz bir değer girdin, program sonlandırılıyor...");
                entry.close();
                break;
        }
            case 2:
                double dolar = 35.40;
                double euro = 36.27;
                double altın = 3050;

                System.out.print(username + " hangi dovizi dönüştürmek istiyorsun?: ");
                System.out.print("Dolar: 1, Euro: 2, Altın: 3");
                int dovizid = entry.nextInt();

                switch (dovizid)
                {
                    case 1:
                        System.out.print("Dönüştürmek istediğin miktar (TL): ");
                        double lira = entry.nextDouble();
                        System.out.println(lira + " TL, Dolar olarak: " + (lira / dolar));
                        entry.close();
                        break;
                    case 2:
                        System.out.print("Dönüştürmek istediğin miktar (TL): ");
                        double lira2 = entry.nextDouble();
                        System.out.println(lira2 + " TL, Euro olarak: " + (lira2 / euro));
                        entry.close();
                        break;
                    case 3:
                        System.out.print("Dönüştürmek istediğin miktar (TL): ");
                        double lira3 = entry.nextDouble();
                        System.out.println(lira3 + " TL, Altın olarak: " + (lira3 / altın));
                        entry.close();
                        break;
                    default:
                        System.out.println("Geçersiz döviz seçimi.");
                        entry.close();
                        break;
                }
            case 3:

                System.out.println("Örnek ID: MRT21");
                System.out.print(username + " para göndermek istediğiniz kişinin ID numarasını gir: ");
                int id = entry.nextInt();

                System.out.print(username + " ne kadar göndermek istiyorsun?: ");
                int para = entry.nextInt();

                entry.nextLine();

                System.out.print("Açıklama: ");
                String mesaj = entry.nextLine();

                System.out.println("\n=== İşlem Özeti ===");
                System.out.println(id + " numarasına " + para + " TL gönderdiniz.");
                System.out.println("Açıklama: " + mesaj);
                entry.close();
                break;
            case 4:
                System.out.println("=== Başvurular ===");
                System.out.print("1: Kredi kartı başvurusu\n2: Banka kartı başvurusu\n");
                System.out.print("Giriş: ");
                int card = entry.nextInt();

                switch (card)
                {
                    case 1:
                        entry.nextLine();

                        System.out.println("Kredi kartı başvurunuz alınmıştır!");
                        System.out.print("Adres giriniz: ");
                        String kadres = entry.nextLine();
                        System.out.println("\n=== İşlem Özeti ===");
                        System.out.println("Adresiniz: " + kadres);
                        System.out.println("Kartınız yakında adresinizde olacaktır!");
                        entry.close();
                        break;

                    case 2:
                        entry.nextLine();

                        System.out.println("Banka kartı başvurunuz alınmıştır!");
                        System.out.print("Adres giriniz: ");
                        String badres = entry.nextLine();
                        System.out.println("\n=== İşlem Özeti ===");
                        System.out.println("Adresiniz: " + badres);
                        System.out.println("Kartınız yakında adresinizde olacaktır!");
                        entry.close();
                        break;

                    default:
                        System.out.println("Geçersiz karakter girdiniz, program kapatılıyor..");
                        entry.close();
                        break;
                }
            case 5:
                System.out.println("== QR İşlemler ==");
                System.out.println("QR işlemlere geçmeden önce konumu aktif etmeyi unutmayın!");
                System.out.println("1: QR ile para çekme \n2: QR ile para yatırma \n3: QR ile ödeme yapma");
                System.out.print("Giriş: ");
                int qr = entry.nextInt();

                switch (qr)
                {
                    case 1:
                        System.out.print("Çekmek istediğiniz miktarı girin: ");
                        int qrparac = entry.nextInt();
                        System.out.println(qrparac + " miktarında para çekme işleminiz gerçekleşti!");
                        break;
                    case 2:
                        System.out.print("Yatırmak istediğiniz miktarı girin: ");
                        int qrparay = entry.nextInt();
                        System.out.println(qrparay + " miktarında para yatırma işleminiz gerçekleşti!");
                        break;
                    case 3:
                        System.out.println("Sanal pos üzerinde bulunan QR kodu okutunuz!");
                        break;
                    default:
                        System.out.println("Geçersiz değer girdiniz, sistem kapatılıyor...");
                        break;
                }
            case 6:
                System.out.println(username + " çıkış işlemi gerçekleşiyor.");
                System.out.println("Çıkış yapılıyor...");
                entry.close();
                break;
            default:
                System.out.println(username + "Geçersiz bir değer girdin, program sonlandırılıyor...");
                entry.close();
                break;
    }
}

}
