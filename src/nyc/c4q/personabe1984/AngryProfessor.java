package nyc.c4q.personabe1984;

import java.util.Scanner;

public class AngryProfessor {

    public static void main(String[] args) {
        int studentPresent = 0;
        int[] studentPresentArray;
        int[] threshold;
        int index = 0;

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(!(t >= 1 && t <= 10))System.exit(0);
        studentPresentArray = new int[t];
        threshold = new int[t];

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(!(n >= 1 && n <= 100))System.exit(0);

            int k = in.nextInt();
            if(!(k >= 1 && k <= n))System.exit(0);

            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(!(a[a_i] >= -100 && a[a_i] <= 100))System.exit(0);
                if(a[a_i] <= 0){
                    studentPresent++;
                }
            }
            studentPresentArray[index] = studentPresent;
            threshold[index] = k;
            index++;

            studentPresent = 0;
        }

        for(int i = 0; i < t; i++){
            theClassIsCancelled(studentPresentArray[i],threshold[i]);
        }

    }

    public static void theClassIsCancelled(int studentPresent, int k){
        if(studentPresent < k){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
