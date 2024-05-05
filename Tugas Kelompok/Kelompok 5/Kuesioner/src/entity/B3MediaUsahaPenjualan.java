package entity;

import java.util.ArrayList;
import java.util.List;

public class B3MediaUsahaPenjualan {
  private Integer website;
  private String namaWebsite;
  private Integer email;
  private Integer pesanInstan;
  private List<String> listPesanInstan;
  private Integer mediaSosial;
  private List<String> listMediaSosial;
  private Integer marketplace;
  private List<String> listMarketplace;

  public B3MediaUsahaPenjualan() {}

  public Integer getEmail() {
    return email;
  }

  public List<String> getListMarketplace() {
    return listMarketplace;
  }

  public List<String> getListMediaSosial() {
    return listMediaSosial;
  }

  public List<String> getListPesanInstan() {
    return listPesanInstan;
  }

  public Integer getMarketplace() {
    return marketplace;
  }

  public Integer getMediaSosial() {
    return mediaSosial;
  }

  public String getNamaWebsite() {
    return namaWebsite;
  }

  public Integer getPesanInstan() {
    return pesanInstan;
  }

  public Integer getWebsite() {
    return website;
  }

  public void setEmail(Integer email) {
    this.email = email;
  }

  public void setListMarketplace(List<String> listMarketplace) {
    this.listMarketplace = listMarketplace;
  }

  public void setListMediaSosial(List<String> listMediaSosial) {
    this.listMediaSosial = listMediaSosial;
  }

  public void setListPesanInstan(List<String> listPesanInstan) {
    this.listPesanInstan = listPesanInstan;
  }

  public void setMarketplace(Integer marketplace) {
    this.marketplace = marketplace;
  }

  public void setMediaSosial(Integer mediaSosial) {
    this.mediaSosial = mediaSosial;
  }

  public void setNamaWebsite(String namaWebsite) {
    this.namaWebsite = namaWebsite;
  }

  public void setPesanInstan(Integer pesanInstan) {
    this.pesanInstan = pesanInstan;
  }

  public void setWebsite(Integer website) {
    this.website = website;
  }

  public void addListPesanInstan(String pesanInstan) {
    if (listPesanInstan == null) {
      listPesanInstan = new ArrayList<String>();
    }
    listPesanInstan.add(pesanInstan);
  }

  public void addListMediaSosial(String mediaSosial) {
    if (listMediaSosial == null) {
      listMediaSosial = new ArrayList<String>();
    }
    listMediaSosial.add(mediaSosial);
  }

  public void addListMarketplace(String marketplace) {
    if (listMarketplace == null) {
      listMarketplace = new ArrayList<String>();
    }
    listMarketplace.add(marketplace);
  }

  public void print() {
    System.out.println("Media usaha penjualan melalui internet: ");
    System.out.println("a. Website: " + (getWebsite() == 1 ? "Ya" : "Tidak"));
    if (getWebsite() == 1) {
      System.out.println("Nama website: " + namaWebsite.toString());
    }
    System.out.println("b. Email: " + (getEmail() == 1 ? "Ya" : "Tidak"));
    System.out.println(
      "c. Pesan Instan: " + (getPesanInstan() == 1 ? "Ya" : "Tidak")
    );
    if (getPesanInstan() == 1) {
      System.out.println("> Pesan instan yang digunakan: ");
      for (String pesanInstan : listPesanInstan) {
        System.out.print(pesanInstan + ", ");
      }
      System.out.println();
    }
    System.out.println(
      "d. Media Sosial: " + (getMediaSosial() == 1 ? "Ya" : "Tidak")
    );
    if (getMediaSosial() == 1) {
      System.out.println("> Media sosial yang digunakan: ");
      for (String mediaSosial : listMediaSosial) {
        System.out.print(mediaSosial + ", ");
      }
      System.out.println();
    }
    System.out.println(
      "e. Marketplace/platform digital: " +
      (getMarketplace() == 1 ? "Ya" : "Tidak")
    );
    if (getMarketplace() == 1) {
      System.out.println("> Marketplace yang digunakan: ");
      for (String marketplace : listMarketplace) {
        System.out.print(marketplace + ", ");
      }
      System.out.println();
    }
  }
}
