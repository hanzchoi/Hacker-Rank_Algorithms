package string;


public class AlternatingCharacters {

    public static void main(String[] args) {

    /*    Scanner sc = new Scanner(System.in);

        System.out.print("The number of the input: ");
        int n = sc.nextInt();
        String[] inputStrings = new String[n];

        for(int i = 0; i < inputStrings.length; i++ ){
            inputStrings[i] = sc.nextLine();
        }*/

        //for(int i = 0; i < inputStrings.length; i++){
        //    System.out.println(numberOfDeletion(inputStrings[i]));
        //}

        String[] testInput = {"AAAAA", "BBBBB", "ABABABAB", "BABABA", "AAABBB"};

        System.out.println(testInput.length);
        for(int i = 0; i < testInput.length; i++){
            System.out.println(numberOfDeletion(testInput[i]));
        }

    }

    public static int numberOfDeletion(String s){
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                counter++;
            }
        }

        return counter;
    }
}
