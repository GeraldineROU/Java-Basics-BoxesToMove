import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Le déménagement va commencer, il y a 34 cartons à déplacer.");

        int totalOfBoxes = 34;
        int truckCapacity = 9;
        int roundNumber = 1;

        while (totalOfBoxes > 0) {
            roundNumber++;
            totalOfBoxes = totalOfBoxes - truckCapacity;
            if (totalOfBoxes > 0) {
                System.out.println("Tour n° " + roundNumber + " : Le camion récupère son chargement, il reste encore " + totalOfBoxes + " cartons à déménager.");
            } else {
                System.out.println("Tour n° " + roundNumber + " : Dernier chargement, tous les cartons sont récupérés !");
            }
        }
    }
}