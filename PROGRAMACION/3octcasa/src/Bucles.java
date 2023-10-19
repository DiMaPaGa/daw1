import java.util.Scanner;
public class Bucles {

    public static void main (String []args){
        Scanner scan =new Scanner(System.in);

     //Se llaman también estructuras de salto que retornan, repetitivas...

      /*  int contador=0;

        while (contador<=10){
            System.out.println(contador);
            contador++;

        }
        System.out.println("FIN");*/

       /* for(int cont=0; cont<=10;cont++) {
            System.out.println(cont);
        }*/

        /*do{
            System.out.println("Me ejecuto una vez");

        } while (3>4);
        //"Do-While", cuando queremos o sabemos que al menos se va a ejecutar una vez y a partir de entonces, lo que diga la variable.
*/
//Boletin 3. Iterativos.

       // act:1
       /*1= 10 tamaño de 0 a 9;
       2= 21 tamaño de 20 a 0 inclusives;
       3= se imprime 15 diecisiete tamaño;
       4= se imprime 31 tamaño de 30 a 0 inclusive.
       5= Se imprime 5 tamaño de 0 a 10 de 2 en 2(0,2,4,6,8);
       6= se imprime 71 tamaño de 70 a 0 inclusive.NOOOOOO el ";" tras la condición lo ejecuta infinitas tamaño
       7= Se imprime solo 3 tamaño, 2 por la condición de for y 1 más por el incremento de dentro, por lo que cada vez suma 3*/

       //original 1

       /*int var=0;
       int ite=0;
       while (var<10) {
           System.out.println(var);
           var++;
           ite++;
       }
        System.out.println("Iteraciones "+ ite);*/
      /*//lo transformamos el 1
       for (int var=0; var<10; var++) {
           System.out.println(var);
       }*/
      //original 2
        int ite=0;
        for(int i=20; i>=0; i--) {
            System.out.println(i);
            ite++;
        }
        System.out.println("Iteraciones "+ ite);
        //Lo transformamos el 2 a while

        /*int i=20;
        while (i>0) {
            System.out.println(i);
            i--;
        }
        System.out.println("fin");
        //original 3
        int num=15;
        int ite=0;
        for(i=0; i<17; i++) {
            System.out.println(num);
        }
        System.out.println(i);

        System.out.println("fin");
        //Lo transformamos el 3
        num=15;
        int i=0;
        while (i<17) {
            System.out.println(num);
            i++;
        }
        System.out.println("Iteraciones "+ ite);

        System.out.println("fin");
       */ //original 4
       /* int var=30;
        while (var>=0){
            System.out.println(var);
            var--;
        }
        System.out.println("fin");

        //Lo transformamos el 4
        for (int var=30;var>=0;var--){
            System.out.println(var);
        }
        System.out.println("fin");
        // original 5

        for(int i=0; i<10; i+=2) {
            System.out.println(i);
        }
        System.out.println("fin");
        // lo transformamos el 5;
        int i=0;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("fin");
        // original 6
        var=70;
        while(var>=0)";"{
            System.out.println(var);
            var--;
        }
        System.out.println("fin");
        // lo transformo el 6
        for(int var=70; var>=0; ); Y aquí terminaría por el error
            var--;
            System.out.println(var);

        System.out.println("fin");*/

       // original 7
        /*for(int i=0; i<10;i+=2) {
            System.out.println(i);
            i++;
        }
        System.out.println("fin");*/
        //transformo el 7

       /* int i= 0;
        while (i<10) {
            System.out.println(i);
            i+=3;

        }
        System.out.println("fin");*/

/*//actividad 4:
        System.out.println("Ingrese un número");
        int veces= scan.nextInt();

        for(int i=0; i<veces; i++){
            System.out.print("0 ");
        }

 //actividad 5:
        System.out.println("Ingrese un número");
        int tamaño= scan.nextInt();

        for(int i=0; i<tamaño; i++){
            if(i==0){
                System.out.println("1 ");
            } else{
                System.out.print("0 ");
            }

        }

  //actividad 6:
        System.out.println("Ingrese un número");
        tamaño= scan.nextInt();

        for(int i=0; i<tamaño; i++){
            if(i==tamaño-1){
                System.out.println("1 ");
            } else{
                System.out.print("0 ");
            }

        }
//actividad 7:
        System.out.println("Ingrese un número");
        tamaño= scan.nextInt();

        for(int i=0; i<tamaño; i++){
            if(i==tamaño/2){//si quiero en los pares que sea la otra columna, tendría que poner tamaño/2-1, pero tendríamos que controlar el 3
                System.out.println("1 ");
            } else{
                System.out.print("0 ");
            }

        }*/
// actividad 8:

        System.out.println("Ingrese un número");
        int veces= scan.nextInt();

        for(int i=0; i<veces; i++){
            for(int j=0; j<veces; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }



    }


    }


