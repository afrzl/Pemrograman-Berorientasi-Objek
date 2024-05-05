import entity.B1KeteranganTempat;
import entity.B2Pencacah;
import entity.B2Pengawas;
import entity.B2Responden;
import entity.B3BulanPenjualan2020;
import entity.B3JumlahTenagaKerja;
import entity.B3KegiatanUtamaUsaha;
import entity.B3MediaUsahaPenjualan;
import entity.B3MemilikiLaporanKeuangan;
import entity.B3MulaiPenjualanOnline;
import entity.B3OperasiKomersil;
import entity.B3PenanggungJawabUsaha;
import entity.B3PendapatanSebulan;
import entity.B3PersentasePendapatan;
import form.KeteranganTempatForm;
import form.KeteranganUsahaECommerceForm;
import form.PencacahForm;
import form.PengawasForm;
import form.RespondenForm;
import java.util.GregorianCalendar;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("---- BLOK I. KETERANGAN TEMPAT ---");
    KeteranganTempatForm keteranganTempatForm = new KeteranganTempatForm();
    B1KeteranganTempat keteranganTempat = new B1KeteranganTempat();
    keteranganTempat.setIdProvinsi(33);
    keteranganTempat.setIdKabkota(27);
    keteranganTempat.setIdKecamatan(12);
    keteranganTempat.setIdDesa(2004);
    keteranganTempat.setNoBs(01);
    keteranganTempat.setNoSubBs(02);
    keteranganTempat.setNoUsaha(00023);
    keteranganTempat.setNamaUsaha("Pabrik Olahan IT");
    keteranganTempat.setAlamatUsaha("Jalan Angkasa");
    keteranganTempatForm.setTempat(keteranganTempat);

    try {
      keteranganTempatForm.validate();
      List<String> errorMessages = keteranganTempatForm.getErrorMessages();
      for (String errorMessage : errorMessages) {
        throw new IllegalArgumentException(errorMessage);
      }

      keteranganTempatForm.save();
      keteranganTempatForm.print();
    } catch (IllegalArgumentException e) {
      System.out.println(">> " + e.getMessage());
    }

    System.out.println(
      "---- BLOK II. KETERANGAN PEMBERI JAWABAN DAN PETUGAS ---"
    );
    System.out.println("A. Data Responden: ");
    RespondenForm respondenForm = new RespondenForm();
    B2Responden responden = new B2Responden();
    responden.setNama("Muh. Nur Afrizal");
    responden.setNo_hp("082327040116");
    responden.setTanggal(new GregorianCalendar(2024, 05, 02));
    respondenForm.setResponden(responden);

    try {
      respondenForm.validate();
      List<String> errorMessages = respondenForm.getErrorMessages();
      for (String errorMessage : errorMessages) {
        throw new IllegalArgumentException(errorMessage);
      }
      respondenForm.save();
      respondenForm.print();
    } catch (IllegalArgumentException e) {
      System.out.println(">> " + e.getMessage());
    }

    System.out.println("B. Data Pencacah: ");
    PencacahForm pencacahForm = new PencacahForm();
    B2Pencacah pencacah = new B2Pencacah();
    pencacah.setNama("Arih Rahmawati");
    pencacah.setNo_hp("082327040116");
    pencacah.setTanggal(new GregorianCalendar(2024, 05, 02));
    pencacahForm.setPencacah(pencacah);

    try {
      pencacahForm.validate();
      List<String> errorMessages = pencacahForm.getErrorMessages();
      for (String errorMessage : errorMessages) {
        throw new IllegalArgumentException(errorMessage);
      }
      pencacahForm.save();
      pencacahForm.print();
    } catch (IllegalArgumentException e) {
      System.out.println(">> " + e.getMessage());
    }

    System.out.println("C. Data Pengawas: ");
    PengawasForm pengawasForm = new PengawasForm();
    B2Pengawas pengawas = new B2Pengawas();
    pengawas.setNama("Gilbert Rubenson");
    pengawas.setNo_hp("082327040116");
    pengawas.setTanggal(new GregorianCalendar(2024, 05, 02));
    pengawasForm.setPengawas(pengawas);

    try {
      pengawasForm.validate();
      List<String> errorMessages = pengawasForm.getErrorMessages();
      for (String errorMessage : errorMessages) {
        throw new IllegalArgumentException(errorMessage);
      }
      pengawasForm.save();
      pengawasForm.print();
    } catch (IllegalArgumentException e) {
      System.out.println(">> " + e.getMessage());
    }

    System.out.println("---- BLOK III. KETERANGAN USAHA ECOMMERCE ---");
    KeteranganUsahaECommerceForm keteranganUsahaECommerceForm = new KeteranganUsahaECommerceForm();
    B3PenanggungJawabUsaha penanggungJawabUsaha = new B3PenanggungJawabUsaha();
    penanggungJawabUsaha.setNama("Irsan Wirayudha");
    penanggungJawabUsaha.setUmur(20);
    penanggungJawabUsaha.setJk(1);
    penanggungJawabUsaha.setPendidikanTertinggi(2);
    keteranganUsahaECommerceForm.setPenanggungJawabUsaha(penanggungJawabUsaha);

    B3KegiatanUtamaUsaha kegiatanUtamaUsaha = new B3KegiatanUtamaUsaha();
    kegiatanUtamaUsaha.setKegiatanUtama("Isi ulang air mineral galon");
    kegiatanUtamaUsaha.setKodeKategori('S');
    kegiatanUtamaUsaha.setKbli(23);
    keteranganUsahaECommerceForm.setKegiatanUtamaUsaha(kegiatanUtamaUsaha);

    B3JumlahTenagaKerja jumlahTenagaKerja = new B3JumlahTenagaKerja();
    jumlahTenagaKerja.setPemilikLaki(1);
    jumlahTenagaKerja.setPemilikPr(0);
    jumlahTenagaKerja.setTkDibayarLaki(0);
    jumlahTenagaKerja.setTkDibayarPr(1);
    jumlahTenagaKerja.setTkTidakDibayarLaki(3);
    jumlahTenagaKerja.setTkTidakDibayarPr(5);
    keteranganUsahaECommerceForm.setJumlahTenagaKerja(jumlahTenagaKerja);

    B3OperasiKomersil operasiKomersil = new B3OperasiKomersil();
    operasiKomersil.setUsahaMulaiOperasi(2010);
    keteranganUsahaECommerceForm.setOperasiKomersil(operasiKomersil);

    B3MulaiPenjualanOnline mulaiPenjualanOnline = new B3MulaiPenjualanOnline();
    mulaiPenjualanOnline.setTahunMulaiPenjualanOnline(2015);
    keteranganUsahaECommerceForm.setMulaiPenjualanOnline(mulaiPenjualanOnline);

    B3MemilikiLaporanKeuangan memilikiLaporanKeuangan = new B3MemilikiLaporanKeuangan();
    memilikiLaporanKeuangan.setMemilikiLaporanKeuangan(1);
    keteranganUsahaECommerceForm.setMemilikiLaporanKeuangan(
      memilikiLaporanKeuangan
    );

    B3MediaUsahaPenjualan mediaUsahaPenjualan = new B3MediaUsahaPenjualan();
    mediaUsahaPenjualan.setWebsite(0);
    mediaUsahaPenjualan.setEmail(1);
    mediaUsahaPenjualan.setPesanInstan(1);
    mediaUsahaPenjualan.addListPesanInstan("Whatsapp");
    mediaUsahaPenjualan.addListPesanInstan("Telegram");
    mediaUsahaPenjualan.setMediaSosial(1);
    mediaUsahaPenjualan.addListMediaSosial("Twitter");
    mediaUsahaPenjualan.setMarketplace(0);
    keteranganUsahaECommerceForm.setMediaUsahaPenjualanOnline(
      mediaUsahaPenjualan
    );

    B3BulanPenjualan2020 bulanPenjualan2020 = new B3BulanPenjualan2020();
    bulanPenjualan2020.addBulan(4);
    bulanPenjualan2020.addBulan(5);
    bulanPenjualan2020.addBulan(6);
    keteranganUsahaECommerceForm.setBulanPenjualan2020(bulanPenjualan2020);

    B3PendapatanSebulan pendapatanSebulan = new B3PendapatanSebulan();
    pendapatanSebulan.setPendapatan(5000000);
    keteranganUsahaECommerceForm.setPendapatanSebulan(pendapatanSebulan);

    B3PersentasePendapatan persentasePendapatan = new B3PersentasePendapatan();
    persentasePendapatan.setOffline(10);
    persentasePendapatan.setMarketplace(40);
    persentasePendapatan.setNonMarketplace(50);
    keteranganUsahaECommerceForm.setPersentasePendapatan(persentasePendapatan);

    try {
      keteranganUsahaECommerceForm.validate();
      List<String> errorMessages = keteranganUsahaECommerceForm.getErrorMessages();
      for (String errorMessage : errorMessages) {
        throw new IllegalArgumentException(errorMessage);
      }

      keteranganUsahaECommerceForm.save();
      keteranganUsahaECommerceForm.print();
    } catch (IllegalArgumentException e) {
      System.out.println(">> " + e.getMessage());
    }
  }
}
