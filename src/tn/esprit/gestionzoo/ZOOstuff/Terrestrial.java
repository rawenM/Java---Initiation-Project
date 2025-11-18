package tn.esprit.gestionzoo.ZOOstuff;

import tn.esprit.gestionzoo.interfaces.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore <Food> {
    protected  int nbrLegs ;
    public Terrestrial(){}
    public Terrestrial(String f, String n, int a, Boolean b, int legs){
        super(f,n,a,b);
        this.nbrLegs=legs;
    }
    public void eatMeat(Food meat){
        System.out.println("eating" + meat);
    }
    public void eatPlant(Food plant){
        System.out.println("eating" + plant);
    }
    public void eatPlantAndMeet(Food food){
        System.out.println("i eat" + Food.PLANT + Food.MEAT);
    }
    @Override
    public String toString(){
        return this.family + this.name + this.nbrLegs + this.age + this.isMammal ;
    }
}
