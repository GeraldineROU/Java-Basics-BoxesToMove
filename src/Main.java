//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Le déménagement va commencer, il y a 34 cartons à déplacer.");

        int totalOfBoxes = 34;
        int truckLoad;
        int roundNumber = 0;


        while (totalOfBoxes > 0) {
            if (totalOfBoxes >= 9) {
                truckLoad = 9;
            } else {
                truckLoad = totalOfBoxes;
            }
            totalOfBoxes = totalOfBoxes - truckLoad;
            roundNumber++;
            System.out.println("Chargement n° " + roundNumber + " : un voyage de " + truckLoad + " cartons.");
        }
    }
}