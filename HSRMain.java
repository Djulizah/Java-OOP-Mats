import java.util.Scanner;

public class HSRMain {
    public static void main(String[] args) {
        HSRCharacters robin = new HSRCharacters("Robin", "Harmony");
        HSRCharacters boot = new HSRCharacters("Boothill", "Hunt");
        HSRCharacters sam = new HSRCharacters("SAM", "Destruction");
        HSRCharacters avent = new HSRCharacters("Aventurine", "Persevation");

        Scanner scan = new Scanner(System.in);

        System.out.println("Which do you want to pull?");
        System.out.println("1.Robin");
        System.out.println("2.Boothill");
        System.out.println("3.SAM");
        System.out.println("4.Aventurine");
        System.out.print("Input: ");
        int inputChar = scan.nextInt();

        System.out.println("How many days until banner?");
        int inputDays = scan.nextInt();

        System.out.print("input current jades: ");
        int inputJades = scan.nextInt();

        if (inputChar == 1) {
            HSRWarpCalc charChoice = new HSRWarpCalc(robin, inputDays, inputJades);
            charChoice.gambleStatus();
        } else if (inputChar == 2) {
            HSRWarpCalc charChoice = new HSRWarpCalc(boot, inputDays, inputJades);
            charChoice.gambleStatus();
        } else if (inputChar == 3) {
            HSRWarpCalc charChoice = new HSRWarpCalc(sam, inputDays, inputJades);
            charChoice.gambleStatus();
        } else if (inputChar == 4) {
            HSRWarpCalc charChoice = new HSRWarpCalc(avent, inputDays, inputJades);
            charChoice.gambleStatus();
        } else {
            System.out.println("Character database not yet initialized!");
        }
    }
}
