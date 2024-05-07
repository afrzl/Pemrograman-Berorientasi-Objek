package form;

import entity.B1KeteranganTempat;

public class KeteranganTempatForm extends Form {
  private B1KeteranganTempat tempat;

  public KeteranganTempatForm() {}

  public KeteranganTempatForm(B1KeteranganTempat tempat) {
    this.tempat = tempat;
  }

  public B1KeteranganTempat getTempat() {
    return tempat;
  }

  public void setTempat(B1KeteranganTempat tempat) {
    this.tempat = tempat;
  }

  @Override
  public boolean validate() {
    try {
      if (String.valueOf(tempat.getIdProvinsi()).length() != 2) {
        super.addErrorMessages("Invalid provinsi: ID Provinsi harus 2 digit.");
      }
      if (String.valueOf(tempat.getIdKabkota()).length() != 2) {
        super.addErrorMessages(
          "Invalid kabupaten/kota: ID Kabupaten/Kota harus 2 digit."
        );
      }
      if (String.valueOf(tempat.getIdKecamatan()).length() != 2) {
        super.addErrorMessages("Invalid kecamatan: ID Kecamatan harus 2 digit.");
      }
      if (String.valueOf(tempat.getIdDesa()).length() != 4) {
        super.addErrorMessages(
          "Invalid desa/kelurahan: ID Desa/Kelurahan harus 2 digit."
        );
      }
      if (String.valueOf(tempat.getNoBs()).length() != 4) {
        super.addErrorMessages(
          "Invalid Blok Sensus: Nomor Blok Sensus harus 4 digit."
        );
      }
      if (String.valueOf(tempat.getNoSubBs()).length() != 3) {
        super.addErrorMessages(
          "Invalid Sub Blok Sensus: Nomor Sub Blok Sensus harus 3 digit."
        );
      }
      if (String.valueOf(tempat.getNoUsaha()).length() != 4) {
        super.addErrorMessages(
          "Invalid Nomor Urut Usaha: Nomor Urut Usaha harus 4 digit."
        );
      }
    } catch (Exception e) {
      super.addErrorMessages("Isian harus diisi semua.");
    }

    return super.getErrorMessages().isEmpty();
  }

  @Override
  public void reset() {
    tempat.setIdProvinsi(null);
    tempat.setIdKabkota(null);
    tempat.setIdKecamatan(null);
    tempat.setIdDesa(null);
    tempat.setNoBs(null);
    tempat.setNoSubBs(null);
    tempat.setNoUsaha(null);
    tempat.setNamaUsaha(null);
    tempat.setAlamatUsaha(null);
  }

  @Override
  public boolean save() {
    System.out.println("  >> Save here...");
    return true;
  }

  @Override
  public void print() {
    System.out.println("1.01. Id Provinsi: " + tempat.getIdProvinsi());
    System.out.println("1.02. Id Kabupaten/Kota: " + tempat.getIdKabkota());
    System.out.println("1.03. Id Kecamatan: " + tempat.getIdKecamatan());
    System.out.println("1.04. Id Kelurahan/Desa/Nagari: " + tempat.getIdDesa());
    System.out.println("1.05. Nomor Blok Sensus: " + tempat.getNoBs());
    System.out.println("1.06. Nomor Sub Blok Sensus: " + tempat.getNoSubBs());
    System.out.println(
      "1.07. Nomor Urut Usaha/Perusahaan: " + tempat.getNoUsaha()
    );
    System.out.println("1.08. Nama Usaha/Perusahaan: " + tempat.getNamaUsaha());
    System.out.println(
      "1.09. Alamat Usaha/Perusahaan: " + tempat.getAlamatUsaha()
    );
  }
}
