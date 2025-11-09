package tn.esprit.gestionzoo;

import tn.esprit.gestionzoo.ZOOstuff.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {


           // Scanner input = new Scanner(System.in);
           // System.out.print("Enter zoo name: ");
           // String zooN = input.nextLine(); //try .next()
            //System.out.print("Enter number of cages: ");
            //int nCages = input.nextInt();

           /* boolean bool = zooManagement.verif(nCages, zooN);

            if (bool) {
                ZooManagement zoo2 = new ZooManagement(nCages, zooN);
                System.out.println(zoo2);
            } else System.out.println("Sorry zoo input is invalid");
            input.close(); */

            // constructeur paramétré
            Animal lion = new Animal("A", "katous", 3, true);

            Animal chat = new Animal("B", "psps", 7, true);
            Zoo myZoo = new Zoo("MyZoo", "elghazela");


            Zoo myZoo2 = new Zoo("MyZoo2", "rades plage");

            /*for (int i=0; i< myZoo2.getAnimals().length ; i++){
                try {
                    myZoo2.addAnimal(lion);
                    System.out.println(i);
                }catch(ZooFullException e) {
                    System.out.println("sorry zoo is full");
                }
            }*/
            /*tn.esprit.gestionzoo.ZOOstuff.Zoo test = new tn.esprit.gestionzoo.ZOOstuff.Zoo();
            test = test.comparerZoo(myZoo,myZoo2);
            System.out.println(test);*/
            //System.out.println(myZoo.toString()); //same this as the display b4

            //myZoo.addAnimal(lion);myZoo.addAnimal(lion);
            //myZoo.addAnimal(chat);
            //myZoo.afficherAnimaux();
            //System.out.println("now remove: ");
            //myZoo.removeAnimal(chat);
            //myZoo.afficherAnimaux();
            //System.out.println(myZoo.isZooFull());

            Terrestrial T = new Terrestrial("family1","Alpha",12,true,2);
            //Aquatic A = new Aquatic("family1","Alpha",12,true,"aquariumA");
            Dolphin D = new Dolphin("family1","Alpha",12,true,"aquariumA",14);
            Penguin P = new Penguin("family1","Alpha",12,true,"aquariumA",15);
            Penguin P1 = new Penguin("aquafamily","Alpha",12,true,"aquariumA",19);
            myZoo.addAquaticAnimal(P);myZoo.addAquaticAnimal(P1);
            System.out.println("oiiiaioooiiai"+myZoo.maxPenguinSwimmingDepth());

            System.out.println(T);
            //System.out.println(A);
            System.out.println(D);
            System.out.println(P);

            //A.swim();
            D.swim(); P.swim();
            Dolphin B = new Dolphin("family1","Alpha",12,true,"aquariumA",13);
            Dolphin C = new Dolphin("family1","Alpha",12,true,"aquarium", 18);
            myZoo2.addAquaticAnimal(D);
            myZoo2.addAquaticAnimal(B);
            myZoo2.addAquaticAnimal(C);
            myZoo2.addAquaticAnimal(P);

            //System.out.println(B.equals(C));
            //B.swim(); C.swim(); P.swim(); D.swim();
            //myZoo2.displayNumberOfAquaticsByType();

             try {
                 myZoo2.addAnimal(chat);
             }catch(ZooFullException e){
                 System.out.println("sorry zoo is full");
             }

        }
}