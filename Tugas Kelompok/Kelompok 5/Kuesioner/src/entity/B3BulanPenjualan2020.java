package entity;

import java.util.*;

public class B3BulanPenjualan2020 {
  private List<Integer> bulan;

  public B3BulanPenjualan2020() {}

  public List<Integer> getBulan() {
    return bulan;
  }

  public void setBulan(List<Integer> bulan) {
    this.bulan = bulan;
  }

  public void addBulan(Integer bulan) {
    if (this.bulan == null) {
      this.bulan = new ArrayList<Integer>();
    }
    this.bulan.add(bulan);
  }

  public void print() {
    System.out.println(
      "Bulan melakukan usaha penjualan online di tahun 2020: "
    );
    for (Integer bln : bulan) {
      switch (bln) {
        case 1:
          System.out.print("Januari");
          break;
        case 2:
          System.out.print("Februari");
          break;
        case 3:
          System.out.print("Maret");
          break;
        case 4:
          System.out.print("April");
          break;
        case 5:
          System.out.print("Mei");
          break;
        case 6:
          System.out.print("Juni");
          break;
        case 7:
          System.out.print("Juli");
          break;
        case 8:
          System.out.print("Agustus");
          break;
        case 9:
          System.out.print("September");
          break;
        case 10:
          System.out.print("Oktober");
          break;
        case 11:
          System.out.print("November");
          break;
        case 12:
          System.out.print("Desember");
          break;
        default:
          break;
      }
      System.out.print(", ");
    }
    System.out.println();
  }
}
