public class LoopBebas {
    public static void main(String[] args) {
        int HitungMundur = 10;
        for (int i = HitungMundur; i > 0; i--) {
            System.out.println("Waktu yang tersisa tinggal " + i + " detik");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Waktu habis!");
    }
}