public class joko_bim {
    public static void main(String[] args) {
        String[] joko_bim = {
                "Lirik lagu baris 1",
                "Lirik lagu baris 2",
                "Lirik lagu baris 3",
                "Lirik lagu baris 4",
                "Lirik lagu baris 5"
        };

        // deklarasi array untuk munculnya lirik per huruf
        int[] waktuTunda = { 100, 100, 100, 100, 100 }; // waktu tunda antar huruf (ms) -> (1000 -> 1detik)

        try {
            for (int i = 0; i < joko_bim.length; i++) {
                for (int j = 0; j < joko_bim[i].length(); j++) {
                    System.out.print(joko_bim[i].charAt(j)); 
                    Thread.sleep(waktuTunda[i]);
                }

                System.out.println();

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Ada kesalahan dalam penundaan.");
        }
    }
}
