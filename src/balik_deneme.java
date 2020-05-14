class balik {
    private int yas;
    private String isim;
    public String renk;
    int aclik;
    
     void besle(int yemek) {
        this.aclik += yemek;
    }
     
     void besle(double yemek)
     {
         this.aclik += yemek;
     }

public balik () {
    
        this.isim = "isim degeri girilmedi.";
        this.renk = "renk degeri girilmedi.";
        this.yas = 2;
        this.aclik = 0;
    }

public balik(String isim, String renk, int yas, int aclik) {
        this.isim = isim;
        this.renk = renk;
        this.yas = yas;
        this.aclik = aclik;
    }
public balik(String isim, boolean renk, int yas) {
        this.isim = isim;
        renk = renk;
        this.yas = yas;}
        

public int getYas(){
        return yas; 
    }

public String getİsim() {
        return this.isim;
    }
    public int getAclik() {
        return this.aclik;
    }

public void setYas(int age){
        this.yas = yas;
}

public void setİsim(String isim){
        this.isim = isim;
}

public void setAclik(int aclik){
        this.aclik = aclik;
}



public  void yeniBalik(){
        System.out.println("Balığın adı: " + this.getİsim()
                + "\nBalığın yaşı: " + this.getYas() + "\nBalığın rengi : " +this.renk +"\nBalığın tokluğu : "+ this.getAclik() + "\n");
    }}


class Orando extends balik{
    private boolean renk;
    

    public Orando(String isim, int yas, boolean renk) {
        super(isim, renk, yas);
        this.renk = renk;
    }
    

    public boolean getRenk() {
        return this.renk;
    }
    
 
    public void setRenk(boolean renk) {
        this.renk = renk;
    }
    
    public void yeniBalik() {
        if(this.renk == true) {
            System.out.println("Balığın adı: " + this.getİsim()
            + "\nBalığın yaşı: " + this.getYas()
            + "\nBalığın rengi farklıdır."  + "\nBalığın tokluğu : "+ this.getAclik() +"\n");
        }else {
            System.out.println("Kedimizin adı: " + this.getİsim()
            + "\nBalığın yaşı: " + this.getYas()
            + "\nBalığın rengi farklı değildir." 
            + "\nBalığın tokluğu : "+ this.getAclik() +"\n");
        }
    }
    
}

public class balik_deneme {

    public static void main(String[] args) {
        // main method
        
        balik balik1, balik2, balik3;
        
        balik1 = new balik("Sevimli","turuncu",2,3);
        balik2 = new Orando("Oia", 3, true);
        balik3 = new Orando("Beyaz", 4, false);
        
        balik1.besle(5);
        balik3.besle(2);
                
        balik1.yeniBalik();
        balik2.yeniBalik();
        balik3.yeniBalik();

    }

}



  



