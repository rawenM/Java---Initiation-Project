public class Zoo {
    Animal [] animals = new Animal[25];
    String name;
    String city;
    static int nbrCages = 25;

    Zoo(){}
    Zoo (String name, String city){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
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
    int searchAnimal(Animal animal){
        for ( int i=0 ; i <animals.length ; i++ ){
            if ((animals[i] != null) && (animals[i].name == animal.name)){
                return i;
            }
        }
        return -1;
    }
    boolean addAnimal(Animal animal){
       // if (searchAnimal(animal) == -1) {
            for ( int i=0 ; i <animals.length && i < 25 ; i++ ){
                if (animals[i] == null) {
                    animals[i] = animal;
                    System.out.println("successfully added!");
                    return true;
                }
            }
            System.out.println("Sorry, animals is full!");
        //}
        System.out.println("Sorry, animal already exists!");
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
    boolean removeAnimal(Animal animal){
        int search = searchAnimal(animal);
        if (search == -1){ return false; }
        if(search == animals.length){
            animals[animals.length-1]=null;
            return true;
        }
        for (int i = search; i < animals.length-1; i++) {
            animals[i] = animals[i+1];
        }
        return true;
    }

    boolean isZooFull() {
        int nbanimals = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                nbanimals++;
            }
        }
        return nbanimals == animals.length; // or nbanimals >= animals.length
    }

    int countAnimals(){
        int nbanimals = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                nbanimals++;
            }
        }
        return nbanimals;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.countAnimals()> z2.countAnimals()){
            return z1;
        }
        else
            return z2;
    }
}
