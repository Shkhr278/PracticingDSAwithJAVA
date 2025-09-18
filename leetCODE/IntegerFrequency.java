public class IntegerFrequency {

    //Main Function
    public static void main(String[] args) {

        //Taking number as a string input
        String n = "8218797960";

    //Calling find function
     find(n);

    //  0 -> 48
    //  1 -> 49
    //  .
    //  .
    //  9 -> 57
    }

    //Function to find frequency
    public static void find(String n) {

        //Array to store frequency of each digit
        int[] freq = new int[10];

        //Index to iterate over the String
        int l=0;

        //Iterating over the String
        while (l<n.length()) {

            //Extracting ASCII value of each number character
            int r= n.charAt(l);

            //Incrementing the frequency of that number
            freq[r-48]++;       

            //Updating the index
            l+=1;           
        }

        //iterating over the indexes and printing the frequency of the nunmbers on that index and moving on the next index 
        for(int i=0; i<10; i+=1)
            if(freq[i]>0) System.out.println("Frequency of "+ i + " is:"+freq[i]);

    }
}