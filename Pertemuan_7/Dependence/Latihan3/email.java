package Pertemuan_7.Dependence.Latihan3;

/**
 * author by: Calvin Juniando
 */
public class email {
    private String subjek, pesan, kepada;

    public email(String subjek, String pesan) {
        this.subjek = subjek;
        this.pesan = pesan;
    }

    public String getSubjek() {
        return subjek;
    }

    public String getPesan() {
        return pesan;
    }

    public String getKepada() {
        return kepada;
    }

    public void setKepada(String kepada) {
        this.kepada = kepada;
    }
}