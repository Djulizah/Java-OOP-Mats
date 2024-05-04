public class Manajer extends Pegawai{
    int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    int infoGaji() {
        return gaji;
    }

    int infoTunjangan() {
        return tunjangan;
    }
}
