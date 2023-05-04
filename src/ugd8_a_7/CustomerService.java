/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_7;

import Exception.ExceptionNama;
import Exception.ExceptionGaji;
import Exception.ExceptionNomor;
import Exception.ExceptionId;
import Exception.ExceptionBonus;

public class CustomerService extends Pegawai implements IGaji {
    private String idCS;
    private float komisi;

    public CustomerService(String idCS, float komisi, String namaPegawai, String noTelp, float gajiPokok)
    throws ExceptionNama,ExceptionGaji,ExceptionNomor,ExceptionId,ExceptionBonus{
        super(namaPegawai, noTelp, gajiPokok);
        if(idCS.contains("CS-")){
            this.idCS = idCS;
        }else{
            throw new ExceptionId("[!]ID harus Mengandung 'CS-'");
        }
        
        if(komisi<300000 || komisi>1000000){
            throw new ExceptionBonus("[!] Komisi CS Harus diantara 300000 dan 1000000 [!]");
        }else{
            this.komisi = komisi;
        }
    }

   public void showData(){
        System.out.println("Nama Pegawai : "+namaPegawai);
        System.out.println("No Telp : "+noTelp);
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Id CS : "+idCS);
        System.out.println("komisi : "+komisi);
        System.out.println("Total Gaji : "+totalGaji());
    }
    
    public float totalGaji(){
        float total=0;
        total = (gajiPokok + komisi) - (gajiPokok+komisi)*0.02f;
        return total;
    }
    
    
}
