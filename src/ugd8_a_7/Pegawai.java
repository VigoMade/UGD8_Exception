/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_7;

import Exception.ExceptionNama;
import Exception.ExceptionGaji;
import Exception.ExceptionNomor;
        
public abstract class Pegawai {
     protected String namaPegawai;
    protected String noTelp;
    protected float gajiPokok;

    public Pegawai(String namaPegawai, String noTelp, float gajiPokok) 
    throws ExceptionNama,ExceptionGaji,ExceptionNomor{
        if(namaPegawai.trim().isEmpty()){
            throw new ExceptionNama();
        }else{
            this.namaPegawai = namaPegawai;
        }
        
        if(noTelp.length() < 11 || noTelp.length()>13){
            throw new ExceptionNomor();
        }else{
            this.noTelp = noTelp;
        }
        if(gajiPokok<2000000){
            throw new ExceptionGaji();
        }else{
            this.gajiPokok = gajiPokok;
        }
        
    }


    public abstract void showData();
}
