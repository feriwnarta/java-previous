/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaAbstract;

/**
 *
 * @author Feri Winarta
 */
abstract public class Angkot {
    protected String merek;
    protected int tahunBuat;
    protected int jumlahBan;
    
    abstract void showMerek();
    
    abstract void showTahunBuat();
    
    abstract void showJumlahBan();
   

}


