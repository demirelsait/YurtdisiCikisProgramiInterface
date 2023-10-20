public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz ...");

        String sartlar ="Yurtdışı Çıkış Kuralları ... \n"
                +"Herhangi bir siyasi yasağınız bulunmaması gerekiyor ... \n"
                +"15 TL harç bedelinizi tam olarak yatırmanız gerekiyor ... \n"
                +"Gideceğiniz ülkeye vizeniz bulunması gerekiyor... \n";

        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";

        while(true) {
            System.out.println("*************************************************");
            System.out.println(message);
            System.out.println("*************************************************");
            System.out.println(sartlar);

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000);//ekranı 3 saniye bekleticek

            if(yolcu.yurtdisiHarciKontrol() == false){
                System.out.println(message);
                continue;// while döngüsünün en başına dönecek
            }

            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() ==false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() ==false) {
                System.out.println(message);
                continue;
            }

            System.out.println("İşlemleriniz Tamam Turtdışına Çıkabilirsiniz ... ");
            break;
        }

    }
}