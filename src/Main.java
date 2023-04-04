public class Main {
    public static void main(String[] args) {

        double[] islemTamamlamaSureleri = new double[11];
        Kuyruk kuyruk = new Kuyruk(11);
        // Normal kuyruğa eleman ekleme
        kuyruk.insert(8);
        kuyruk.insert(9);
        kuyruk.insert(6);
        kuyruk.insert(7);
        kuyruk.insert(10);
        kuyruk.insert(1);
        kuyruk.insert(11);
        kuyruk.insert(5);
        kuyruk.insert(3);
        kuyruk.insert(4);
        kuyruk.insert(2);

        // her bir müşterinin ne kadar bekliceğini hesaplamak süreleri bir listeye attım
        double toplamSure = 0;
        for (int i = 0; i < kuyruk.queArray.length; ++i) {
            toplamSure += 3 * kuyruk.remove();
            islemTamamlamaSureleri[i] = toplamSure;
        }
        // burda toplam bekleme süresini bir değişkene atıyorum
        double ortSure = 0;
        for (int i = 0; i < islemTamamlamaSureleri.length; ++i) {
            ortSure += islemTamamlamaSureleri[i];
        }
        for(int i=0; i< islemTamamlamaSureleri.length;++i){
            System.out.println((i+1)+". müşterinin toplam bekleme süresi: "+ islemTamamlamaSureleri[i]);
        }
        // ortalama süreyi hesaplıyorum
        double birMusteriIcinOrtSure = ortSure / 11;
        System.out.println();
        System.out.println("Normal kuyruk için bir müşteri ortalama süre: "+String.format("%,.2f",birMusteriIcinOrtSure));
        System.out.println();

        // Oncelikli kuyruğa eleman ekleme
        OncelikliKuyruk oncelikliKuyruk = new OncelikliKuyruk(11);
        double[] oncelikIslemTamamlamaSure = new double[11];
        oncelikliKuyruk.insert(8);
        oncelikliKuyruk.insert(9);
        oncelikliKuyruk.insert(6);
        oncelikliKuyruk.insert(7);
        oncelikliKuyruk.insert(10);
        oncelikliKuyruk.insert(1);
        oncelikliKuyruk.insert(11);
        oncelikliKuyruk.insert(5);
        oncelikliKuyruk.insert(3);
        oncelikliKuyruk.insert(4);
        oncelikliKuyruk.insert(2);

        // her bir müşterinin bekleme süresini bir listeye atma
        double oncelikToplamSure = 0;
        for (int i = 0; i < oncelikliKuyruk.queArray.length; ++i) {
            oncelikToplamSure += 3 * oncelikliKuyruk.remove();
            oncelikIslemTamamlamaSure[i] = oncelikToplamSure;
        }
        // toplam süreyi hesaplama
        double oncelikToplamMusteriSure = 0;
        for (int i = 0; i < islemTamamlamaSureleri.length; ++i) {
            oncelikToplamMusteriSure += oncelikIslemTamamlamaSure[i];
        }
        for (int i=0; i<islemTamamlamaSureleri.length;++i){
            System.out.println((i+1)+". müşterinin toplam bekleme süresi: "+oncelikIslemTamamlamaSure[i]);
        }
        double ortOncelik = oncelikToplamMusteriSure / 11;
        System.out.println();
        System.out.println("Öncelik kuyruğunda bir müşteri için ortalama süre: "+ortOncelik);
        System.out.println();

    }
}