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
        for ( int i=0 ; i <animals.length ; i++ ){
            if (animals[i] == null){
                animals[i] = animal;
                 System.out.println("successfully added!");
                return true;
            }
        }
        System.out.println("Sorry, animals is full!");
        return false;
    }
    void afficherAnimaux(){
        for ( int i=0 ; i <animals.length ; i++ ){
            if (animals[i] != null) {
                System.out.println("animal number :" + i + "\n");
                System.out.println("animal's name:" + animals[i].name + "\n");
                System.out.println("animal's family:" + animals[i].family + "\n");
                System.out.println("animal's age:" + animals[i].age + "\n");
                System.out.println("Mammal? " + animals[i].isMammal + "\n");
                System.out.println("****************");
            }
        }
    }
    int searchAnimal(Animal animal){
        for ( int i=0 ; i <animals.length ; i++ ){
            if (animals[i].name==animal.name){
                return i;
            }
        }
        return -1;
    }
}
