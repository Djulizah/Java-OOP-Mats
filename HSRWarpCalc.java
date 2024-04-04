public class HSRWarpCalc {
    HSRCharacters characters;
    int days;
    private int stellarJades;

    public HSRWarpCalc(HSRCharacters characters, int days, int stellarJades) {
        this.characters = characters;
        this.days = days;
        this.stellarJades = stellarJades;
    }

    int calculateWarpTicket(int stellarJades, int days) {
        int totalJades = stellarJades + (days * 60);
        int totalWarps = totalJades / 160;
        return totalWarps;
    }

    void gambleStatus() {
        System.out.println("Your warp tickets to get "+ characters.getPath() + ":" + characters.getName() + " are : " + calculateWarpTicket(stellarJades, days));
        if (calculateWarpTicket(stellarJades, days) > 75) {
            System.out.println("You are safe to get " + characters.getName() + "!");
        } else {
            System.out.println("mending lu top-up deh...");
        }
    }
    
}
