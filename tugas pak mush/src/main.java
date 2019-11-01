/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDULLAH
 */
import java.util.Scanner;
public class main {
       public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
           System.out.println("SILAHKAN MEMILIH CONTOH TUGAS YANG MANA YANG ANDA INGIN LAKUKAN:");
           System.out.println("1. menghitung luas persegi");
           System.out.println("2. mencari luas balok ");
           System.out.println("3. mencari luas KUBUS ");
          
           int masukan=input.nextInt();
           
           switch (masukan){
               case (1):
                   int hasilPersegi=LuasKotak();
                   System.out.println("Hasil dari diatas adalah"+ hasilPersegi);
                   break;
               case (2):
                   MenghitungLuasBalok();
                   break;
                case(3):
                    menghitungluasKubus();
                    break;
               default:
                   System.out.println("Pemanggilan anda salah");
                   break;
           }
           
    }
       static int LuasKotak(){
           Scanner input = new Scanner(System.in);
           System.out.print("Masukkan Sisi yang diinginkan: ");
           int sisi=input.nextInt();
           System.out.println("anda memanggil : " +sisi);
           System.out.println("cara kerja menghitung luas nya adalah sisi * sisi");
           int luas= sisi * sisi;
           return luas;
       }
       static int MenghitungLuasBalok(){
           System.out.println("Menghitung Luas Balok");
       double p,l,t,luaspt,luas,volume;
       Scanner input=new Scanner(System.in);
       System.out.print("masukkan nilai P: ");
       p=input.nextInt();
       System.out.print("masukkan Nilai L: ");
       
       l=input.nextInt();
           System.out.print("Masukkan LuasPt: ");
       luaspt=input.nextInt();
       t=luaspt/l;
        System.out.print("Tinggi dari balok adalah: " + t);
        volume= p*l*t;
        System.out.print("volume balok adalah: "+volume);
        luas = (2*p*l)+ (2*p*t)+(2*l*t);
        System.out.println("Luas balok adalah: "+luas);
       return 0;
       }
       static int menghitungluasKubus(){
        double sisi,luaspermukaan,volume,luassisikubus;
           System.out.println("Menghitung Luas Kubus");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang Sisi: ");
        sisi=input.nextDouble();
        luassisikubus=sisi*sisi;
        System.out.println("luas sisi kubusnya adalah "+luassisikubus);
        luaspermukaan=6*luassisikubus;
        System.out.println("luas permukaannya: "+luaspermukaan);
        System.out.println("Mencari volume!!!");
        volume=sisi*sisi*sisi;
        System.out.print("volumenyass adalah: "+ volume);
       return 0; 
    }
       
       }
       
}
