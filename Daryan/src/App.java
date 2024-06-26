import java.util.Scanner;

//Daryan José Espinoza Pastrán.
// Carnet: 2024-1370U.

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);
        
        int[] arrayInvertido = Invertir(array);
        System.out.println("Arreglo invertido:");
        Mostrar(arrayInvertido);

       
    }
    
    // Metodo con la aplicación del try-catch para contener las excepciones.
    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            try {
                System.out.println("ingrese el valo [" + i + "]");
            arreglo[i] = leer.nextInt();
            } catch (Exception e) {
                System.out.println(e);
                i--;
                leer.nextLine();
            }
        }
        //Hay que hacer que mire bonito
        return arreglo;
    }

    //Aqui va el metodo de inverso

    //para que se vea bonito
    public static void Mostrar(int[] a) {
        System.out.print("|");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("| Todo correcto. :)");
    }


    //metodo de invertido

    public static int[] Invertir(int[] a) {
        int[] invertido = new int[a.length];
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            invertido[i] = a[j];
        }
        return invertido;
    }
}
