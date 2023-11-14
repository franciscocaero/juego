import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mesAleatorio = (int) ((Math.random() * 12)+1); // Número de mes aleatorio (entre 1 y 12)
        int b; // Número introducido por el usuario.
        int i; // Contador para bucle for.

        System.out.println("El juego consiste en averiguar el mes de nacimiento y mostrará el signo del zodiaco correspondiente");

        System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 12: ");
        b = sc.nextInt();
        while (b<1 || b>12){ //Validación del número ingresado
            System.out.println("Número incorrecto.Ingrese de nuevo ");
            b = sc.nextInt();
        }
        for (i=0; i<=4; i++) {
            // Primero se evalúa si se ha acertado.

            if (mesAleatorio == b) {
                System.out.println("¡Has acertado!");
                //posibles resultados según el mes generado aleatoriamente
                if (mesAleatorio==1){
                    System.out.println("Capricornio");
                } else if (mesAleatorio==2) {
                    System.out.println("Acuario");
                } else if (mesAleatorio==3) {
                    System.out.println("Picsis");
                } else if (mesAleatorio==4) {
                    System.out.println("Aries");
                } else if (mesAleatorio==5) {
                    System.out.println("Tauro");
                } else if (mesAleatorio==6) {
                    System.out.println("Geminis");
                } else if (mesAleatorio==7) {
                    System.out.println("Cancer");
                } else if (mesAleatorio==8) {
                    System.out.println("Leo");
                } else if (mesAleatorio==9) {
                    System.out.println("Virgo");
                } else if (mesAleatorio==10) {
                    System.out.println("Libra");
                } else if (mesAleatorio==11) {
                    System.out.println("Escorpio");
                }else {
                    System.out.println("Sagitario ");
                }
                break; }

            // Luego da la partida por perdida si ya has gastado 5 intentos.

            else if (i == 4) {
                System.out.println("Lo siento: ¡has perdido!. El número de mes era el: " + mesAleatorio);
                break; }

            // Si no es ninguno de los casos anteriores, comparamos números.

            else if (mesAleatorio > b)
                System.out.println("El número secreto es MAYOR que " + b);
            else if (mesAleatorio < b)
                System.out.println("El número secreto es MENOR que " + b);

            // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.

            if (i <=1) {
                System.out.print("Otro intento: ");
                b = sc.nextInt();
                while (b < 1 || b > 12) {
                    System.out.println("Número incorrecto.Ingrese de nuevo ");
                    b = sc.nextInt();
                }
            }
            else if (i ==2) {
                int x = (int) (mesAleatorio/10);
                System.out.println("Una pista, la primera cifra es " + x);
                System.out.print("Inténtalo de nuevo: ");
                b = sc.nextInt();
                while (b<1 || b>12){
                    System.out.println("Número incorrecto.Ingrese de nuevo ");
                    b = sc.nextInt();
                }
            }
            else if (i >= 3) {
                System.out.print("Oh, oh... ÚLTIMO intento: ");
                b = sc.nextInt();
                while (b<1 || b>12){
                    System.out.println("Número incorrecto.Ingrese de nuevo ");
                    b = sc.nextInt();
                }
            }
        }
    }
}







