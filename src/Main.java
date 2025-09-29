import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
        ZooManagement zooManagement = new ZooManagement();
        System.out.println(zooManagement);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter zoo name: ");
        String zooN = input.nextLine(); //try .next()
        System.out.print("Enter number of cages: ");
        int nCages = input.nextInt();

        boolean bool = zooManagement.verif(nCages,zooN);

        if (bool){
        ZooManagement zoo2 = new ZooManagement(nCages, zooN);
        System.out.println(zoo2);}
        else System.out.println("Sorry zoo input is invalid");
        input.close();


        Animal lion = new Animal("A", "katous", 3, true);
        Zoo myZoo = new Zoo ( "MyZoo", "elghazela", 8);

        System.out.println(lion);
        System.out.println("***********");
        System.out.println(myZoo);
        System.out.println("***********");
        System.out.println(myZoo.toString()); //same this as the display b4

        Animal chat = new Animal("B", "psps", 7, true);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(chat);
    }
}