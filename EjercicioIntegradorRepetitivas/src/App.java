import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       

        String matricula = "";
        int opcion, cantHoras;
        double total;
        Scanner teclado = new Scanner(System.in);

        while(!matricula.equalsIgnoreCase("Fin")){ 
            System.out.println("Ingrese la matricula del auto");
            matricula = teclado.nextLine();

            System.out.println("Ingrese el tipo de servicio");
            System.out.println("1 - Por hora");
            System.out.println("2 - Media Jornada (5 horas)");
            System.out.println("3 - Jornada Completa (10 horas)");


            try {
                opcion = teclado.nextInt();
                teclado.nextLine();

                if (opcion < 1 || opcion > 3) {
                    System.out.println("Ingresa una opción válida.");
                }
                else{
                    switch (opcion) {
                        case 1:
                            System.out.println("Ingrese la cantidad de horas que desea estacionar: ");
                            cantHoras = teclado.nextInt();
                            total = cantHoras*3;
                            System.out.println("Usted debera pagar $" + total + " Dolares");
                            break;
                        
                        case 2:
                            System.out.println("Media Jornada corresponde a 5 horas y tiene un descuento de 5%");
                            total = 15 - (15*0.05);
                            System.out.println("Usted debera pagar $" + total + " Dolares");
                            break;
                        default:
                            System.out.println("Jornada Completa corresponde a 10 horas y tiene un descuento de 10%");
                            total = 30 - (30*0.10);
                            System.out.println("Usted debera pagar $" + total + " Dolares");
                            break;
                    }
                    System.out.println("***** GRACIAS POR USAR EL SISTEMA DE ESTACIONAMIENTO *****");
                }
            } catch (Exception e) {
                System.out.println("Ingresa una opción valida");
                teclado.nextLine();
            }


        }
     teclado.close();   
    }
}
