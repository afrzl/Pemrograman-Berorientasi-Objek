package form;

import entity.B2Pengawas;

public class PengawasForm extends Form {
  private B2Pengawas pengawas;

  public PengawasForm() {}

  public PengawasForm(B2Pengawas pengawas) {
    this.pengawas = pengawas;
  }

  public B2Pengawas getPengawas() {
    return pengawas;
  }

  public void setPengawas(B2Pengawas pengawas) {
    this.pengawas = pengawas;
  }

  @Override
  public boolean validate() {
    if (pengawas.getNama().length() > 30) {
      super.addErrorMessages("Invalid name: more than 30 characters.");
    }
    if (!pengawas.getNo_hp().matches("^08[0-9]{9,}$")) {
      super.addErrorMessages("Invalid number phone.");
    }
    return super.getErrorMessages().isEmpty();
  }

  @Override
  public boolean save() {
    System.out.println("Save here...");
    return true;
  }

  @Override
  public void reset() {
    pengawas.setNama("");
    pengawas.setNo_hp("");
    pengawas.setTanggal(null);
  }

  @Override
  public void print() {
    System.out.println("2.01. Nama: " + pengawas.getNama());
    System.out.println("2.02. Nomor Telepon: " + pengawas.getNo_hp());
    System.out.println("2.03. Tanggal Pelaksanaan: " + pengawas.getTanggal());
  }
}
