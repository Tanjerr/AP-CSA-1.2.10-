import java.util.Scanner;

public class madLibsCorrections {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in); // scanner to take in user input
     
        System.out.println("Enter a noun: "); // text for entering a noun
        String noun1 = sc.nextLine(); // captures the input and stores in noun1 variable
        
        System.out.println("Enter a verb (ending with -ed): "); // text for entering a verb
        String verb1 = sc.nextLine(); // captures the input and stores in verb1 variable

        System.out.println("Enter a noun (name): "); // text for entering a noun
        String noun2 = sc.nextLine(); // captures the input and stores in noun2 variable

        System.out.println("Enter noun (location): "); // text for entering a noun
        String noun3 = sc.nextLine(); // captures the input and stores in noun3 variable

        System.out.println("Enter an adjective (descriptive): "); // text for entering a adjective
        String adj1 = sc.nextLine(); // captures the input and stores in adj1 variable

        System.out.println("Enter a verb (ending with -ed): "); // text for entering a verb
        String verb2 = sc.nextLine(); // captures the input and stores in verb2 variable

        //final noun count: 3
        //final verb count: 2
        //final adjective count: 1

        // 1. create the original mad lib string with placeholder fill ins
        String story = "One day I woke up and it was raining <noun1>. I was <verb1> by the sight. I was called by <noun2> to ask them if they still wanted to go to <noun3>. While we were outside, the rain was very <adj1>. After we had a nice day together, I <verb2> them in the face.";

        // 2. parse and replace <noun1> (length is 7)
        int index = story.indexOf("<noun1>");
        story = story.substring(0, index) + noun1 + story.substring(index + 7);

        // parse and replace <verb1> (length is 7)
        index = story.indexOf("<verb1>");
        story = story.substring(0, index) + verb1 + story.substring(index + 7);

        // parse and replace <noun2> (length is 7)
        index = story.indexOf("<noun2>");
        story = story.substring(0, index) + noun2 + story.substring(index + 7);

        // parse and replace <noun3> (length is 7)
        index = story.indexOf("<noun3>");
        story = story.substring(0, index) + noun3 + story.substring(index + 7);

        // parse and replace <adj1> (length is 6)
        index = story.indexOf("<adj1>");
        story = story.substring(0, index) + adj1 + story.substring(index + 6);

        // parse and replace <verb2> (length is 7)
        index = story.indexOf("<verb2>");
        story = story.substring(0, index) + verb2 + story.substring(index + 7);

        System.out.println(story);
        sc.close();
    }
}
