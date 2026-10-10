package Peretemuan_4.Latiahan5;
//Calvin
public class Bagun_datar {
    public static void main(String[] args) {
        // hitung luas segitiga ADE
        segi_Tiga st1 = new segi_Tiga();
        st1.setAlas(8);
        st1.setTinggi(7);
        double luasADE = st1.getLuas();

        // hitung luas segitiga CBF
        segi_Tiga st2 = new segi_Tiga();
        st2.setAlas(8);
        st2.setTinggi(7);
        double luasCBF = st2.getLuas();

        // hitung luas persegipanjang CDEF
        Persegi_panjang pp1 = new Persegi_panjang();
        pp1.setPanjang(14);
        pp1.setLebar(7);
        double luasCDEF = pp1.getLuas();

        // hitung luas setengah lingkaran X
        Lingkaran ll = new Lingkaran();
        ll.setJejari(7);
        double luasX = 0.5 * ll.getLuas();

        // hitung luas daerah diarsir
        double luasArsir = luasADE + luasCBF + luasCDEF - luasX;

        System.out.println("Aplikasi Menghitung Luas Bangun di Arsir");
        System.out.println("------------------------------------------------");
        System.out.println("Luas Segi Tiga ADE    : " + luasADE + " cm2");
        System.out.println("Luas Segi Tiga CBF    : " + luasCBF + " cm2");
        System.out.println("Luas Persegi Panjang CDEF : " + luasCDEF + " cm2");
        System.out.println("Luas Setengah Lingkaran   : " + luasX + " cm2");
        System.out.println("------------------------------------------------");
        System.out.println("Luas daerah diarsir   : " + luasArsir + " cm2");
    }
}
