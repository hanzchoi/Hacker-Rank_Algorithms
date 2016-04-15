package nyc.c4q.personabe1984;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        int studentPresent = 0;

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(!(t >= 1 && t <=10) ) System.exit(0);

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            //if(n <=)System.exit(0);

            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
        }
    }

    public void theClassIsCancelled(int studentPresent, int k){
        if(studentPresent < k){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
