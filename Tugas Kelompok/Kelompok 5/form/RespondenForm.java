public class RespondenForm extends Form {
  private Responden responden;

  public RespondenForm() {}

  public RespondenForm(Responden responden) {
    this.responden = responden;
  }

  public Responden getResponden() {
    return responden;
  }

  public void setResponden(Responden responden) {
    this.responden = responden;
  }

  @Override
  public validate() {
    if (responden.getNama.length() > 30) {
      super.addErrorMessages("Invalid name: more than 30 characters.");
    }
    if (!responden.getNo_hp.matches("^(?=(?:[8-9]){1})(?=[0-9]{8}).*")) {
      super.addErrorMessages("Invalid number phone.");
    }
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
    responden.setTanggal("");
  }

  @Override
  public void print() {
    System.out.println("Nama: " + responden.getNama());
    System.out.println("Nomor Telepon: " + responden.getNo_hp());
    System.out.println("Tanggal Pelaksanaan: " + responden.getTanggal());
  }
}
