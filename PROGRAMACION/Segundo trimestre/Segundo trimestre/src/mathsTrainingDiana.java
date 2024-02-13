import java.util.Scanner;

public class mathsTrainingDiana {

    public static void main (String[] args) {

        Scanner scan =new Scanner(System.in);

        int record=0;
        long recordTiempo=0;



        System.out.println("¡Bienvenido/a a Maths Training!");
        String res;
    do{
        System.out.println("¿Desea jugar? (SI/NO)): ");
        res=scan.next().toUpperCase();

    } while (!res.equals("SI") && !res.equals("NO"));

        while (res.equals("SI")){
            int cont=0;
            long startTime= System.nanoTime();
            System.out.println("COMENCEMOS");
            boolean b;
            long tiempo=0;
            do {
                int n= (int) Math.floor(Math.random() * 101);
                int m= (int) Math.floor(Math.random() *(100-1)+1);
                String operaciones= "+-*/%";
                int azar=(int) Math.floor(Math.random() * 5);
                char operacion=operaciones.charAt(azar);
                float solReal=0;
                switch (operacion) {
                    case '+':
                        solReal = n + m;
                        break;
                    case '-':
                        solReal = n - m;
                        break;
                    case '*':
                        solReal = n * m;
                        break;
                    case '/':
                        solReal = (float) n / m;
                        break;
                    case '%':
                        solReal = n % m;
                        break;
                    default:
                        System.out.println("Error");

                        break;
                }

                System.out.println(n +""+ operacion+"" + m + " = ");
                float solUsuario= scan.nextFloat();
                b=(solReal==solUsuario);
                if (b) {
                    System.out.println("¡Felicidades! Has acertado.");
                    cont++;
                } else {
                    System.out.println("Game Over");
                    long endTime=System.nanoTime();
                    tiempo= ((endTime-startTime)/ 1000000000);
                    System.out.println("Has fallado. La solución era "+ solReal);
                    System.out.println("Tu puntuación es de "+ cont + " aciertos en "+ tiempo+ " segundos");
                }
            }while(b);

            if (cont>record){
                record= cont;
                recordTiempo= tiempo;
            } else if (cont==record && tiempo<recordTiempo){
                recordTiempo= tiempo;

            }

            System.out.println("Record de aciertos en esta sesión son: "+record+  " en "+ recordTiempo + " segundos");


            System.out.println("¿Quieres seguir jugando?");
            res=scan.next().toUpperCase();
        }



        System.out.println("Has finalizado el juego");
        System.out.println("Record de aciertos en esta sesión: "+ record +" en "+ recordTiempo + " segundos");



    }



        }


