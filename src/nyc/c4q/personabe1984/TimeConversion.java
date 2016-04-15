package nyc.c4q.personabe1984;

import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String minAndSec = time.substring(2,8);
        String hours = time.substring(0,2);

        if(time.charAt(8) == 'A'){
            if(hours.equals("12")){
                System.out.println("00" + minAndSec);
            }else{
                System.out.println(hours + minAndSec);
            }

        }else{// When the letter is p
            if(hours.equals("12")){
                System.out.println("12"+ minAndSec);
            }else{
                hours = (Integer.parseInt(hours)+12)+"";
                System.out.println(hours + minAndSec);
            }

        }


    }
}

//output 00:40:22
//12:40:22AM

//12:45:54PM
//12:45:54

