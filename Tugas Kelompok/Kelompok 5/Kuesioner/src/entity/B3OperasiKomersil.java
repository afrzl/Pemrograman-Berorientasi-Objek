package entity;

public class B3OperasiKomersil {
  private Integer usahaMulaiOperasi;

  public B3OperasiKomersil() {}

  public Integer getUsahaMulaiOperasi() {
    return usahaMulaiOperasi;
  }

  public void setUsahaMulaiOperasi(Integer usahaMulaiOperasi) {
    this.usahaMulaiOperasi = usahaMulaiOperasi;
  }

  public void print() {
    System.out.println(
      "Tahun usaha mulai beroperasi secara komersil: " + usahaMulaiOperasi
    );
  }
}
