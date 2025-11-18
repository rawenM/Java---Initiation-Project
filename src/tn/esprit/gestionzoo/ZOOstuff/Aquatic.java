package tn.esprit.gestionzoo.ZOOstuff;

import tn.esprit.gestionzoo.interfaces.Carnivore;
import tn.esprit.gestionzoo.interfaces.Food;

public abstract class Aquatic extends Animal implements Carnivore <Food> {
    protected String habitat;

    public Aquatic(){}
    public Aquatic(String Family, String name, int age, Boolean isMam, String h){
        super(Family,name,age,isMam);
        this.habitat=h;
    }
    public void eatMeat(Food meat){
        System.out.println("eating" + meat);
    }
    @Override
    public String toString(){
        return this.family + this.name + this.habitat + this.age + this.isMammal ;
    }

     public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if (this.getClass()==obj.getClass()){
            if ((this.name.equals(((Aquatic) obj).name))&&(this.habitat.equals(((Aquatic) obj).habitat))&&(this.age==((Aquatic) obj).age)){
            return true;
            }
        }
        return false;
    }
}
