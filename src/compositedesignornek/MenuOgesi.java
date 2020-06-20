/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignornek;

/**
 *
 * @author lenovo
 */
public class MenuOgesi extends MenuBilesen{

    String isim;
    String bilgi;
    double fiyat;
    
    public MenuOgesi(String isim, String bilgi, double fiyat){
        this.isim = isim;
        this.bilgi = bilgi;
        this.fiyat = fiyat;
    }
    
    public String getMenuAdi() {
        return isim;
    }
    
    public String getMenuBilgisi() {
        return bilgi;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void yazdir() {
        System.out.println("Yemek İsmi: " + isim );
        System.out.println("Yemek Bilgisi: " + bilgi);
        System.out.println("Yemek Fiyatı: " + fiyat +" TL");
    }


}
