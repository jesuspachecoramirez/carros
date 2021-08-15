package Vista;

import Modelo.CarrosDTO;
import java.util.ArrayList;
import java.util.Scanner;

public class Ingresos {
    
    
     Scanner entrada = new Scanner(System.in);
     
     public void mostrarAgenda(ArrayList<CarrosDTO> conductores) {
        for (CarrosDTO registro : conductores) {
            System.out.println("\nEl directorio de conductores de cada auto" + "\n");
            System.out.println("Ferrari:" + registro.getFerrari());
            System.out.println("Bmw:" + registro.getBmw());
            System.out.println("Audi:" + registro.getAudi());
            System.out.println("Bugatti:" + registro.getBugatti());
            System.out.println("Lamborgini:" + registro.getLamborgini());
            System.out.println("Mclaren:" + registro.getMclaren());
            System.out.println("Porche:" + registro.getPorche());
            System.out.println("Subaru:" + registro.getSubaru());
            System.out.println("---------------------------------");
        }
    }
     public String texto(String mensaje) {
        String texto = "";
        System.out.println(mensaje);
        texto = entrada.nextLine();
        return texto;
    }

    public long numeros(String mensaje) {
        long numero = 0;
        try {
            System.out.println(mensaje);
            numero = entrada.nextLong();
            entrada.nextLine();
        } catch (Exception x) {
            entrada.nextLine();
            System.out.println("No ha ingresado un numero");
            numero = 0;
        }
        return numero;
    }

    public void informacion(String mensaje) {
        System.out.println(mensaje);
    }

    public int respuesta(String mensaje) {
        int dato = 0;
        try {
            System.out.println(mensaje);
            dato = entrada.nextInt();
            entrada.nextLine();
        } catch (Exception x) {
            entrada.nextLine();
            System.out.println("No ha ingresado un numero");
            dato = 0;
        }

        return dato;

    }
}


