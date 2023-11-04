import java.util.Scanner;

public class Zodiak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int Hari = input.nextInt();
        
        System.out.print("Masukkan bulan lahir (1-12): ");
        int Bulan = input.nextInt();
        
        String zodiak = MetodeZodiak(Hari, Bulan);
        
        System.out.println("Zodiak Anda adalah: " + zodiak);
        
        input.close();
    }

    public static String MetodeZodiak(int Hari, int Bulan) {
        if ((Bulan == 3 && Hari >= 21) || (Bulan == 4 && Hari <= 19)) {
            return "Aries";
        } else if ((Bulan == 4 && Hari >= 20) || (Bulan == 5 && Hari <= 20)) {
            return "Taurus";
        } else if ((Bulan == 5 && Hari >= 21) || (Bulan == 6 && Hari <= 20)) {
            return "Gemini";
        } else if ((Bulan == 6 && Hari >= 21) || (Bulan == 7 && Hari <= 22)) {
            return "Cancer";
        } else if ((Bulan == 7 && Hari >= 23) || (Bulan == 8 && Hari <= 22)) {
            return "Leo";
        } else if ((Bulan == 8 && Hari >= 23) || (Bulan == 9 && Hari <= 22)) {
            return "Virgo";
        } else if ((Bulan == 9 && Hari >= 23) || (Bulan == 10 && Hari <= 22)) {
            return "Libra";
        } else if ((Bulan == 10 && Hari >= 23) || (Bulan == 11 && Hari <= 21)) {
            return "Scorpio";
        } else if ((Bulan == 11 && Hari >= 22) || (Bulan == 12 && Hari <= 21)) {
            return "Sagittarius";
        } else if ((Bulan == 12 && Hari >= 22) || (Bulan == 1 && Hari <= 19)) {
            return "Capricorn";
        } else if ((Bulan == 1 && Hari >= 20) || (Bulan == 2 && Hari <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }
}
