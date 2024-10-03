import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Le déménagement va commencer, il y a 34 cartons à déplacer.");

        int totalOfBoxes = 34;
        int remainingBoxes = totalOfBoxes;
        int truckCapacity = 9;
        int roundNumber = 1;
        int truckLoad;

        while (remainingBoxes > 0) {
            roundNumber++;
            remainingBoxes = remainingBoxes - truckCapacity;
            if (remainingBoxes > 0) {
                truckLoad = truckCapacity;
                System.out.println("Tour n° " + roundNumber + " : Un voyage de " + truckLoad + " cartons, il reste encore " + remainingBoxes + " cartons à déménager.");
            }
            if (remainingBoxes <= 0){
                truckLoad = totalOfBoxes % truckCapacity;
                System.out.println("Tour n° " + roundNumber + " : Dernier chargement, un voyage de " + truckLoad + " cartons , tous les cartons sont récupérés !");
            }
        }
    }
}