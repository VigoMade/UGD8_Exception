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

public class Admin extends Pegawai implements IGaji{
    private String idAdmin;
    private float bonusLembur;

    public Admin(String idAdmin, float bonusLembur, String namaPegawai, String noTelp, float gajiPokok)
    throws ExceptionNama,ExceptionGaji,ExceptionNomor,ExceptionId,ExceptionBonus{
        super(namaPegawai, noTelp, gajiPokok);
        if(idAdmin.contains("ADM-")){
            this.idAdmin = idAdmin;
        }else{
            throw new ExceptionId("[!]ID harus Mengandung 'ADM-'");
        }
        
        if(bonusLembur<500000 || bonusLembur>1200000){
            throw new ExceptionBonus("[!] Bonus Lembur Admin Harus diantara500000 dan 1200000 [!]");
        }else{
            this.bonusLembur = bonusLembur;
        }
        
    }

    public void showData(){
        System.out.println("Nama Pegawai : "+namaPegawai);
        System.out.println("No Telp : "+noTelp);
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Id Admin : "+idAdmin);
        System.out.println("bonus Lembur : "+bonusLembur);
        System.out.println("Total Gaji : "+totalGaji());
    }
    
    public float totalGaji(){
        float total=0;
        total = (gajiPokok + bonusLembur) - (gajiPokok+bonusLembur)*0.03f;
        return total;
    }
    
    
}
