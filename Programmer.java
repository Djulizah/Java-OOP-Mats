public class Programmer extends Pegawai{
    int bonus;
    
    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    int infoGaji() {
        return gaji;
    }

    int infoBonus() {
        return bonus;
    }

}
