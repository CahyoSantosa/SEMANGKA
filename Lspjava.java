/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lspjava;
import java.util.Scanner;

/**
 *
 * @author iniadji
 */
public class Lspjava {

    /**
     * @param args the command line arguments
     */
    
    private int jumlahPenumpang;
    private String kelas;
    private int harga;
    private int totalHarga;

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public void buy() {
        Scanner input = new Scanner(System.in);
        int pilih;
        
        System.out.println("Kelas Tiket : ");
        System.out.println("1.Ekonomi (Rp 15.000)");
        System.out.println("2.Bisnis (Rp 80.000)");
        System.out.println("3.Eksekutif (Rp 110.000)");
        System.out.print("Pilih Tiket : ");
        
        pilih = input.nextInt();
        switch(pilih) {
            case 1:
                this.setKelas("Ekonomi");
                this.setHarga(15000);
                break;
            case 2:
                this.setKelas("Bisnis");
                this.setHarga(80000);
                break;
            case 3:
                this.setKelas("Eksekutif");
                this.setHarga(110000);
               break;
           default:
               System.out.println("inputan tidak valid");
               System.exit(0);
       }
        
       System.out.print("Jumlah Penumpang : ");
       this.setJumlahPenumpang(input.nextInt());
       this.setTotalHarga(this.getHarga() * this.getJumlahPenumpang());
    }
    
    public void nota() {
        System.out.println("Nota :");
        System.out.println("Jenis Tiket : " + this.getKelas());
        System.out.println("Jumlah Penumpang : " + this.getJumlahPenumpang());
        System.out.println("Harga Tiket : " + this.getHarga());
        System.out.println("Total Harga : " + this.getTotalHarga());
    }
    
    public static void main(String[] args) {
        Lspjava tiket = new Lspjava();
        tiket.buy();
        System.out.println("=============================");
        tiket.nota();
    }
    
}
