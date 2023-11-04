public class LoopBebas {
    public static void main(String[] args) {
        int i = 10;

        while (i > 0) {
            System.out.println("Waktu yang tersisa tinggal " + i + " Detik");
            i--;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            if (i == 0) {
        System.out.println("Waktu telah habis!");
        }
    }
}
