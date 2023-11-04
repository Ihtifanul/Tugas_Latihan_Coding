public class HitungMundur {
    public static void main(String[] args) {
        int i = 10;

        while (i > 0) {
            System.out.println("Anda hanya punya waktu " + i + " Detik");
            i--;

            try {
                Thread.sleep(1000);
                if (i == 5){
                    System.out.println("Waktu tinggal "+ i + " Detik Lagi!" );
                } else if (i == 0) {
                    System.out.println("Waktu telah habis");
                }
                } catch (InterruptedException e) {          
                }
          }
     }
}
