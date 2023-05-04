/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd8_a_7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import Exception.ExceptionNama;
import Exception.ExceptionGaji;
import Exception.ExceptionNomor;
import Exception.ExceptionId;
import Exception.ExceptionBonus;

public class UGD8_A_7 {

   public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String nama,noTelp,idAdmin,idCS;
        float gaji,bonusLembur,komisi;
        
        try{
            System.out.println("Masukan Nama CS : "); nama = br.readLine();
            System.out.println("Masukan Nomor Telpon : "); noTelp = br.readLine();
            System.out.println("Masukan Gaji Pokok : "); gaji = Float.parseFloat(br.readLine());
            System.out.println("Masukan ID CS : "); idCS = br.readLine();
            System.out.println("Masukan Bonus Bulanan : "); komisi = Float.parseFloat(br.readLine());
            System.out.println("============================================");
            CustomerService cs = new CustomerService(idCS,komisi,nama,noTelp,gaji);
            cs.showData();
            System.out.println("============================================");
        }catch (ExceptionNama e1){
            e1.showMessage();
        }catch (ExceptionNomor e2){
            e2.showMessage();
        }catch (ExceptionGaji e3){
            e3.showMessage();
        }catch (ExceptionId e4){
            System.out.println(e4.getMessage());
        }catch (ExceptionBonus e5){
            System.out.println(e5.getMessage());
        }catch (Exception e){}
       
           try{
            System.out.println("Masukan Nama Admin : "); nama = br.readLine();
            System.out.println("Masukan Nomor Telpon : "); noTelp = br.readLine();
            System.out.println("Masukan Gaji Pokok : "); gaji = Float.parseFloat(br.readLine());
            System.out.println("Masukan ID Admin : "); idAdmin = br.readLine();
            System.out.println("Masukan Bonus Bulanan : "); bonusLembur = Float.parseFloat(br.readLine());
            System.out.println("============================================");
            Admin Ad = new Admin(idAdmin,bonusLembur,nama,noTelp,gaji);
            Ad.showData();
            System.out.println("============================================");
        }catch (ExceptionNama e1){
            e1.showMessage();
        }catch (ExceptionNomor e2){
            e2.showMessage();
        }catch (ExceptionGaji e3){
            e3.showMessage();
        }catch (ExceptionId e4){
            System.out.println(e4.getMessage());
        }catch (ExceptionBonus e5){
            System.out.println(e5.getMessage());
        }catch (Exception e){}
    }
    
}
