import java.util.Random;
import java.util.Scanner;

public class MoneyMachine {
    private String name;
    private static double saldo = 1000000;

    //Constructor
    public MoneyMachine(String name) {
        this.name = name;
    }

    //nomor urut generator dengan limit anatara 1-10
    int nomorUrut(){
        Random random = new Random();
        int nomor = random.nextInt(10);
        return nomor;
    }
    
    //tarik saldo
    private static double tarikSaldo(double inputTarik) {
        saldo -= inputTarik;
        return saldo;
    }

    //transfer saldo
    private static double transferSaldo(double inputTransfer) {
        saldo -= inputTransfer;
        return saldo;
    }

    //cek status akhir
    void printStruk(){
        System.out.println("=================================================");
        System.out.println("Halo " + name + "! Nomor urut kamu " + nomorUrut());
        System.out.println(String.format("Saldo tersisa adalah senilai Rp.%.2f", saldo));
        System.out.println("Terima kasih telah menggunakan ATM terminal ^_^!");
        System.out.println("=================================================");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //inputing account ID
        System.out.print("Masukkan nama anda: ");
        String inputId = scan.nextLine();

        //inputing choice of function
        System.out.println("Pilih salah satu:");
        System.out.println("\t1. tarik saldo");
        System.out.println("\t2. transfer saldo");
        System.out.print("input: ");
        int inputChoice = scan.nextInt();

        if (inputChoice == 1) {
            System.out.print("Nominal yang ingin di-tarik: ");
            double inputTarik = scan.nextDouble();
            tarikSaldo(inputTarik);

        } else if (inputChoice == 2) {
            System.out.print("Nominal yang ingin di-transfer: ");
            double inputTransfer = scan.nextDouble();
            transferSaldo(inputTransfer);

        } else {
            System.out.println("Mohon maaf, pilihan belum tersedia U_U;");
        }     

        scan.close();

        //inisiasi objek
        MoneyMachine money = new MoneyMachine(inputId);
        money.printStruk();

        //NOT USING SCANNER
        MoneyMachine machine = new MoneyMachine("roko");
        MoneyMachine.tarikSaldo(20000);
        machine.printStruk();

        MoneyMachine machine2 = new MoneyMachine("ro");
        MoneyMachine.transferSaldo(80000);
        machine2.printStruk();
    }

}
