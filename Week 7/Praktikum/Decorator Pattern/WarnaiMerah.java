/**
 * WarnaiMerah
 */
public class WarnaiMerah extends WarnaiPakaian {

  public WarnaiMerah(Pakaian warnai) {
    super(warnai);
  }

  @Override
  public void pakai() {
    warnai.pakai();
    setWarnaPakaian(warnai);
  }

  private void setWarnaPakaian(Pakaian warnai) {
    System.out.println("Warna Border : Merah");
  }
}
