package tn.esprit.gestionzoo.ZOOstuff;

public class Zoo {
    private Animal [] animals = new Animal[25];
    private String name;
    private String city;
    private static int nbrCages = 25;
    private Aquatic [] aquaticAnimals = new Aquatic[10];


    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) { // protection rule: name must not be empty
            this.name = name;
        } else {
            System.out.println("Le nom du Zoo ne peut pas être vide !");
        }
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public static int getNbrCages() {
        return nbrCages;
    }
    public static void setNbrCages(int nbrCages) {
        Zoo.nbrCages = nbrCages;
    }
    public Zoo(){}
    public Zoo (String name, String city){
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
            if ((animals[i] != null) && (animals[i].getName() == animal.getName())){
                return i;
            }
        }
        return -1;
    }
    public void addAnimal(Animal animal) throws ZooFullException {

            if (searchAnimal(animal) != -1) { System.out.println("Sorry, animal already exists!"); return;}
            for (int i = 0; i < animals.length && i < 25; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    int x = countAnimals();
                    System.out.println("successfully added!");
                    System.out.println(x);
                    return;
                }
            }
            throw new ZooFullException("Zoo is full!");
    }

    void afficherAnimaux(){
        for ( int i=0 ; i <animals.length ; i++ ){
            if (animals[i] != null) {
                System.out.println("animal number :" + i + "\n");
                System.out.println("animal's name:" + animals[i].getName() + "\n");
                System.out.println("animal's family:" + animals[i].getFamily() + "\n");
                System.out.println("animal's age:" + animals[i].getAge() + "\n");
                System.out.println("Mammal? " + animals[i].getMammal() + "\n");
                System.out.println("****************");
            }
        }
    }
    public boolean removeAnimal(Animal animal){
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

    public int countAnimals(){
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

    public void addAquaticAnimal(Aquatic aquatic){
        if (aquatic == null ){return;}
        for (int i=0; i<aquaticAnimals.length ; i++ ){
            if (aquaticAnimals[i]==null){
                aquaticAnimals[i]=aquatic;
                System.out.println("success");
                return;
            }
        }
        System.out.println("not success");
    }
    public float maxPenguinSwimmingDepth() {
        float max = -1;
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > max) {
                    max = depth;
                }
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbp = 0;
        int nbd = 0;
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i]!=null) {
                if (aquaticAnimals[i] instanceof Penguin) {
                    nbp++;
                }
                if (aquaticAnimals[i] instanceof Dolphin) {
                    nbd++;
                }
            }
        }
        System.out.println("number of penguins:" + nbp + "\n");
        System.out.println("number of dolphins:" + nbd + "\n");
    }

}
