package tn.esprit.gestionzoo.ZOOstuff;

public class Penguin extends Aquatic {
    protected float swimmingDepth;
    public Penguin(){}
    public Penguin(String Family, String name, int age, Boolean isMam, String h, float s){
        super( Family,  name,  age,  isMam,  h);
        this.swimmingDepth=s;
    }
    public float getSwimmingDepth() {
        return this.swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingSpeed) {
        this.swimmingDepth = swimmingSpeed;
    }
    @Override
    public String toString(){
        return this.family + this.swimmingDepth +this.name + this.habitat + this.age + this.isMammal ;
    }

    public void swim(){
        System.out.println("This penguin is swimming.");
    }
}
