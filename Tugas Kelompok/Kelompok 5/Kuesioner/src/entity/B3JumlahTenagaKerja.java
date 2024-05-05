package entity;

public class B3JumlahTenagaKerja {
  private Integer pemilikLaki;
  private Integer pemilikPr;
  private Integer tkDibayarLaki;
  private Integer tkDibayarPr;
  private Integer tkTidakDibayarLaki;
  private Integer tkTidakDibayarPr;

  public B3JumlahTenagaKerja() {}

  public Integer getPemilikLaki() {
    return pemilikLaki;
  }

  public Integer getPemilikPr() {
    return pemilikPr;
  }

  public Integer getTkDibayarLaki() {
    return tkDibayarLaki;
  }

  public Integer getTkDibayarPr() {
    return tkDibayarPr;
  }

  public Integer getTkTidakDibayarLaki() {
    return tkTidakDibayarLaki;
  }

  public Integer getTkTidakDibayarPr() {
    return tkTidakDibayarPr;
  }

  public void setPemilikLaki(Integer pemilikLaki) {
    this.pemilikLaki = pemilikLaki;
  }

  public void setPemilikPr(Integer pemilikPr) {
    this.pemilikPr = pemilikPr;
  }

  public void setTkDibayarLaki(Integer tkDibayarLaki) {
    this.tkDibayarLaki = tkDibayarLaki;
  }

  public void setTkDibayarPr(Integer tkDibayarPr) {
    this.tkDibayarPr = tkDibayarPr;
  }

  public void setTkTidakDibayarLaki(Integer tkTidakDibayarLaki) {
    this.tkTidakDibayarLaki = tkTidakDibayarLaki;
  }

  public void setTkTidakDibayarPr(Integer tkTidakDibayarPr) {
    this.tkTidakDibayarPr = tkTidakDibayarPr;
  }

  public Integer getTotalLaki() {
    return pemilikLaki + tkDibayarLaki + tkTidakDibayarLaki;
  }

  public Integer getTotalPr() {
    return pemilikPr + tkDibayarPr + tkTidakDibayarPr;
  }

  public Integer getTotalPemilik() {
    return pemilikLaki + pemilikPr;
  }

  public Integer getTotalTkDibayar() {
    return tkDibayarLaki + tkDibayarPr;
  }

  public Integer getTotalTkTidakDibayar() {
    return tkTidakDibayarLaki + tkTidakDibayarPr;
  }

  public Integer getGrandTotal() {
    return getTotalLaki() + getTotalPr();
  }

  public void print() {
    System.out.println("> Pemilik: ");
    System.out.println(
      "Laki-laki: " +
      getPemilikLaki() +
      "; Perempuan: " +
      getPemilikPr() +
      "; Total: " +
      getTotalPemilik()
    );
    System.out.println("> Tenaga Kerja Dibayar: ");
    System.out.println(
      "Laki-laki: " +
      getTkDibayarLaki() +
      "; Perempuan: " +
      getTkDibayarPr() +
      "; Total: " +
      getTotalTkDibayar()
    );
    System.out.println("> Tenaga Kerja Tidak Dibayar: ");
    System.out.println(
      "Laki-laki: " +
      getTkTidakDibayarLaki() +
      "; Perempuan: " +
      getTkTidakDibayarPr() +
      "; Total: " +
      getTotalTkTidakDibayar()
    );
    System.out.println("> Total: ");
    System.out.println(
      "Laki-laki: " +
      getTotalLaki() +
      "; Perempuan: " +
      getTotalPr() +
      "; Grand Total: " +
      getGrandTotal()
    );
  }
}
