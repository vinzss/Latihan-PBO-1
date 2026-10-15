package pertemuan_5.Latihan_2;

public class dosenRelasi {
    //deklarasi attribut/property
    private String kodeDosen;
    private String[] nimMhs = new String[3];
    private int jumlahMhs;

    //create method set
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNimMhs(String nimMhs) {
        if (jumlahMhs < this.nimMhs.length) {
            this.nimMhs[jumlahMhs] = nimMhs;
            jumlahMhs++;
        }
    }

    //create method get
    public String getKodeDosen() {
        return kodeDosen;
    }

    public int getJumlahMhs() {
        return jumlahMhs;
    }

    public String getNimMhs(int indeks) {
        return (nimMhs[indeks]);
    }
}
