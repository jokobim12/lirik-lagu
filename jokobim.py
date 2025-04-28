import time

def tampilkan_lirik():
    lirik_lagu = [
        "Lirik lagu baris 1",
        "Lirik lagu baris 2",
        "Lirik lagu baris 3",
        "Lirik lagu baris 4",
        "Lirik lagu baris 5"
    ]
    
    # array untuk waktu tunda lirik perhurufnya
    waktu_tunda = [0.1, 0.1, 0.1, 0.1, 0.1] 
    
    for i in range(len(lirik_lagu)):
        # Tampilkan setiap karakter satu per satu dalam lirik
        for char in lirik_lagu[i]:
            print(char, end='', flush=True)  # Mencetak satu karakter tanpa baris baru
            time.sleep(waktu_tunda[i])  # Menunggu sesuai waktu tunda antar huruf
        
        # Pindah ke baris baru setelah selesai menampilkan seluruh karakter dalam baris ini
        print()  
        # Jeda antar baris lirik, jika diperlukan (misalnya 1 detik antar baris)
        time.sleep(1)  # Menunggu 1 detik sebelum menampilkan lirik berikutnya

if __name__ == "__main__":
    tampilkan_lirik()

