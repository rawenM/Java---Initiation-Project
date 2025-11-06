package tn.esprit.gestionzoo.ZOOstuff;

public class Animal {
    protected  String family;
    protected  String name;
    protected  int age;
    protected  boolean isMammal;

    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidAgeException {
        if (age<=0){throw new InvalidAgeException("negative age");}
            this.age = age;
    }

    public boolean getMammal() {
        return isMammal;
    }
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }


    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.setFamily(family);
        this.setName(name);
        try {
            this.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("negative age, not set!");
        }
        this.setMammal(isMammal);
    }
    @Override
    public String toString(){
        return this.getFamily() + " " + this.getName() + " " + this.getAge() + " " + this.getMammal() ;
    }

}
