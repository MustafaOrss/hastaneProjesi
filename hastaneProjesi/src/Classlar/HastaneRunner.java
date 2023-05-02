package Classlar;

public class HastaneRunner {

    /*
        Duzeltmeler yapilmasi gerek.
    */
    public static Hastane hastane = new Hastane();

    HastaneRunner() {
    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji")) {
            return "Alergyst";
        }
        if (aktuelDurum.equalsIgnoreCase("Covid-19")) {
            return "Immunology";
        }
        if (aktuelDurum.equalsIgnoreCase("Brian tumors")) {
            return "Neurosurgery";
        }
        if (aktuelDurum.equalsIgnoreCase("Primate infectious")) {
            return "Ortopedics";
        }
        if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return "Cardiothoracic";
        }
        if (aktuelDurum.equalsIgnoreCase("Heart diseases")) {
            return "Cardiology";
        } else {
            return "Yalis Unvan.";
        }

    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < VeriBankasi.unvanlar.length; i++) {
            if (VeriBankasi.unvanlar[i].equalsIgnoreCase(unvan)) {
                doktor.setIsim(VeriBankasi.doctorIsimleri[i]);
                doktor.setSoyIsim(VeriBankasi.doctorSoyIsimleri[i]);
                doktor.setUnvan(VeriBankasi.unvanlar[i]);
            }
        }
        return doktor;
    }

    public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum hastaDurumu = new Durum();
        switch (aktuelDurum.toLowerCase()) {
            case "Allerji":
                hastaDurumu.setAktualDurum("Allerji");
                hastaDurumu.setAciliyet(false);
                break;
            case "Covid-19":
                hastaDurumu.setAktualDurum("Covid-19");
                hastaDurumu.setAciliyet(false);
                break;
            case "Brian tumors":
                hastaDurumu.setAktualDurum("Beyin tümörü");
                hastaDurumu.setAciliyet(false);
                break;
            case "Primate infectous":
                hastaDurumu.setAktualDurum("Enfeksiyon");
                hastaDurumu.setAciliyet(false);
                break;
            case "Migren":
                hastaDurumu.setAktualDurum("Migren");
                hastaDurumu.setAciliyet(true);
                break;
            case "Heart diseases":
                hastaDurumu.setAktualDurum("Kalp rahatsızlığı");
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil.");
        }
        return hastaDurumu;
    }

    public static Hasta hastaBul(String actualCase) {
        Hasta hasta = new Hasta();
        for (int i = 0; i < VeriBankasi.hastaIDleri.length; i++) {
            if (VeriBankasi.durumlar[i].equalsIgnoreCase("actualCase")) {
                hasta.setHastaID(VeriBankasi.hastaIDleri[i]);
                hasta.setIsim(VeriBankasi.hastaIsimleri[i]);
                hasta.setSoyIsim(Boolean.parseBoolean(VeriBankasi.hastaSoyIsimleri[i]));
                break;
            }
        }
        return hasta;
    }

    public static void main(String[] args) {


        String hastaDurumu = String.valueOf(hastaDurumuBul("Kalp rahatsızlığı"));
        System.out.println(hastaDurumu);
        String unvan;
        unvan = doktorUnvan("AktuelDurum");
        System.out.println(unvan);

    }
}
