import java.util.Scanner;

public class Ejercicio11Java{
    static Scanner leer = new Scanner(System.in);

    public static void main (String[] args){
        int cantidadImpares = 0;
        int cantidadPares = 0;
        int cantidadNumerosSegundaDocena = 0;
        int numeroMayor = 0;
        int numeroRuleta = 0;
        int sumaNumerosPares = 0;
        int aux;

        for (int i = 0; i < 10; i++) {
            numeroRuleta = getInt("Ingresar números de la ruleta (de 0 hasta 36)");
            aux = numeroRuleta;
            if(numeroRuleta >= 0 && numeroRuleta <= 36){
                if(numeroRuleta>=13 && numeroRuleta<=24){
                    cantidadNumerosSegundaDocena++;
                }
                if(numeroRuleta>=numeroMayor){
                    numeroMayor = numeroRuleta;
                }
                while(aux>2){
                    aux = aux - 2;
                }
                if(aux == 1){
                    cantidadImpares++;
                }
                if(aux == 2){
                    cantidadPares++;
                    sumaNumerosPares = sumaNumerosPares + numeroRuleta;
                }
            }
            else{
                System.out.println("Sigue instrucciones crack");
            }
        }
        double promedio = (double)sumaNumerosPares / cantidadPares;

        System.out.println("");
        System.out.println("Cantidad de números impares " + cantidadImpares);
        System.out.println("Promedio de números pares (sin ceros) " + promedio);
        System.out.println("Cantidad de números que se encuentran en la segunda docena (13 al 24) " + cantidadNumerosSegundaDocena);
        System.out.println("El número más grande " + numeroMayor);
        System.out.println("");
        System.out.println("¿En qué cambia la solución si en lugar de leer 10 números, ahora se leen números hasta que llega el valor 36?");
        System.out.println("Primero que nada yo usaría el ciclo << Hacer, Mientras >> también conocido como << Repetir, Hasta Que>>");
        System.out.println("y en la condición pondría que seguiría el ciclo hasta que la suma de los números ingresados sea mayor o igual a 36.");
        System.out.println("El mayor cambio se vería en la cantidad de veces que el usuario podría ingresar números pudiendo ser mayor o menor a 10, igual que los números que el usuario podría ingresar se verían reducidos aún más de lo que ya estaba al inicio ");
    }

    public static int getInt(String titulo){
        String n = "";

        while(n.equals("")){
            System.out.println(titulo);
            n = leer.nextLine();
            if(!n.matches("[0-9]*$")){
                n = "";
            }
        }
        
        return Integer.parseInt(n);
    }
}