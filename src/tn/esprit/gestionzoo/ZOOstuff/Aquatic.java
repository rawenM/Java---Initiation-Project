package tn.esprit.gestionzoo.ZOOstuff;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(){}
    public Aquatic(String Family, String name, int age, Boolean isMam, String h){
        super(Family,name,age,isMam);
        this.habitat=h;
    }

    @Override
    public String toString(){
        return this.family + this.name + this.habitat + this.age + this.isMammal ;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }
}
