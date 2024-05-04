public class PegawaiMain {
    public static void main(String[] args) {
        //instance Manajer dan Programmer menggunakan cara standar
        Manajer manajer = new Manajer("Manajer Tessburger", 5000000, 1000000);
        Programmer programmer = new Programmer("Programmer Sebastian", 21000000, 500000);

        //print infoGaji Manajer
        System.out.println(manajer.infoGaji());

        //print infoGaji Programmer
        System.out.println(programmer.infoGaji());
    
        //instance Manajer dan Programmer menggunakan cara Polymorph
        Pegawai manajer2 = new Manajer("Manajer Jingliu", 10, 20);
        Pegawai programmer2 = new Programmer("Programmer Da Wei", 10, 50);    

        //print infoGaji Manajer
        System.out.println(manajer2.infoGaji());

        //print infoGaji Programmer
        System.out.println(programmer2.infoGaji());
    }
}
