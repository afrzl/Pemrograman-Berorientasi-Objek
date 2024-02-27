package bankaccount;

import java.util.Scanner; // untuk menampung input dari user
import java.util.ArrayList; // import the ArrayList class

/**
 * BankAccount Test aplikasi simulasi
 * @author nanoy
 * 
 */
public class BankAccountTest {
    
    static void tampilMenu(ArrayList<Person> p) {
        boolean quit = false;
        do { 
            System.out.println("==== Pilih Menu ====");
            System.out.println("1.Buat Objek Person!");
            System.out.println("2.Buat Akun Bank pada Objek Person!");
            System.out.println("3.Lihat daftar rekening dari objek Person!");
            System.out.println("4.Setor Uang ke Rekening dari objek Person");
            System.out.println("5.Tarik Uang dari Rekening objek Person");
            System.out.println("6.Transfer Uang!");
            System.out.println("7.Tampilkan daftar Objek Person!");
            System.out.println("=======================");

            Scanner in = new Scanner(System.in);
            System.out.println("Pilih Menu no : ");
            String menu = in.nextLine();

            switch(menu) {
                // buat objek person baru
                case "1" -> {
                    try {
                        String nama;
                        int umur; 
                        do {
                            System.out.println("Nama objek Person : (tidak boleh blank) ");
                            nama = in.nextLine();
                            nama =  nama.replaceAll("\\s", "");
                        }while(nama.equals(""));
                        System.out.println("Umur : ");
                        umur = in.nextInt();
                        p.add(new Person(nama,umur));
                    }catch(Exception e) {
                        System.out.println("Terjadi kesalahan input!");
                    }
                 }
                // buka akun bank dari objek person yang ada
                case "2" -> {
                    try {
                        // list objek person yang ada
                        for (int i=0;i<p.size();i++) {
                            System.out.println(String.format("%d. [nama: %s]",i+1,p.get(i).getNama()));
                        }
                        System.out.println("Pilih [No.Urut] objek person yang akan dibuat akun bank ? contoh: 1");
                        int i =  Integer.parseInt(in.nextLine());
                        System.out.println("Ketik Nama Bank : (contoh: BRI / BCA / BSI / BNI /...)");
                        String namaBank = in.nextLine();
                        System.out.println("Ketik Kode Bank 3 digit angka: (contoh: 002 / 003 / 005 / 006 /...)");
                        String kdBank = in.nextLine();
                        System.out.println("Masukkan jumlah setoran awal Rp. : (tanpa pemisah ribuan,contoh: 100000)");
                        Double setorAwal = in.nextDouble();
                        p.get(i-1).bukaAkunBank(namaBank, kdBank, setorAwal);
                    }catch (Exception e) {
                        System.out.println("Terjadi kesalahan input atau belum ada objek Person yang dibuat!");
                    }
                    
                }
                // lihat daftar rekening dari objek person yang ada
                case "3" -> {
                    try {
                        // list objek person yang ada
                        for (int i=0;i<p.size();i++) {
                            System.out.println(String.format("%d. [nama: %s]",i+1,p.get(i).getNama()));
                        }
                        System.out.println("Pilih [No.Urut] objek person yg ingin dilihat daftar rekeningnya ? contoh: 1");
                        int i =  Integer.parseInt(in.nextLine());
                        //tampilkan list rekening bank dari objek person terpilih
                        p.get(i-1).tampilListRekeningBank();
                    }catch (Exception e) {
                        System.out.println("Terjadi kesalahan input atau belum ada objek Person yang dibuat!");
                    }  
                }
                // setor uang ke salah satu rekening dari objek person
                case "4" -> {
                    try {
                        // list objek person yang ada
                        for (int i=0;i<p.size();i++) {
                            System.out.println(String.format("%d. [nama: %s]",i+1,p.get(i).getNama()));
                        }
                        System.out.println("Pilih [No.Urut] objek person yg ingin setor ? contoh: 1 / 2");
                        int i =  Integer.parseInt(in.nextLine());
                        // tampilkan daftar rekening dari objek terpilih
                        p.get(i-1).tampilListRekeningBank();
                        System.out.println("Pilih Nomor Rekening objek person yg ingin disetor (9 digit)? contoh: 002393873");
                        String noRek =  in.nextLine();
                        System.out.println("Masukkan jumlah uang (Rp.) yang ingin disetor ? contoh: 10000");
                        Double jumlahUang = in.nextDouble();
                        // Setorkan ke akunbank dari objek person terkait
                        BankAccount ba = p.get(i-1).getAkunBank(noRek);
                        //setor dilakukan
                        ba.setor(jumlahUang);
                        //tampilkan saldo akhir dari rek. yang disetor
                        System.out.println(String.format("Saldo akhir objek %s no.rek %s Bank %s adalah %f",
                                        p.get(i-1).getNama(),
                                        noRek,
                                        p.get(i-1).getAkunBank(noRek).getBank(),
                                        p.get(i-1).getAkunBank(noRek).getSaldo()
                                     ));
                    }catch (Exception e) {
                        System.out.println("Terjadi kesalahan Input atau No. Rekening Tidak Terdaftar!!");
                    }
                }
                // tarik uang dari salah satu rekening objek person
                case "5" -> {
                    try {
                        // list objek person yang ada
                        for (int i=0;i<p.size();i++) {
                            System.out.println(String.format("%d. [nama: %s]",i+1,p.get(i).getNama()));
                        }
                        System.out.println("Pilih [No.Urut] objek person yg ingin melakukan penarikan uang ? contoh: 1 / 2");
                        int i =  Integer.parseInt(in.nextLine());
                        // tampilkan daftar rekening dari objek terpilih
                        p.get(i-1).tampilListRekeningBank();
                        System.out.println("Pilih Nomor Rekening objek person yg ingin ditarik (9 digit)? contoh: 002393873");
                        String noRek =  in.nextLine();
                        System.out.println("Masukkan jumlah uang (Rp.) yang ingin ditarik (Pastikan saldo tersedia)? contoh: 10000");
                        Double jumlahUang = in.nextDouble();
                        // Setorkan ke akunbank dari objek person terkait
                        BankAccount ba = p.get(i-1).getAkunBank(noRek);
                        ba.tarikSaldo(jumlahUang);
                        System.out.println(String.format("Saldo akhir objek %s no.rek %s Bank %s adalah %f",
                                        p.get(i-1).getNama(),
                                        noRek,
                                        p.get(i-1).getAkunBank(noRek).getBank(),
                                        p.get(i-1).getAkunBank(noRek).getSaldo()
                                     ));
                    }catch (Exception e) {
                        System.out.println("Terjadi kesalahan Input atau No. Rekening Tidak Terdaftar!!");
                    }
                }
                case "6" -> {
                    try {
                        // list objek person yang ada
                        for (int i=0;i<p.size();i++) {
                            System.out.println(String.format("%d. [nama: %s]",i+1,p.get(i).getNama()));
                        }
                        System.out.println("Pilih [No.Urut] objek person yg ingin melakukan transfer/kirim uang ? contoh: 1 / 2");
                        int i =  Integer.parseInt(in.nextLine());
                        // tampilkan daftar rekening dari objek terpilih
                        p.get(i-1).tampilListRekeningBank();
                        System.out.println("Pilih Nomor Rekening Pengirim (9 digit)? contoh: 002393873");
                        String noRek =  in.nextLine();
                        System.out.println("Masukkan jumlah uang (Rp.) yang ingin dikirim (Pastikan saldo tersedia)? contoh: 10000");
                        Double jumlahUang = Double.parseDouble(in.nextLine());
                        // Dapatkan akun bank yang digunakan untuk mengirim/transfer
                        BankAccount ba = p.get(i-1).getAkunBank(noRek);                        
                        // Pilih penerima Transfer dari list objek person yang ada
                        for (int x=0;x<p.size();x++) {
                            System.out.println(String.format("%d. [nama: %s]",x+1,p.get(x).getNama()));
                        }
                        System.out.println("Pilih [No.Urut] objek person  penerima transfer uang ? contoh: 1 / 2");
                        int x =  Integer.parseInt(in.nextLine());
                        // tampilkan daftar rekening Penerima transfer (objek Person)
                        p.get(x-1).tampilListRekeningBank();
                        System.out.println("Pilih Nomor Rekening Penerima (9 digit)? contoh: 002393873");
                        String noRekPenerima =  in.nextLine();
                        // transfer
                        ba.transfer(jumlahUang, p.get(x-1), noRekPenerima);
                        // informasi saldo pengirim dan penerima
                        System.out.println(String.format(" (Pengirim) Saldo akhir objek %s no.rek %s Bank %s adalah %f",
                                        p.get(i-1).getNama(),
                                        noRek,
                                        p.get(i-1).getAkunBank(noRek).getBank(),
                                        p.get(i-1).getAkunBank(noRek).getSaldo()
                                     ));
                        System.out.println(String.format(" (Penerima) Saldo akhir objek %s no.rek %s Bank %s adalah %f",
                                        p.get(x-1).getNama(),
                                        noRekPenerima,
                                        p.get(x-1).getAkunBank(noRekPenerima).getBank(),
                                        p.get(x-1).getAkunBank(noRekPenerima).getSaldo()
                                     ));
                    }catch(Exception e) {
                         System.out.println("Terjadi kesalahan Input atau No. Rekening Tidak Terdaftar!!");
                    }
                }
                // tampilkan daftar objek Person yang ada
                case "7" -> {
                    for (int i=0;i<p.size();i++) {
                        System.out.println(String.format("%d. [nama: %s] [umur: %d] [total saldo semua bank : Rp. %f]",
                                        i+1,
                                        p.get(i).getNama(),
                                        p.get(i).getUmur(),
                                        p.get(i).rekapSaldoRekening()
                                    ));
                    }
                }
                // program dihentikan/selesai
                default -> {
                    System.out.println("Inputan Tidak Terdaftar, Program dihentikan!");
                    quit = true;
                }
            }
        }
        while(!quit);        
    }
    /**
     * Entry Point
     * @param args 
     */
    public static void main(String[] args)  {
        ArrayList<Person> p = new ArrayList();
        tampilMenu(p);        
    }
    
}
