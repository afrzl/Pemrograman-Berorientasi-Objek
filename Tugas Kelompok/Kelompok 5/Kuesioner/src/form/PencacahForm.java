package form;

import entity.B2Pencacah;

public class PencacahForm extends Form {
  private B2Pencacah pencacah;

  public PencacahForm() {}

  public PencacahForm(B2Pencacah pencacah) {
    this.pencacah = pencacah;
  }

  public B2Pencacah getPencacah() {
    return pencacah;
  }

  public void setPencacah(B2Pencacah pencacah) {
    this.pencacah = pencacah;
  }

  @Override
  public boolean validate() {
    try {
      if (pencacah.getNama().length() > 30) {
        super.addErrorMessages("Invalid name: more than 30 characters.");
      }
      if (!pencacah.getNo_hp().matches("^08[0-9]{9,}$")) {
        super.addErrorMessages("Invalid number phone.");
      }
    } catch (Exception e) {
      super.addErrorMessages("Isian harus diisi semua.");
    }

    return super.getErrorMessages().isEmpty();
  }

  @Override
  public boolean save() {
    System.out.println("  >> Save here...");
    return true;
  }

  @Override
  public void reset() {
    pencacah.setNama("");
    pencacah.setNo_hp("");
    pencacah.setTanggal(null);
  }

  @Override
  public void print() {
    System.out.println("2.01. Nama: " + pencacah.getNama());
    System.out.println("2.02. Nomor Telepon: " + pencacah.getNo_hp());
    System.out.println("2.03. Tanggal Pelaksanaan: " + pencacah.getTanggal());
  }
}
