package entity;

public class B1KeteranganTempat {
  private Integer idProvinsi;
  private Integer idKabkota;
  private Integer idKecamatan;
  private Integer idDesa;
  private Integer noBs;
  private Integer noSubBs;
  private Integer noUsaha;
  private String namaUsaha;
  private String alamatUsaha;

  public B1KeteranganTempat() {}

  public Integer getIdProvinsi() {
    return idProvinsi;
  }

  public void setIdProvinsi(Integer idProvinsi) {
    this.idProvinsi = idProvinsi;
  }

  public Integer getIdKabkota() {
    return idKabkota;
  }

  public void setIdKabkota(Integer idKabkota) {
    this.idKabkota = idKabkota;
  }

  public Integer getIdKecamatan() {
    return idKecamatan;
  }

  public void setIdKecamatan(Integer idKecamatan) {
    this.idKecamatan = idKecamatan;
  }

  public Integer getIdDesa() {
    return idDesa;
  }

  public void setIdDesa(Integer idDesa) {
    this.idDesa = idDesa;
  }

  public Integer getNoBs() {
    return noBs;
  }

  public void setNoBs(Integer noBs) {
    this.noBs = noBs;
  }

  public Integer getNoSubBs() {
    return noSubBs;
  }

  public void setNoSubBs(Integer noSubBs) {
    this.noSubBs = noSubBs;
  }

  public Integer getNoUsaha() {
    return noUsaha;
  }

  public void setNoUsaha(Integer noUsaha) {
    this.noUsaha = noUsaha;
  }

  public String getNamaUsaha() {
    return namaUsaha;
  }

  public void setNamaUsaha(String namaUsaha) {
    this.namaUsaha = namaUsaha;
  }

  public String getAlamatUsaha() {
    return alamatUsaha;
  }

  public void setAlamatUsaha(String alamatUsaha) {
    this.alamatUsaha = alamatUsaha;
  }
}
