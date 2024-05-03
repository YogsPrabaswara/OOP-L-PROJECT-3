package pertemuan401;

import java.util.Scanner;

/**
 *
 * Nama : I Gede Yoga Prabaswara Jaya 
 * Nim : 2201010057
 * Date : 23-04-2024
 */
public class BukuTeman {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    String[][] BT = new String[brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    public void StoreData(){
        int idx = 0;
        raktif++;
        if (raktif > brs){
            System.out.println("Data sudah penuh");
            return;
        }
        if(raktif>0) {
            idx=raktif-1;
        }
        System.out.println("Menambahkan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
            
        System.out.print("Nama Teman : ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.print("Alamat Teman : ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("No.Telepon Teman : ");
        BT[idx][2] = dtIN.nextLine();
        
    }
    public void Update(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        System.out.println("Memperbarui Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Nama Teman : ");
        BT[idx][0] = dtIN.nextLine();

        System.out.print("Alamat Teman : ");
        BT[idx][1] = dtIN.nextLine();

        System.out.print("No.Telepon Teman : ");
        BT[idx][2] = dtIN.nextLine();
    }
    public void Destroy(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        System.out.println("Menghapus Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i = idx; i < raktif - 1; i++){
            BT[i] = BT[i + 1];
        }
        raktif--;
    }
    public void viewdata(){
        int posbrs = 0;
        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~~~");
        for(int i=0; i<raktif; i++){
            posbrs++;
            System.out.println("Record Number "+ i);
            System.out.println("Nama : "+ BT[i][0]);
            System.out.println("Alamat : "+ BT[i][1]);
            System.out.println("No.Telepon : "+ BT[i][2]);
        }
    }
}
