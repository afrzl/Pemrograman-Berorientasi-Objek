// 1. Blessy Munthia Purba [222212537]
// 2. Fauzan Alfaraby Nirwan [222212605]
// 3. Janitra Hayu Pramestya [222212678]

public class Responden {
    private String nama;
    private int umur;
    private int jenisKelamin;
    private int pendidikanTerakhir;
    private int pekerjaanUtama;
    private String namaInstitusi;
    
    public Responden(){
    }

    public Responden(String nama, int umur, int jenisKelamin, int pendidikanTerakhir, int pekerjaanUtama, String namaInstitusi){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.pendidikanTerakhir = pendidikanTerakhir;
        this.pekerjaanUtama = pekerjaanUtama;
        this.namaInstitusi = namaInstitusi;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        if (nama != null && nama.trim().length() >= 5  && nama.trim().length() <= 25 ) {
            this.nama = nama;
            if (!nama.matches("[A-Za-z ]+")) {
            throw new IllegalArgumentException("Terdapat karakter yang tidak valid pada nama");
            }
        } else {
            throw new IllegalArgumentException("Nama tidak valid");
        }
    }
    public int getUmur() {
        return umur;

    }
    public void setUmur(int umur) {
        if (umur >= 17 && umur <= 100) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid");
        }
    }

    public int getJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(int jenisKelamin) {
        if (jenisKelamin == 1 || jenisKelamin == 2) {
            this.jenisKelamin = jenisKelamin;
        } else {
            System.out.println("Jenis Kelamin tidak valid");
        }
    }
    public int getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }
    public void setPendidikanTerakhir(int pendidikanTerakhir) {
        if (pendidikanTerakhir >=1 && pendidikanTerakhir <= 4){
            this.pendidikanTerakhir = pendidikanTerakhir;
        } else {
            System.out.println("Pendidikan tidak valid");
        }
    }
    public int getPekerjaanUtama() {
        return pekerjaanUtama;
    }
    public void setPekerjaanUtama(int pekerjaanUtama) {
        if (pekerjaanUtama >=1 && pekerjaanUtama <= 7){
            this.pekerjaanUtama = pekerjaanUtama;
        } else {
            System.out.println("Pekerjaan Utama tidak valid");
        }
    }
    public String getNamaInstitusi() {
        return namaInstitusi;
    }
    public void setNamaInstitusi(String namaInstitusi) {
        if (namaInstitusi != null){
            this.namaInstitusi = namaInstitusi;
        } else {
            System.out.println("Nama Institusi tidak valid");
        }
    }
    public String kodeToString (int kode){
        if (kode == 1){
            return "Laki-laki";
        } else if (kode == 2){
            return "Perempuan";
        }
        return null;
    }

    public void kodeString(String kode){
    }

    public void print(){
        System.out.println("Nama                      : " + getNama());
        System.out.println("Umur                      : " + getUmur());
        System.out.println("Jenis Kelamin             : " + kodeToString(jenisKelamin));
        System.out.print("Pendidikan Terakhir       : ");
        switch (pendidikanTerakhir) {
            case 1: System.out.println("<SMA atau sederajat"); break;
            case 2: System.out.println("D1/D2/D3");break;
            case 3: System.out.println("D4/S1");break;
            case 4: System.out.println("S2/S3");break;
        }
        System.out.print("Pekerjaan Utama           : ");
        switch (pekerjaanUtama) {
            case 1: System.out.println("Pelajar/Mahasiswa");break;
            case 2: System.out.println("Peneliti/Dosen");break;
            case 3: System.out.println("PNS/TNI/Polri");break;
            case 4: System.out.println("Pegawai BUMN/D");break;
            case 5: System.out.println("Pegawai swasta");break;
            case 6: System.out.println("Wiraswasta");break;
            case 7: System.out.println("Lainnya");break;
        }
        System.out.println("Nama instansi/institusi   : "+ getNamaInstitusi());
    }
}
