public class Zoo {
    Animal [] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    Zoo(){}
    Zoo (String name, String city, int nbrCages){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    @Override
    public String toString(){
        return this.name + " " + this.city + " " + this.nbrCages ;
    }
    /*void displayZoo(){
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.nbrCages);
    }*/

    boolean addAnimal(Animal animal){
        for ( Animal i : animals ){
            if (i.name == null){
                 i = animal;
                 System.out.println("successfully added!");
                return true;
            }
            System.out.println("Sorry, animals is full!");
        }
        return false;
    }
}
