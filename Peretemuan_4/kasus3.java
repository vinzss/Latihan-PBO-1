package Peretemuan_4;

public class kasus3 {
    private double panjang;
    private double lebar;

    // Setter dan Getter untuk panjang
    public void setpanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return this.panjang;
    }

    // Setter dan Getter untuk lebar
    public void setlebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return this.lebar;
    }

    // Method untuk menghitung luas
    public double getLuas() {
        return this.panjang * this.lebar;
    }
}
