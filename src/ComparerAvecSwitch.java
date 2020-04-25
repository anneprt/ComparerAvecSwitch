import java.util.Scanner;

public class ComparerAvecSwitch {
    public static void main(String[] args) {
        String quelleCouleur = "";
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Quelle couleur voulez vous ? rouge-vert-orange-bleu-violet-jaune: ");
        quelleCouleur = lectureClavier.nextLine();
        quelleCouleur = quelleCouleur.toLowerCase();
        switch (quelleCouleur) {
            case "vert":
                System.out.println("Il faut mélanger du bleu et du jaune");
                break;
            case "violet":
                System.out.println("Il faut mélanger du rouge et du bleu");
                break;
            case "orange":
                System.out.printf("Il faut mélanger du rouge et du jaune");
                break;
            default:
                System.out.println("c'est une couleur primaire !!");

        }


    }
}
