import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            ZooManagement zooManagement = new ZooManagement();
            System.out.println(zooManagement);

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

            //Animal chat = new Animal("B", "psps", 7, true);
            Zoo myZoo = new Zoo("MyZoo", "elghazela");

            Zoo myZoo2 = new Zoo("MyZoo2", "rades plage");
            for (int i=1; i<= 25 ; i++){
                myZoo2.addAnimal(lion);
                System.out.println(i);
            }
            Zoo test = new Zoo();
            test = test.comparerZoo(myZoo,myZoo2);
            System.out.println(test);
            //System.out.println(myZoo.toString()); //same this as the display b4

            //myZoo.addAnimal(lion);
            //myZoo.addAnimal(chat);
            //myZoo.afficherAnimaux();
            //System.out.println("now remove: ");
            //myZoo.removeAnimal(chat);
            //myZoo.afficherAnimaux();
            //System.out.println(myZoo.isZooFull());

        }
}