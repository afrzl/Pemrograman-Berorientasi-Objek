package form;

import entity.B2Responden;

public class RespondenForm extends Form {
  private B2Responden responden;

  public RespondenForm() {}

  public RespondenForm(B2Responden responden) {
    this.responden = responden;
  }

  public B2Responden getResponden() {
    return responden;
  }

  public void setResponden(B2Responden responden) {
    this.responden = responden;
  }

  @Override
  public boolean validate() {
    if (responden.getNama().length() > 30) {
      super.addErrorMessages("Invalid name: more than 30 characters.");
    }
    if (!responden.getNo_hp().matches("^08[0-9]{9,}$")) {
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
    responden.setNama("");
    responden.setNo_hp("");
    responden.setTanggal(null);
  }

  @Override
  public void print() {
    System.out.println("2.01. Nama: " + responden.getNama());
    System.out.println("2.02. Nomor Telepon: " + responden.getNo_hp());
    System.out.println("2.03. Tanggal Pelaksanaan: " + responden.getTanggal());
  }
}
