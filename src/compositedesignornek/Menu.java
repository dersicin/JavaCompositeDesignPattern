/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignornek;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Menu extends MenuBilesen{
    
    List<MenuBilesen> menuBilesenleri = new ArrayList();
    String menuAdi;
    String menuBilgisi;
    
    public Menu(String menuAdi,String menuBilgisi){
        this.menuAdi = menuAdi;
        this.menuBilgisi = menuBilgisi;
    }
    
    public void ekle(MenuBilesen menuComponent) {
        menuBilesenleri.add(menuComponent);
    }
    public void cikar(MenuBilesen menuComponent) {
        menuBilesenleri.remove(menuComponent);
    }
    public MenuBilesen getCocuk(int i) {
        return menuBilesenleri.get(i);
    }
    public String getMenuAdi() {
        return menuAdi;
    }
    public String getMenuBilgisi() {
        return menuBilgisi;
    } 

    public void yazdir() {
        System.out.println("Menü Adı: " + getMenuAdi() );
        System.out.println("Menü Bilgisi: " + getMenuBilgisi());
        
        Iterator menuIterator = menuBilesenleri.iterator();
        
        while(menuIterator.hasNext()){
            MenuBilesen menuBilgi = (MenuBilesen) menuIterator.next();
            menuBilgi.yazdir();
        }
    }
   
}
