// 1. Blessy Munthia Purba      [222212537]
// 2. Fauzan Alfaraby Nirwan    [222212605]
// 3. Hafizh Shah Firdaus	    [222212632]
// 4. Janitra Hayu Pramestya    [222212678]

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println();
            System.out.println("<< DATA VALID >>");
            // Membuat objek Pencacah dengan input yang valid
            System.out.println();
            System.out.println("--- Blok I. Keterangan Petugas ---");
            Pencacah pencacah = new Pencacah();
            pencacah.setNama("Fauzan Alfaraby");
            pencacah.setTanggalPencacahan(LocalDate.of(2024, 5, 1));
            pencacah.setTandaTangan("Fauzan Alfaraby");

            // Menampilkan informasi Pencacah
            System.out.println("Nama Pencacah       : " + pencacah.getNama());
            System.out.println("Tanggal Pencacahan  : " + pencacah.getTanggalPencacahan());
            System.out.println("Tanda Tangan        : " + pencacah.getTandaTangan());

            // Membuat objek Pengawas dengan input yang valid
            Pengawas pengawas = new Pengawas();
            pengawas.setNama("Alfaraby");
            pengawas.setTanggalPencacahan(LocalDate.of(2024,5,1));
            pengawas.setTandaTangan("Alfaraby");
            System.out.println();

            // Menampilkan informasi Pengawas
            System.out.println("Nama Pengawas       : " + pengawas.getNama());
            System.out.println("Tanggal Pengawasan  : " + pengawas.getTanggalPencacahan());
            System.out.println("Tanda Tangan        : " + pengawas.getTandaTangan());
            
            //Membuat objek responden dengan input yang valid
            System.out.println("=====================================");
            Responden responden = new Responden();
            responden.setNama("Janitra");
            responden.setUmur(17);
            responden.setJenisKelamin(2);
            responden.setPendidikanTerakhir(4);
            responden.setPekerjaanUtama(4);
            responden.setNamaInstitusi("BPS");

            //Menampilkan informasi responden
            System.out.println("--- Blok II. Keterangan Responden ---");
            responden.print();

            System.out.println("=====================================");
            
            //menampilkan informasi akses layanan
            System.out.println("--- Blok III. Akses Layanan ---");
            aksesLayanan layanan = new aksesLayanan();
            layanan.setPelayanan(0, "1");
            layanan.setPelayanan(1, "2");
            layanan.setPelayanan(2, "4");
            layanan.setPelayanan(3, "8");
            layanan.setPelayanan(4, "16");
            layanan.setPelayanan(5, "32");
        
            // Menambahkan fasilitas
            layanan.setFasilitas(0, "1");
            layanan.setFasilitas(1, "2");
            layanan.setFasilitas(3, "4");
            layanan.setFasilitas(4, "8");

            // Menambahkan harapan pelayanan
            layanan.setHarapanPelayanan("Pelayanan yang lebih cepat");

            // Menampilkan hasil
            layanan.print();

            System.out.println("=====================================");
            System.out.println("--- Blok IV. Persepsi Terhadap Aspek Pelayanan ---");
            String[] pertanyaan = {
                "1. Pelayanan mudah dipahami dan di penuhi          ",
                "2. Kejelasan informasi dan alur prosedur pelayanan ",
                "3. Sikap petugas saat memberikan pelayanan         ",
                "4. Kemampuan petugas saat memberikan informasi     ",
                "5. Waktu pelayanan sesuai jadwal yang ditetapkan   ",
                "6. Pencapaian target/target penyelesaian           ",
                "7. Informasi biaya/tarif pelayanan jelas           ",
                "8. Sarana prasarana pendukung pelayanan            ",
                "9. Kejelasan fasilitas pengaduan                   "
            };
    
            int[] tingkatKepuasan = {1,3,4,3,1,3,4,2,4};
    
            Persepsi[] persepsi = new Persepsi[pertanyaan.length];
    
            // Inisialisasi objek Persepsi dan set tingkat kepuasan
            for (int i = 0; i < persepsi.length; i++) {
                persepsi[i] = new Persepsi();
                System.out.print(pertanyaan[i] + " : ");
                persepsi[i].setTingkatKepuasan(tingkatKepuasan[i]);
            }        
        } catch (IllegalArgumentException e) {
            // Menangani exception jika validasi gagal
            System.out.println("Error: " + e.getMessage());
        }

    try{  
        System.out.println(); 
        System.out.println("<< DATA INVALID >>");
        // Membuat objek Pencacah dengan input yang valid
        System.out.println();
        System.out.println("--- Blok I. Keterangan Petugas ---");
        Pencacah pencacah = new Pencacah();
        pencacah.setNama("Fauzan Alfaraby");
        pencacah.setTanggalPencacahan(LocalDate.of(2024, 3, 1));
        pencacah.setTandaTangan("Fauzan Alfa");

        // Menampilkan informasi Pencacah
        System.out.println("Nama Pencacah       : " + pencacah.getNama());
        System.out.println("Tanggal Pencacahan  : " + pencacah.getTanggalPencacahan());
        System.out.println("Tanda Tangan        : " + pencacah.getTandaTangan());

        // Membuat objek Pengawas dengan input yang valid
        Pengawas pengawas = new Pengawas();
        pengawas.setNama("Alfarabyyyyyyyyyyyyyyyyyyyyy");
        pengawas.setTanggalPencacahan(null);
        pengawas.setTandaTangan("Alfaraby");
        System.out.println();

        // Menampilkan informasi Pengawas
        System.out.println("Nama Pengawas       : " + pengawas.getNama());
        System.out.println("Tanggal Pengawasan  : " + pengawas.getTanggalPencacahan());
        System.out.println("Tanda Tangan        : " + pengawas.getTandaTangan());
        
        //Membuat objek responden dengan input yang valid
        System.out.println("=====================================");
        Responden responden = new Responden();
        responden.setNama("Janitra Hayu 22");
        responden.setUmur(15);
        responden.setJenisKelamin(3);
        responden.setPendidikanTerakhir(8);
        responden.setPekerjaanUtama(0);
        responden.setNamaInstitusi("BPS");

        //Menampilkan informasi responden
        System.out.println("--- Blok II. Keterangan Responden ---");
        responden.print();

        System.out.println("=====================================");
        
        //menampilkan informasi akses layanan
        System.out.println("--- Blok III. Akses Layanan ---");
        aksesLayanan layanan = new aksesLayanan();
        layanan.setPelayanan(0, "0");
        layanan.setPelayanan(1, "2");
        layanan.setPelayanan(2, "10");
        layanan.setPelayanan(3, "8");
        layanan.setPelayanan(4, "16");
        layanan.setPelayanan(5, "30");
    
        // Menambahkan fasilitas
        layanan.setFasilitas(0, "1");
        layanan.setFasilitas(1, "3");
        layanan.setFasilitas(3, "7");
        layanan.setFasilitas(4, "8");

        // Menambahkan harapan pelayanan
        layanan.setHarapanPelayanan("Pelayanan yang lebih cepat");

        // Menampilkan hasil
        layanan.print();

        System.out.println("=====================================");
        System.out.println("--- Blok IV. Persepsi Terhadap Aspek Pelayanan ---");
        String[] pertanyaan = {
            "1. Pelayanan mudah dipahami dan di penuhi          ",
            "2. Kejelasan informasi dan alur prosedur pelayanan ",
            "3. Sikap petugas saat memberikan pelayanan         ",
            "4. Kemampuan petugas saat memberikan informasi     ",
            "5. Waktu pelayanan sesuai jadwal yang ditetapkan   ",
            "6. Pencapaian target/target penyelesaian           ",
            "7. Informasi biaya/tarif pelayanan jelas           ",
            "8. Sarana prasarana pendukung pelayanan            ",
            "9. Kejelasan fasilitas pengaduan                   "
        };

        int[] tingkatKepuasan = {1,3,4,3,1,3,5,2,0};

        Persepsi[] persepsi = new Persepsi[pertanyaan.length];

        // Inisialisasi objek Persepsi dan set tingkat kepuasan
        for (int i = 0; i < persepsi.length; i++) {
            persepsi[i] = new Persepsi();
            System.out.print(pertanyaan[i] + " : ");
            persepsi[i].setTingkatKepuasan(tingkatKepuasan[i]);
        }        
    } catch (IllegalArgumentException e) {
        // Menangani exception jika validasi gagal
        System.out.println("Error: " + e.getMessage());
    }
    }
}


