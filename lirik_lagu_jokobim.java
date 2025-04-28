public class lirik_lagu_jokobim {
    
    // Fungsi untuk menampilkan satu baris huruf per huruf dengan delay
    public static void tampilkanPerHuruf(String baris, int delayPerHurufMillis) throws InterruptedException {
        for (char huruf : baris.toCharArray()) {
            System.out.print(huruf);
            Thread.sleep(delayPerHurufMillis);
        }
        System.out.println(); // Ganti baris setelah selesai satu baris
    }

    public static void main(String[] args) {
        // Lirik lagu
        String[] irik_lagu_jokobim = {
            "Bukan karna make'up diwajahmu", //1
            "Atau lipstik merah itu", //2
            "Lembut hati tutur kata", //3
            "Terciptalah cinta yang kupuja", //4
            "Tak peduli", //5
            "langit menertawakanku", //6
            "Kau mencuri", //7
            "Hatiku mimpiku semua rinduku", //8
            "Karna kamu cantik", //9
            "Kan kuberi segalanya apa yang kupunya", //10
            "Dan hatimu baik", //11
            "Sempurnalah duniaku", //12
            "Saat kau disisiku", //13
        };

        // Delay per huruf (sama untuk semua huruf)
        int delayPerHuruf = 100; // 0.1 detik per huruf

        // Delay antar baris spesifik untuk setiap baris
        int[] delayAntarBaris = {
            700,  // setelah baris 1
            2300,  // setelah baris 2
            800,  // setelah baris 3
            1700,  // setelah baris 4
            3000,  // setelah baris 5
            2200,  // setelah baris 6
            2600, // setelah baris 7
            2200, // setelah baris 8
            2200, // setelah baris 9
            800, // setelah baris 10
            2000, // setelah baris 11
            500, // setelah baris 12
        };

        try {
            for (int i = 0; i < irik_lagu_jokobim.length; i++) {
                if (irik_lagu_jokobim[i].isEmpty()) {
                    // Jika baris kosong, langsung cetak baris kosong
                    System.out.println();
                } else {
                    tampilkanPerHuruf(irik_lagu_jokobim[i], delayPerHuruf);
                }

                // Setelah setiap baris (termasuk baris kosong), delay sesuai
                if (i < delayAntarBaris.length) {
                    Thread.sleep(delayAntarBaris[i]);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Program terganggu: " + e.getMessage());
        }
    }
}
