import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Elephant> elephants;
    private List<Wolf> wolves;
    private List<Lion> lions;
    private List<Jaguar> jaguars;
    private List<Zebra> zebras;

    public Zoo() {
        this.elephants = new ArrayList<>();
        this.wolves = new ArrayList<>();
        this.lions = new ArrayList<>();
        this.jaguars = new ArrayList<>();
        this.zebras = new ArrayList<>();
    }

    public void addAnimal(Animal animal){

        if(animal instanceof Elephant){
            elephants.add((Elephant) animal);
        }
        if(animal instanceof Wolf){
            wolves.add((Wolf) animal);
        }
        if(animal instanceof Lion){
            lions.add((Lion) animal);
        }
        if(animal instanceof Jaguar){
            jaguars.add((Jaguar) animal);
        }
        if(animal instanceof Zebra){
            zebras.add((Zebra) animal);
        }

    }

    public void ShowAllAnimalsFromZOO() {
        System.out.println("Elefanți:");
        for (Elephant elephant : elephants) {
            elephant.showDetails();
        }

        System.out.println("Lupi:");
        for (Wolf wolf : wolves) {
            wolf.showDetails();
        }

        System.out.println("Lei:");
        for (Lion lion : lions) {
            lion.showDetails();
        }

        System.out.println("Jaguari:");
        for (Jaguar jaguar : jaguars) {
            jaguar.showDetails();
        }

        System.out.println("Zebre:");
        for (Zebra zebra : zebras) {
            zebra.showDetails();
        }
    }



}