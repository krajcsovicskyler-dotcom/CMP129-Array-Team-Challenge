import java.util.Scanner;

public class ArrayTeamChallenge {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        int[] scores = {78, 92, 85, 67, 95, 88, 73, 90, 73};

        // Challenge 1:
        // Display every score in the array using a loop.
        System.out.println("Challenge 1:\n");
        for (int i = 0; i < scores.length; i ++){
            System.out.print(scores[i]+", ");
        }
        
        System.out.println("\n");

        // Challenge 2:
        // Calculate and display the average score.
        // Your solution should still work if more scores are added.
        System.out.println("Challenge 2:\n");
        int total = 0; 
        int average = 0;
        for ( int i = 0; i < scores.length; i++){
            total = total + scores[i];
        }
        average = total / scores.length;
        System.out.println("The average is: " + Integer.toString(average));

        System.out.print("\n");

        // Challenge 3:
        // Find and display the highest and lowest score in the array.
        // Do not simply print 95.
        System.out.println("Challenge 3:\n");
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++){
            if (scores[i] < min){
                min = scores[i];
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max + "\n");
        
        // Challenge 4:
        // Count and display how many scores are above the average.
        System.out.println("Challenge 4:\n");
        int total2 = 0;
        int average2 = 0;
        int count = 0;
        for ( int i = 0; i < scores.length; i ++){
            total2 = total2 + scores[i];
        }
        average2 = total2 / scores.length;
        for (int i = 0; i < scores.length; i ++){
            if (scores[i] > average2){
                count = count + 1;
            }
        }
        System.out.println("There are " + Integer.toString(count) + " numbers above the average.\n");

        System.out.print("\n");

        // BONUS 1 - REVERSE ORDER:
        // Display the scores in reverse order.
        System.out.println("BONUS 1:\n");
        for(int i = (scores.length - 1); i >= 0; i--){
            System.out.print(scores[i] + ", ");
        }
        System.out.println("\n");

        // BONUS 2 - SCORE SEARCH:
        System.out.println("BONUS 2:\n");
        int searchScore;
        boolean foundScore = false;
        int indexOccurence = 0;
        int foundCount = 0;

        // Ask the user to enter a score to search for.
        System.out.print("Enter score to search: ");
        searchScore = keyboard.nextInt();
        // Determine whether the score exists in the array.
        for(int i = 0; i < scores.length; i++)
        {
            if(scores[i] == searchScore)
            {
                foundScore = true;
                foundCount++;
                if(foundCount == 1)
                {
                    indexOccurence = i;
                }
            }
            
        }
        
        // Display the index of the first occurrence.
        if(foundCount > 0)
        {
            System.out.println("The score first appeared at index " + indexOccurence);
        }
        // Count how many times the score appears.
        System.out.println("The score was found " + foundCount + " times.");
    
        // If it is not found, display an appropriate message.
        if(foundScore = false)
        {
            System.out.println("Score not found. please enter another value. ");
        }
    }
}
