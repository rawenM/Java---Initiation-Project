package tn.esprit.gestionzoo.ZOOstuff;

public class Dolphin extends Aquatic  {
    protected float swimmingSpeed;
    public Dolphin(){}
    public Dolphin(String Family, String name, int age, Boolean isMam, String h, float s){
        super( Family,  name,  age,  isMam,  h);
        this.swimmingSpeed=s;
    }

    @Override
    public String toString(){
        return this.family + this.swimmingSpeed + this.name + this.habitat + this.age + this.isMammal ;
    }

    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
