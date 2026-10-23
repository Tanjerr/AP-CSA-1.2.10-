import java.util.Scanner;

public class Dewhare_MadLibs {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in); // scanner to take in user input
     
        System.out.println("Enter a noun"); // text for entering a noun
        String noun1 = sc.nextLine(); // captures the input and stores in noun1 variable
        
        System.out.println("Enter a verb (ending with -ed)."); // text for entering a verb
        String verb1 = sc.nextLine(); // captures the input and stores in verb1 variable

        System.out.println("Enter a noun (name):"); // text for entering a noun
        String noun2 = sc.nextLine(); // captures the input and stores in noun2 variable

        System.out.println("Enter noun (location):"); // text for entering a noun
        String noun3 = sc.nextLine(); // captures the input and stores in noun3 variable

        System.out.println("Enter an adjective (descriptive):"); // text for entering a adjective
        String adj1 = sc.nextLine(); // captures the input and stores in adj1 variable

        System.out.println("Enter a verb (ending with -ed)."); // text for entering a verb
        String verb2 = sc.nextLine(); // captures the input and stores in verb2 variable

        //final noun count: 3
        //final verb count: 2
        //final adjective count: 1

        String story = "One day I woke up and it was raining " + noun1 + "."; //concatenation to make the code easier to read
        story += " I was "+ verb1 +" by the sight.";
        story += " I was called by " + noun2 + " to ask them if they still wanted to go to " + noun3 + ".";
        story += " While we were outside, the rain was very " + adj1 + ".";
        story += " After we had a nice day together, I " + verb2 + " them in the face.";

        System.out.println(story);
        sc.close();
    }
}
