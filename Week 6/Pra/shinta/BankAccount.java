// package bankaccount;

// import java.util.ArrayList; // import the ArrayList class
// import java.util.Random;
// /**
//  * Kumpulan class untuk simulasi Transaksi Keuangan
//  * @author nanoy
//  */

// class Person {
//     // variables
//     private String nama;
//     private int umur;
//     // array list akun bank (aggregation)
//     private ArrayList<BankAccount> akunBank = new ArrayList<>();
    
//     //constructor
//     public Person (String nama, int umur) {
//         this.nama = nama;
//         this.umur = umur;
//         System.out.println("Objek Person " + nama + " Tercipta!!!");
//     }

//     public String getNama() {
//         return nama;
//     }

//     public int getUmur() {
//         return umur;
//     }
    
//     // membuka akun bank baru untuk objek person 
//     public void bukaAkunBank (String namaBank,String kodeBank,double setoranAwal) {
//         akunBank.add(new BankAccount(namaBank, kodeBank, setoranAwal, this.nama));
//         System.out.println(this.nama+ " ( Berhasil!!, Membuka Akun Bank " + namaBank + " Saldo awal : " + setoranAwal);
//     }
        
//     /**
//      * mengembalikan akunBank dari objek person berdasarkan parameter noRekening.
//      * @param noRekening (String)
//      * @return Akun Bank (BankAccount)
//      */
//     public BankAccount getAkunBank(String noRekening){
//         // int idxAkun = 0;
//         for (BankAccount akun:this.akunBank) {
//             if (akun.getNoRek().equals(noRekening)) {
//                     return akun;                
//             }
//             // idxAkun++;
//         }
//         return null;
//     }
    
//     /**
//      * Menampilkan daftar akun bank berupa no rekening dan nama bank dan saldo dari objek person.
//      * ====== Daftar Rekening Bank [NAMA Objek Person] ========
//      * 1. [BRI] [12312313] [Rp. xxxxx]
//      * 2. [BCA] [********] [Rp. xxxxx]
//      * 3.  ...
//     */
//     public void tampilListRekeningBank() {
//         System.out.println("====== Daftar Rekening Bank " + this.nama+ " ========");
//         int i = 1;

//         for(BankAccount akun : akunBank) {
//             System.out.println(i + ". " + akun.getBank() + " " + akun.getNoRek() + " Rp" + akun.getSaldo());
//             i++;
//         }
//         // TO DO
//         //============================================================================
//         // TAMBAHKAN KODE DISINI !!!
//         //==========================================================================
//         //done
//         System.out.println("================================================ ");
//     }
    
//     /**
//      * menghitung dan mengembalikan semua total saldo dari semua akunbank yg dimiliki objek person
//      * @return rekapSaldo  
//      */
//     public double rekapSaldoRekening() {
//         double rekapSaldo = 0;
//         for(BankAccount akun : akunBank) {
//             rekapSaldo += akun.getSaldo();
//         }
//         // TO DO
//         //==============================================================================
//         // TAMBAHKAN KODE DISINI
//         //==============================================================================
//         //done
//         System.out.println("Total Saldo Semua Rekening "+this.nama+ " : Rp." + rekapSaldo);
//         return rekapSaldo;
//     }
// }

// /**
//  * Class Bank
//  * @author nanoy
//  */
// class Bank {
//     public String namaBank;
//     public String kodeBank;
    
//     /** 
//      * mengenerate dan mengembalikan nomor rekening bank .
//      * panjang no.rekening HARUS 9 digit : (kode bank 3 digit + 6 digit).
//      * 
//      * @return nomorRekening dengan panjang 9 digit (String)
//     */     

//     public String generateNoRek() {
//         noRek = kodeBank;
//         int randomNum;
//         Random random = new Random();

//         for(int i = 0; i<6; i++) {
//             randomNum = random.nextInt(10);
//             noRek += String.valueOf(randomNum);
//         } 

//         // TO DO
//         //=========================================================
//         // TAMBAHKAN KODE DISINI !!!
//         //=========================================================
//         //done
//         return noRek; // ubah returnnya -> done
//     }

// }

// /**
//  * interface transaksi keuangan
//  */
// interface ITransaksi {
//     public void tarikSaldo(double jumlahUang);
//     public void setor(double jumlahUang);
//     public void transfer(double jumlahUang, Person p, String noRek);
    
// }

// /**
//  * BankAccount Class 
//  */
// public class BankAccount implements ITransaksi {
//     // composition
//     private Bank bank;
//     private String noRek; 
//     private double saldo;
//     // constructor
//     public BankAccount(String namaBank, String kodeBank, double depositAwal,String namaNasabah) {
//         this.bank = new Bank();
//         this.bank.kodeBank = kodeBank;
//         this.bank.namaBank = namaBank;
//         this.noRek = this.bank.generateNoRek();
//         this.saldo = depositAwal;        
//     }

//     /**
//      * method tarikSaldo, jumlah uang pada akun bank bersangkutan akan berkurang
//      * @param jumlahUang 
//      */
//     @Override
//     public void tarikSaldo(double jumlahUang) {
//         saldo -= jumlahUang;
//         // TO DO
//         //=============================
//         // TAMBAHKAN KODE DISINI !!!
//         //=============================
//         //done
//     }

//     /**
//      * method setor, jumlah uang pada akun bank bersangkutan akan bertambah
//      * @param jumlahUang 
//      */
//     @Override
//     public void setor(double jumlahUang) {
//         saldo += jumlahUang;
//         // TO DO
//         //===========================================
//         // TAMBAHKAN KODE DISINI !!
//         //===========================================
//         //done
//         System.out.println("Berhasil setor ke rekening sejumlah : Rp." + jumlahUang );
//     }
    
//     /**
//      * Method transfer, saldo akunbank pengirim akan berkurang dan saldo akunbank penerima akan bertambah
//      * sesuai jumlah uang yang ditransfer pada parameter.
//      * @param jumlahUang
//      * @param penerima
//      * @param noRek 
//      */
//     @Override
//     public void transfer(double jumlahUang, Person penerima, String noRek) {
//         saldo -= jumlahUang;
//         penerima.getAkunBank(noRek).saldo += jumlahUang;
//         // TO DO
//         // =====================================================
//         // TAMBAHKAN KODE DISINI !!!
//         // =====================================================
//         //done

//         System.out.println("Transfer berhasil ke "+noRek+" a.n. "+penerima.getNama()+
//                         " sebesar Rp. "+ jumlahUang);
//     }
    
//     public String getBank() {
//         return bank.namaBank;
//     }

//     public String getNoRek() {
//         return noRek;
//     }

//     public double getSaldo() {
//         return saldo;
//     }
// }

package bankaccount;

import java.util.ArrayList; // import the ArrayList class
import java.util.Random;
/**
 * Kumpulan class untuk simulasi Transaksi Keuangan
 * @author nanoy
 */

class Person {
    // variables
    private String nama;
    private int umur;
    // array list akun bank (aggregation)
    private ArrayList<BankAccount> akunBank = new ArrayList<>();

    //constructor
    public Person (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        System.out.println("Objek Person " + nama + " Tercipta!!!");
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
    
    // membuka akun bank baru untuk objek person 
    public void bukaAkunBank (String namaBank,String kodeBank,double setoranAwal) {
        akunBank.add(new BankAccount(namaBank, kodeBank, setoranAwal, this.nama));
        System.out.println(this.nama+ " ( Berhasil!!, Membuka Akun Bank " + namaBank + " Saldo awal : " + setoranAwal);
    }
        
    /**
     * mengembalikan akunBank dari objek person berdasarkan parameter noRekening.
     * @param noRekening (String)
     * @return Akun Bank (BankAccount)
     */
    public BankAccount getAkunBank(String noRekening){
        //int idxAkun = 0;
        for (BankAccount akun:this.akunBank) {
            if (akun.getNoRek().equals(noRekening)) {
                    //return this.akunBank.get(idxAkun); 
                    return akun;               
            }
            //idxAkun++;
        }
        return null;
    }
    
    /**
     * Menampilkan daftar akun bank berupa no rekening dan nama bank dan saldo dari objek person.
     * ====== Daftar Rekening Bank [NAMA Objek Person] ========
     * 1. [BRI] [12312313] [Rp. xxxxx]
     * 2. [BCA] [********] [Rp. xxxxx]
     * 3.  ...
    */
    public void tampilListRekeningBank() {
        System.out.println("====== Daftar Rekening Bank " + this.nama+ " ========");
        // TO DO
        //============================================================================
        // TAMBAHKAN KODE DISINI !!!
        //==========================================================================
        int index = 1;
        for (BankAccount akun : akunBank) {
            System.out.println(index + ". [" + akun.getBank() + "] [" + akun.getNoRek() + "] [Rp. " + akun.getSaldo() + "]");
            index++;
        }
        System.out.println("================================================ ");
    }
    
    /**
     * menghitung dan mengembalikan semua total saldo dari semua akunbank yg dimiliki objek person
     * @return rekapSaldo  
     */
    public double rekapSaldoRekening() {
        double rekapSaldo = 0;
        // TO DO
        //==============================================================================
        // TAMBAHKAN KODE DISINI
        //==============================================================================
        for (BankAccount akun : akunBank) {
            rekapSaldo += akun.getSaldo();
        }
        System.out.println("Total Saldo Semua Rekening " + this.nama + " : Rp. " + rekapSaldo);
        return rekapSaldo;
    }
}

/**
 * Class Bank
 * @author nanoy
 */
class Bank {
    public String namaBank;
    public String kodeBank;
    
    /** 
     * mengenerate dan mengembalikan nomor rekening bank .
     * panjang no.rekening HARUS 9 digit : (kode bank 3 digit + 6 digit).
     * 
     * @return nomorRekening dengan panjang 9 digit (String)
    */     
    public String generateNoRek() {
        //=========================================================
        // TAMBAHKAN KODE DISINI !!!
        //=========================================================
        Random random = new Random();
        int randomNum = random.nextInt(900000) + 100000;
        return kodeBank + randomNum;
        //return null; // ubah returnnya
    }
}

/**
 * interface transaksi keuangan
 */
interface ITransaksi {
    public void tarikSaldo(double jumlahUang);
    public void setor(double jumlahUang);
    public void transfer(double jumlahUang, Person p, String noRek);
}

/**
 * BankAccount Class 
 */
public class BankAccount implements ITransaksi {
    // composition
    private Bank bank;
    private String noRek; 
    private double saldo;
    // constructor
    public BankAccount(String namaBank, String kodeBank, double depositAwal,String namaNasabah) {
        this.bank = new Bank();
        this.bank.kodeBank = kodeBank;
        this.bank.namaBank = namaBank;
        this.noRek = this.bank.generateNoRek();
        this.saldo = depositAwal;        
    }

    /**
     * method tarikSaldo, jumlah uang pada akun bank bersangkutan akan berkurang
     * @param jumlahUang 
     */
    @Override
    public void tarikSaldo(double jumlahUang) {
        //=============================
        // TAMBAHKAN KODE DISINI !!!
        //=============================
        saldo -= jumlahUang;
        System.out.println("Berhasil menarik saldo sejumlah : Rp." + jumlahUang);
    }

    /**
     * method setor, jumlah uang pada akun bank bersangkutan akan bertambah
     * @param jumlahUang 
     */
    @Override
    public void setor(double jumlahUang) {
        // TO DO
        //===========================================
        // TAMBAHKAN KODE DISINI !!
        //===========================================
        saldo += jumlahUang;
        System.out.println("Berhasil setor ke rekening sejumlah : Rp." + jumlahUang );
        //System.out.println("Berhasil setor ke rekening sejumlah : Rp." + jumlahUang );
    }
    
    /**
     * Method transfer, saldo akunbank pengirim akan berkurang dan saldo akunbank penerima akan bertambah
     * sesuai jumlah uang yang ditransfer pada parameter.
     * @param jumlahUang
     * @param penerima
     * @param noRek 
     */
    @Override
    public void transfer(double jumlahUang,Person penerima, String noRek) {
        // TO DO
        // =====================================================
        // TAMBAHKAN KODE DISINI !!!
        // =====================================================
        this.tarikSaldo(jumlahUang);
        penerima.getAkunBank(noRek).setor(jumlahUang);
        System.out.println("Transfer berhasil ke "+noRek+" a.n. "+penerima.getNama()+
                        " sebesar Rp. "+ jumlahUang);
    }
    
    public String getBank() {
        return bank.namaBank;
    }

    public String getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }
}
