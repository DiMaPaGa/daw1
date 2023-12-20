import java.util.Scanner;

public class EjercicioNavidad {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean fin =false;
        int iPosT=1;
        int jPosT=1;
        int iPosH=18;
        int jPosH=18;

       // While (){


        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (j==0 || i==0 || j==18 || i==18){
                    System.out.print("* ");
                } else {
                    if (i==iPosT && j==jPosT){
                        System.out.println("T ");
                    } else if (j==jPosH && j==jPosH) {
                        System.out.println("H ");
                    }
                    System.out.print("  ");
                }
            }
            System.out.println();
        }




        }


    }
