import java.util.Scanner;
import javax.swing.*;

class Barang{
    private String ID;
    private String nama;
    private String jenis;
    private int jumlah;
    private double harga;
    private String keterangan;

    void setElement(String ID, String nama, String jenis, int jumlah, double harga, String keterangan){
        this.ID = ID;
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga = harga;
        this.keterangan = keterangan;
    }

    String getID(){
        return this.ID;
    }

    void setNama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return this.nama;
    }

    void setJenis(String jenis){
        this.jenis = jenis;
    }
    String getJenis(){
        return this.jenis;
    }

    void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    int getJumlah(){
        return this.jumlah;
    }
    void increaseJumlah(int amt){
        this.jumlah += amt;
    }
    void increaseJumlah(){
        this.jumlah++;
    }
    void reduceJumlah(int amt){
        this.jumlah -= amt;
    }
    void reduceJumlah(){
        this.jumlah--;
    }

    void setHarga(double harga){
        this.harga = harga;
    }
    double getHarga(){
        return this.harga;
    }

    void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    String getKeterangan(){
        return this.keterangan;
    }

}

class detailTransaksi{
    private String transaksiID;
    private String barangID;
    private int jumlah;

    String getTransaksiID() {
        return transaksiID;
    }
    void setTransaksiID(String transaksiID) {
        this.transaksiID = transaksiID;
    }

    String getBarangID() {
        return barangID;
    }
    void setBarangID(String barangID) {
        this.barangID = barangID;
    }

    int getJumlah() {
        return jumlah;
    }
    void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

class Tanggal{
    private int tahun;
    private int bulan;
    private int hari;
    private int jam;
    private int menit;

    void setTanggal(int tahun, int bulan, int hari, int jam, int menit){
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
        this.jam = jam;
        this.menit = menit;
    }

    void printTanggal(){
        System.out.printf("%d/%d/%d, %d:%d", this.hari, this.bulan, this.tahun, this.jam, this.menit);
    }
}

class HeaderTransaksi{
    private String transaksiID;
    private String nama;
    private String staff;
    Tanggal tanggalTransaksi;

    String getTransaksiID() {
        return transaksiID;
    }
    void setTransaksiID(String transaksiID) {
        this.transaksiID = transaksiID;
    }

    String getNama() {
        return nama;
    }
    void setNama(String nama) {
        this.nama = nama;
    }

    String getStaff() {
        return staff;
    }
    void setStaff(String staff) {
        this.staff = staff;
    }
}

public class mainFile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int option = 0;
        int i = 0;
        do{
            System.out.println("Apotek");
            System.out.println("===========");
            System.out.println("1. Transaksi");
            System.out.println("2. Ubah Stok");
            System.out.println("3. Cek Data Obat");
            System.out.println("4. Exit");
            System.out.println("Pilih Opsi : "); option = scan.nextInt();

            switch (option) {
                case 1:
                // Function Transaksi    
                    break;
                case 2:
                // Function Ubah Stok
                    break;
                case 3:
                // Function Cek data obat
                    break;
            }
        }while(i != 4);
        scan.close();
    }
}