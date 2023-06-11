package ASPECT;

import java.util.Scanner;

public class AppAdapter {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n\n1. Usar motor de diesel");
        System.out.println("2. Usar motor de gasolina");
        System.out.println("3. Usar motor eléctrico");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        int opc = scn.nextInt();
        System.out.println("");
        switch (opc) {
            case 1 -> usarMotor(new MotorDiesel());
            case 2 -> usarMotor(new MotorGasolina());
            case 3 -> usarMotor(new MotorElectricoAdapter());
            case 4 -> System.out.println("Bye");
        }
    }

    private static void usarMotor(Motor motor) {
        motor.recargar();
        motor.encender();
        motor.acelerar();
        motor.desacelerar();
        motor.apagar();
        menu();
    }

}
