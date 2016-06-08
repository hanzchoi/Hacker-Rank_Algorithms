package string;


import java.util.Scanner;

public class Pangrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();


        if(isPangram(s)){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }

    }

    public static boolean isPangram(String s){
        s = s.toLowerCase();
        boolean[] check = new boolean[128];

        for(int i = 0; i < s.length()-1; i++){
            int val = s.charAt(i);
            if(!check[val]){
                check[val] = true;
            }
        }

        return checkingTheArray(check);
    }

    public static boolean checkingTheArray(boolean[] temp){
        boolean contains = false;
        for(int i = 97; i <= 122; i++ ){
            if(temp[i]){
                contains = true;
            }
        }
        return contains;
    }
}
