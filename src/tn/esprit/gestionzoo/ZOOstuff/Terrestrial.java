package tn.esprit.gestionzoo.ZOOstuff;

public class Terrestrial extends Animal {
    protected  int nbrLegs ;
    public Terrestrial(){}
    public Terrestrial(String f, String n, int a, Boolean b, int legs){
        super(f,n,a,b);
        this.nbrLegs=legs;
    }

    @Override
    public String toString(){
        return this.family + this.name + this.nbrLegs + this.age + this.isMammal ;
    }
}
