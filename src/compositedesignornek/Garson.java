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
public class Garson {
    MenuBilesen tumMenuler;
    public Garson(MenuBilesen tumMenuler){
        this.tumMenuler = tumMenuler;
    }
    
    public void menuyuYazdir(){
        tumMenuler.yazdir();
    }
}
