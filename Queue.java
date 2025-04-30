// Membuat class Queue
public class Queue {
    int[] data;       // Array untuk menyimpan elemen queue
    int front = -1;    // Menunjukkan indeks elemen paling depan
    int rear = -1;     // Menunjukkan indeks elemen paling belakang

    // Constructor: membuat queue baru dengan ukuran tertentu
    Queue(int size) {
        data = new int[size]; // Inisialisasi array berdasarkan ukuran
    }

    // Method untuk menambahkan data ke queue
    void enqueue(int value) {
        if (rear == data.length - 1) {
            System.out.println("Queue is full!"); // Queue penuh
        } else {
            if (front == -1) {
                front = 0; // Jika queue kosong, set front ke 0
            }
            data[++rear] = value; // Increment rear dan simpan value
        }
    }

    // Method untuk menghapus dan mengambil data dari depan queue
    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty!"); // Queue kosong
            return -1; // Mengembalikan -1 jika queue kosong
        } else {
            return data[front++]; // Ambil data dari depan dan increment front
        }
    }

    // Method untuk mengecek apakah queue kosong
    boolean isEmpty() {
        return front == -1 || front > rear; // Queue kosong jika front > rear atau front -1
    }

    // ===== Program utama (eksekusi program) =====
    public static void main(String[] args) {
        Queue queue = new Queue(10); // Membuat objek queue dengan kapasitas 10

        // Menambahkan elemen ke dalam queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Menampilkan isi queue
        System.out.println("Queue output: ");
        while (!queue.isEmpty()) {  // Selama queue tidak kosong
            System.out.print(queue.dequeue() + ", "); // Ambil elemen depan dan cetak
        }
    }
}

