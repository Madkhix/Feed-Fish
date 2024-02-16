class fish {
    private int age;
    private String name;
    public String color;
    int hunger;
    
     void feed(int food) {
        this.hunger += food;
    }
     
     void feed(double food)
     {
         this.hunger += food;
     }

public fish () {
    
        this.name = "Name value not entered.";
        this.color = "Color value not entered.";
        this.age = 2;
        this.hunger = 0;
    }

public fish(String name, String color, int age, int hunger) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hunger = hunger;
    }
public fish(String name, boolean color, int age) {
        this.name = name;
        color = color;
        this.age = age;}
        

public int getAge(){
        return age; 
    }

public String getName() {
        return this.name;
    }
    public int getHunger() {
        return this.hunger;
    }

public void setAge(int age){
        this.age = age;
}

public void setName(String name){
        this.name = name;
}

public void setHunger(int hunger){
        this.hunger = hunger;
}



public  void newFish(){
        System.out.println("Fish name: " + this.getName()
                + "\nAge of Fish: " + this.getAge() + "\nFish Color : " +this.color +"\nFish Satiety : "+ this.getHunger() + "\n");
    }}


class Orando extends fish{
    private boolean color;
    

    public Orando(String name, int age, boolean color) {
        super(name, color, age);
        this.color = color;
    }
    

    public boolean getColor() {
        return this.color;
    }
    
 
    public void setColor(boolean color) {
        this.color = color;
    }
    
    public void newFish() {
        if(this.color == true) {
            System.out.println("Fish name: " + this.getName()
            + "\nAge of fish: " + this.getAge()
            + "\nThe color of the fish is different."  + "\nFish Satiety : "+ this.getHunger() +"\n");
        }else {
            System.out.println("Fish name: " + this.getName()
            + "\nAge of fish: " + this.getAge()
            + "\nThe color of the fish is not different." 
            + "\nFish Satiety : "+ this.getHunger() +"\n");
        }
    }
    
}

public class feed_fish {

    public static void main(String[] args) {
        // main method
        
        fish fish1, fish2, fish3;
        
        fish1 = new fish("Charmer","orange",2,3);
        fish2 = new Orando("Oia", 3, true);
        fish3 = new Orando("White", 4, false);
        
        fish1.feed(5);
        fish3.feed(2);
                
        fish1.newFish();
        fish2.newFish();
        fish3.newFish();

    }

}



  



