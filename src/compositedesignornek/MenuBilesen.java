/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignornek;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public abstract class MenuBilesen {
    
    
    public void ekle(MenuBilesen menuComponent){
        throw new UnsupportedOperationException();
    }
    public void cikar(MenuBilesen menuComponent){
        throw new UnsupportedOperationException();
    }
    public MenuBilesen getCocuk(int i){
        throw new UnsupportedOperationException();
    }  
    public double getFiyat(){
        throw new UnsupportedOperationException();
    } 
    public  String getMenuAdi(){
        throw new UnsupportedOperationException();
    }
    public  String getMenuBilgisi(){
        throw new UnsupportedOperationException();
    }
    public void yazdir(){
        throw new UnsupportedOperationException();
    }
}
