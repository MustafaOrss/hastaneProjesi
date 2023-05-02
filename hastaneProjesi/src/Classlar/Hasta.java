package Classlar;

public class Hasta {

    private String isim;
    private boolean SoyIsim;
    private int hastaID;
    private boolean hastaDurumu;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(boolean soyIsim) {
        SoyIsim = soyIsim;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public void setHastaDurumu(boolean hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }


    public String getIsim() {
        return isim;
    }

    public boolean isSoyIsim() {
        return SoyIsim;
    }

    public int isHastaID() {
        return hastaID;
    }

    public boolean isHastaDurumu() {
        return hastaDurumu;
    }


    public static void main(String[] args) {

    }
}
