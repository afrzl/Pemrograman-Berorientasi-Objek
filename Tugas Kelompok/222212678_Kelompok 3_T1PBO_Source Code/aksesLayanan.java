// 1. Blessy Munthia Purba [222212537]
// 2. Fauzan Alfaraby Nirwan [222212605]
// 3. Janitra Hayu Pramestya [222212678]

public class aksesLayanan {
    private String[] pelayanan;
    private String[] fasilitas;
    private String harapanPelayanan;

    public aksesLayanan() {
        this.pelayanan = new String[6]; // Sesuaikan dengan jumlah jenis layanan
        this.fasilitas = new String[4]; // Sesuaikan dengan jumlah fasilitas
        this.harapanPelayanan = "";
    }

    public String[] getPelayanan() {
        return pelayanan;
    }

    public void setPelayanan(int index, String layanan) {
        if(index >= 0 && index < pelayanan.length) {
            pelayanan[index] = layanan;
        } else {
            System.out.println("Index tidak valid");
        }
    }

    public String[] getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(int index, String fasilitas1) {
        if(index >= 0 && index < fasilitas.length) {
            fasilitas[index] = fasilitas1;
        } else {
            System.out.println("Index tidak valid");
        }
    }

    public String getHarapanPelayanan() {
        return harapanPelayanan;
    }

    public void setHarapanPelayanan(String harapanPelayanan) {
        if (harapanPelayanan != null){
            this.harapanPelayanan = harapanPelayanan;
        } else {
            System.out.println("Harapan Pelayanan tidak boleh kosong");
        }
    }

    public void print(){
        System.out.println("Jenis Pelayanan yang diterima (boleh pilih lebih dari 1 jawaban)");
        for (String layanan : pelayanan) {
            if (layanan != null) {
                switch (layanan) {
                    case "1": System.out.println("- Jenis Layanan 1"); break;
                    case "2": System.out.println("- Jenis Layanan 2"); break;
                    case "4": System.out.println("- Jenis Layanan 3"); break;
                    case "8": System.out.println("- Jenis Layanan 4"); break;
                    case "16": System.out.println("- Jenis Layanan 5"); break;
                    case "32": System.out.println("- Jenis Layanan 6"); break;
                    default: System.out.println("Warning : Jenis Layanan tidak valid"); break;
                }
            }
        }
        System.out.println();
        System.out.println("Fasilitas yang digunakan untuk memperoleh pelayanan (boleh pilih lebih dari 1 jawaban)");
        for (String fasilitas1 : fasilitas) {
            if (fasilitas1 != null) {
                switch (fasilitas1) {
                    case "1": System.out.println("- Telp/Faks"); break;
                    case "2": System.out.println("- E-Mail"); break;
                    case "4": System.out.println("- Surat"); break;
                    case "8": System.out.println("- Lainnya"); break;
                    default: System.out.println("Warning : Fasilitas tidak valid"); break;
                }
            }
        }
        System.out.println();
        System.out.println("Jenis Pelayanan yang diharapkan: " + getHarapanPelayanan());
    }
}

    
