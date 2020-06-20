package compositedesignornek;

public class CompositeDesignOrnek {

    public static void main(String[] args) {
        // TODO code application logic here
        MenuBilesen menuOgesi = new MenuOgesi("Karışık Tost", "Sucuklu ve Kaşarlı", 10);
        MenuBilesen menuOgesi2 = new MenuOgesi("Çay", "Sıcak İçecek",5);
        MenuBilesen menu = new Menu("Kahvaltı", "Eşsiz bir kahvaltı");
        MenuBilesen menu2 = new Menu("Akşam Yemeği","Nefis bir akşam yemeği");
        MenuBilesen menuOgesi3 = new MenuOgesi("Mercimek Çorbası", "Ara Sıcak", 10);
        MenuBilesen menuOgesi4 = new MenuOgesi("Tavuk Izgara", "Ana Yemek",20);
        menu2.ekle(menuOgesi3);
        menu2.ekle(menuOgesi4);
        MenuBilesen tumMenu = new Menu("Hotel Spesiyal", "2 Öğün Menü");
        menu.ekle(menuOgesi);
        menu.ekle(menuOgesi2);
        tumMenu.ekle(menu);
        tumMenu.ekle(menu2);
        Garson garson = new Garson(tumMenu);
        garson.menuyuYazdir();   
    }
}
