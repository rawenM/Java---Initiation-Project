public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";
    ZooManagement(){}
    ZooManagement(int nbrCages, String zooName){
        this.nbrCages = nbrCages;
        this.zooName = zooName;
    }
    public boolean verif(int nbrC, String zooN){
        return (nbrC >0 && !zooN.isEmpty());
    }
    @Override
    public String toString(){
        return zooName + " comporte " + nbrCages + " cages ";
    }
}
