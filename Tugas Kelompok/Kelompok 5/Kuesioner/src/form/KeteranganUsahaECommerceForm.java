package form;

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

public class KeteranganUsahaECommerceForm extends Form {
  private B3PenanggungJawabUsaha penanggungJawabUsaha;
  private B3KegiatanUtamaUsaha kegiatanUtamaUsaha;
  private B3JumlahTenagaKerja jumlahTenagaKerja;
  private B3OperasiKomersil operasiKomersil;
  private B3MulaiPenjualanOnline mulaiPenjualanOnline;
  private B3MemilikiLaporanKeuangan memilikiLaporanKeuangan;
  private B3MediaUsahaPenjualan mediaUsahaPenjualanOnline;
  private B3BulanPenjualan2020 bulanPenjualan2020;
  private B3PendapatanSebulan pendapatanSebulan;
  private B3PersentasePendapatan persentasePendapatan;

  public KeteranganUsahaECommerceForm() {}

  public B3PenanggungJawabUsaha getPenanggungJawabUsaha() {
    return penanggungJawabUsaha;
  }

  public B3KegiatanUtamaUsaha getKegiatanUtamaUsaha() {
    return kegiatanUtamaUsaha;
  }

  public B3JumlahTenagaKerja getJumlahTenagaKerja() {
    return jumlahTenagaKerja;
  }

  public B3OperasiKomersil getOperasiKomersil() {
    return operasiKomersil;
  }

  public B3MulaiPenjualanOnline getMulaiPenjualanOnline() {
    return mulaiPenjualanOnline;
  }

  public B3MemilikiLaporanKeuangan getMemilikiLaporanKeuangan() {
    return memilikiLaporanKeuangan;
  }

  public B3MediaUsahaPenjualan getMediaUsahaPenjualanOnline() {
    return mediaUsahaPenjualanOnline;
  }

  public B3BulanPenjualan2020 getBulanPenjualan2020() {
    return bulanPenjualan2020;
  }

  public B3PendapatanSebulan getPendapatanSebulan() {
    return pendapatanSebulan;
  }

  public B3PersentasePendapatan getPersentasePendapatan() {
    return persentasePendapatan;
  }

  public void setPenanggungJawabUsaha(
    B3PenanggungJawabUsaha penanggungJawabUsaha
  ) {
    this.penanggungJawabUsaha = penanggungJawabUsaha;
  }

  public void setKegiatanUtamaUsaha(B3KegiatanUtamaUsaha kegiatanUtamaUsaha) {
    this.kegiatanUtamaUsaha = kegiatanUtamaUsaha;
  }

  public void setJumlahTenagaKerja(B3JumlahTenagaKerja jumlahTenagaKerja) {
    this.jumlahTenagaKerja = jumlahTenagaKerja;
  }

  public void setOperasiKomersil(B3OperasiKomersil operasiKomersil) {
    this.operasiKomersil = operasiKomersil;
  }

  public void setMulaiPenjualanOnline(
    B3MulaiPenjualanOnline mulaiPenjualanOnline
  ) {
    this.mulaiPenjualanOnline = mulaiPenjualanOnline;
  }

  public void setMemilikiLaporanKeuangan(
    B3MemilikiLaporanKeuangan memilikiLaporanKeuangan
  ) {
    this.memilikiLaporanKeuangan = memilikiLaporanKeuangan;
  }

  public void setMediaUsahaPenjualanOnline(
    B3MediaUsahaPenjualan mediaUsahaPenjualanOnline
  ) {
    this.mediaUsahaPenjualanOnline = mediaUsahaPenjualanOnline;
  }

  public void setBulanPenjualan2020(B3BulanPenjualan2020 bulanPenjualan2020) {
    this.bulanPenjualan2020 = bulanPenjualan2020;
  }

  public void setPendapatanSebulan(B3PendapatanSebulan pendapatanSebulan) {
    this.pendapatanSebulan = pendapatanSebulan;
  }

  public void setPersentasePendapatan(
    B3PersentasePendapatan persentasePendapatan
  ) {
    this.persentasePendapatan = persentasePendapatan;
  }

  public void validatePenanggungJawabUsaha() {
    if (penanggungJawabUsaha.getNama().length() > 30) {
      super.addErrorMessages("Invalid name: more than 30 characters.");
    }
    if (String.valueOf(penanggungJawabUsaha.getUmur()).length() > 2) {
      super.addErrorMessages("Invalid umur: more than 3 digits.");
    }
    if (
      !(penanggungJawabUsaha.getJk() == 0 || penanggungJawabUsaha.getJk() == 1)
    ) {
      super.addErrorMessages(
        "Invalid jenis kelamin: hanya bisa input 0 atau 1."
      );
    }

    if (
      !(penanggungJawabUsaha.getJk() >= 0 && penanggungJawabUsaha.getJk() <= 3)
    ) {
      super.addErrorMessages(
        "Invalid pendidikan tertinggi: hanya bisa input 0 - 3."
      );
    }
  }

  public void validateKegiatanUtamaUsaha() {
    Character kodeKategori[] = {
      'A',
      'C',
      'G',
      'H',
      'I',
      'J',
      'M',
      'N',
      'P',
      'Q',
      'R',
      'S',
    };
    boolean checkKodeKategori = false;
    for (Character kd : kodeKategori) {
      if (kegiatanUtamaUsaha.getKodeKategori() == kd) {
        checkKodeKategori = true;
        break;
      }
    }
    if (!checkKodeKategori) {
      super.addErrorMessages("Invalid kode kategori usaha.");
    }

    if (String.valueOf(kegiatanUtamaUsaha.getKbli()).length() != 2) {
      super.addErrorMessages("Kode KBLI harus berisi 2 digit.");
    }
  }

  public void validateJumlahTenagaKerja() {
    if (jumlahTenagaKerja.getTotalPemilik() < 1) {
      super.addErrorMessages("Jumlah tenaga kerja minimal 1 (pemilik)");
    }
  }

  public void validateOperasiKomersil() {
    if (
      !(
        operasiKomersil.getUsahaMulaiOperasi() > 1900 &&
        operasiKomersil.getUsahaMulaiOperasi() < 2025
      )
    ) {
      super.addErrorMessages("Invalid tahun mulai usaha komersil.");
    }
  }

  public void validateMulaiPenjualanOnline() {
    if (
      !(
        mulaiPenjualanOnline.getTahunMulaiPenjualanOnline() > 1900 &&
        mulaiPenjualanOnline.getTahunMulaiPenjualanOnline() < 2025
      )
    ) {
      super.addErrorMessages("Invalid tahun mulai penjualan online.");
    }
  }

  public void validateMemilikiLaporanKeuangan() {
    if (
      !(
        memilikiLaporanKeuangan.getMemilikiLaporanKeuangan() == 1 ||
        memilikiLaporanKeuangan.getMemilikiLaporanKeuangan() == 2
      )
    ) {
      super.addErrorMessages("Invalid memiliki laporan keuangan");
    }
  }

  public void validateMediaUsahaPenjualan() {
    if (
      !(
        mediaUsahaPenjualanOnline.getWebsite() == 0 ||
        mediaUsahaPenjualanOnline.getWebsite() == 1
      )
    ) {
      super.addErrorMessages("Invalid website.");
    }
    if (
      mediaUsahaPenjualanOnline.getWebsite() == 1 &&
      mediaUsahaPenjualanOnline.getNamaWebsite() == null
    ) {
      super.addErrorMessages("Invalid nama website.");
    }
    if (
      !(
        mediaUsahaPenjualanOnline.getEmail() == 0 ||
        mediaUsahaPenjualanOnline.getEmail() == 1
      )
    ) {
      super.addErrorMessages("Invalid email.");
    }
    if (
      !(
        mediaUsahaPenjualanOnline.getPesanInstan() == 0 ||
        mediaUsahaPenjualanOnline.getPesanInstan() == 1
      )
    ) {
      super.addErrorMessages("Invalid pesan instan.");
    }
    if (
      mediaUsahaPenjualanOnline.getPesanInstan() == 1 &&
      (mediaUsahaPenjualanOnline.getListPesanInstan().size() < 1)
    ) {
      super.addErrorMessages("Invalid pilihan pesan instan.");
    }
    if (
      !(
        mediaUsahaPenjualanOnline.getMediaSosial() == 0 ||
        mediaUsahaPenjualanOnline.getMediaSosial() == 1
      )
    ) {
      super.addErrorMessages("Invalid media sosial.");
    }
    if (
      mediaUsahaPenjualanOnline.getMediaSosial() == 1 &&
      (mediaUsahaPenjualanOnline.getListMediaSosial().size() < 1)
    ) {
      super.addErrorMessages("Invalid pilihan media sosial.");
    }
    if (
      !(
        mediaUsahaPenjualanOnline.getMarketplace() == 0 ||
        mediaUsahaPenjualanOnline.getMarketplace() == 1
      )
    ) {
      super.addErrorMessages("Invalid marketplace.");
    }
    if (
      mediaUsahaPenjualanOnline.getMarketplace() == 1 &&
      (mediaUsahaPenjualanOnline.getListMarketplace().size() < 1)
    ) {
      super.addErrorMessages("Invalid pilihan marketplace.");
    }
  }

  public void validateBulanPenjualan2020() {
    for (Integer bln : bulanPenjualan2020.getBulan()) {
      if (!(bln > 0 && bln < 13)) {
        super.addErrorMessages("Invalid bulan");
      }
    }
  }

  public void validatePendapatanSebulan() {
    if (pendapatanSebulan.getPendapatan() < 0) {
      super.addErrorMessages("Invalid Pendapatan");
    }
  }

  public void validatePersentasePendapatan() {
    if (
      !(
        persentasePendapatan.getOffline() >= 0 &&
        persentasePendapatan.getOffline() <= 100
      )
    ) {
      super.addErrorMessages("Invalid penjualan offline");
    }
    if (
      !(
        persentasePendapatan.getMarketplace() >= 0 &&
        persentasePendapatan.getMarketplace() <= 100
      )
    ) {
      super.addErrorMessages("Invalid penjualan marketplace");
    }
    if (
      !(
        persentasePendapatan.getNonMarketplace() >= 0 &&
        persentasePendapatan.getNonMarketplace() <= 100
      )
    ) {
      super.addErrorMessages("Invalid penjualan non marketplace");
    }
    if (persentasePendapatan.getTotal() != 100) {
      super.addErrorMessages("Invalid total persentase");
    }
  }

  @Override
  public boolean validate() {
    this.validatePenanggungJawabUsaha();
    this.validateKegiatanUtamaUsaha();
    this.validateJumlahTenagaKerja();
    this.validateOperasiKomersil();
    this.validateMulaiPenjualanOnline();
    this.validateMemilikiLaporanKeuangan();
    this.validateMediaUsahaPenjualan();
    this.validateBulanPenjualan2020();
    this.validatePendapatanSebulan();
    this.validatePersentasePendapatan();
    return super.getErrorMessages().isEmpty();
  }

  @Override
  public boolean save() {
    System.out.println("Save here...");
    return true;
  }

  @Override
  public void reset() {
    penanggungJawabUsaha.setNama(null);
    penanggungJawabUsaha.setUmur(null);
    penanggungJawabUsaha.setJk(null);
    penanggungJawabUsaha.setPendidikanTertinggi(null);

    kegiatanUtamaUsaha.setKbli(null);
    kegiatanUtamaUsaha.setKegiatanUtama(null);
    kegiatanUtamaUsaha.setKodeKategori(null);

    jumlahTenagaKerja.setPemilikLaki(null);
    jumlahTenagaKerja.setPemilikPr(null);
    jumlahTenagaKerja.setTkDibayarLaki(null);
    jumlahTenagaKerja.setTkDibayarPr(null);
    jumlahTenagaKerja.setTkTidakDibayarLaki(null);
    jumlahTenagaKerja.setTkTidakDibayarPr(null);

    operasiKomersil.setUsahaMulaiOperasi(null);

    mulaiPenjualanOnline.setTahunMulaiPenjualanOnline(null);

    memilikiLaporanKeuangan.setMemilikiLaporanKeuangan(null);

    mediaUsahaPenjualanOnline.setEmail(null);
    mediaUsahaPenjualanOnline.setListMarketplace(null);
    mediaUsahaPenjualanOnline.setListMediaSosial(null);
    mediaUsahaPenjualanOnline.setListPesanInstan(null);
    mediaUsahaPenjualanOnline.setMarketplace(null);
    mediaUsahaPenjualanOnline.setMediaSosial(null);
    mediaUsahaPenjualanOnline.setNamaWebsite(null);
    mediaUsahaPenjualanOnline.setPesanInstan(null);
    mediaUsahaPenjualanOnline.setWebsite(null);

    bulanPenjualan2020.setBulan(null);

    pendapatanSebulan.setPendapatan(null);

    persentasePendapatan.setMarketplace(null);
    persentasePendapatan.setNonMarketplace(null);
    persentasePendapatan.setOffline(null);
  }

  @Override
  public void print() {
    System.out.println("3.01. ");
    penanggungJawabUsaha.print();
    System.out.println("3.02. ");
    kegiatanUtamaUsaha.print();
    System.out.println("3.03. ");
    jumlahTenagaKerja.print();
    System.out.print("3.04. ");
    operasiKomersil.print();
    System.out.print("3.05. ");
    mulaiPenjualanOnline.print();
    System.out.print("3.06. ");
    memilikiLaporanKeuangan.print();
    System.out.println("3.07. ");
    mediaUsahaPenjualanOnline.print();
    System.out.print("3.08. ");
    bulanPenjualan2020.print();
    System.out.print("3.09. ");
    pendapatanSebulan.print();
    System.out.println("3.10. ");
    persentasePendapatan.print();
  }
}
