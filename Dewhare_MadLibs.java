import java.util.Scanner;

public class Dewhare_MadLibs {
    public static void main (String[] args) {

        System.out.println("Enter a noun");
        Scanner sc = new Scanner(System.in);

        String noun1 = sc.nextLine();
        
        System.out.println("Enter a verb (ending with -ed).");
        String verb1 = sc.nextLine();

        System.out.println("Enter a noun (name):");
        String noun2 = sc.nextLine();

        System.out.println("Enter noun (location):");
        String noun3 = sc.nextLine();

        System.out.println("Enter an adjective (descriptive):");
        String adj1 = sc.nextLine();

        System.out.println("Enter a verb (ending with -ed).");
        String verb2 = sc.nextLine();

        String story = "One day I woke up and it was raining " + noun1 + ".";
        story += " I was "+ verb1 +" by the sight.";
        story += " I was called by " + noun2 + " to ask them if they still wanted to go to " + noun3 + ".";
        story += " While we were outside, the rain was very " + adj1 + ".";
        story += " After we had a nice day together, I " + verb2 + " them in the face.";

        System.out.println(story);

    }
}
