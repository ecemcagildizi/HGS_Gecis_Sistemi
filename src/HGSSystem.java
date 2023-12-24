
public class HGSSystem {
    public static void main(String args[]){
        HGSSystem system = new HGSSystem();
        HGSAccount account1 = new HGSAccount("Ecem Çağıl","Dizi", 1210505022L);
        HGSPassage passage1 = new HGSPassage("13.05.2023","Antalya",100);

        account1.addPassage(passage1);


        System.out.println("Hesap Ekleniyor...");
        System.out.println("İsim: "+account1.getName());
        System.out.println("Soyisim: "+account1.getSurname());
        System.out.println("TC Kimlik Numarası: "+account1.getTcKimlikNo());
        System.out.println("Geçiş Bilgileri:");
        System.out.println("Tarih: "+passage1.getDate());
        System.out.println("Rota: "+passage1.getRoute());
        System.out.println("Borç: "+passage1.getFee());

        System.out.println("--------------------------------------------");

        HGSPassage passage2 = new HGSPassage("08.07.2024","Virginia",1000);
        account1.addPassage(passage2);

        System.out.println("Yeni Geçiş Bilgileri:");
        System.out.println("Tarih: "+passage2.getDate());
        System.out.println("Rota: "+passage2.getRoute());
        System.out.println("Borç: "+passage2.getFee());
        System.out.println("Önceki Geçişler: ");
        account1.displayPassages();
    }
}
