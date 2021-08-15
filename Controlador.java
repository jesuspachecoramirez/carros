package Main;

import Modelo.Carros;
import Modelo.CarrosDTO;
import Vista.Ingresos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Controlador {

    private static Carros ca;
    private static Ingresos in;
    private static CarrosDTO cs;

    public static void main(String[] args) throws SQLException {
        ca = new Carros();
        in = new Ingresos();
        opciones();
    }

    public static void opciones() throws SQLException {

        int opcion = 0;

        while (opcion != 4) {
            String menu = "CARRERA AUTOMOVILISTICA JHESU" + "\n"
                    + "Seleccione una opción :" + "\n"
                    + "1. Seleccionar Auto y Corredor" + "\n"
                    + "2. Empezar juego" + "\n"
                    + "3. Calificaciones" + "\n"
                    + "4. Salir" + "\n"
                    + "Selecionado:";
            opcion = in.respuesta(menu);

            switch (opcion) {
                case 1: {
                    Corredores();

                    break;
                }
                case 2: {

                    ca.Pista();
                    

                    break;
                }

                case 3: {
                    ca.selectCarros();
                    in.mostrarAgenda(ca.getConductores());
                    //System.out.println(ca.getConductores());

                    break;
                }
                case 4: {
                    in.informacion("\n" + "Hasta pronto");

                    break;
                }
                default:
                    in.informacion("Opcion no valida");

            }

        }

    }

    public static void Corredores() {
        int opcion = 0;
        String Ferrari = "Michael", Bmw = "Paul", Audi = "Rafael", Bugatti = "Leona", Lamborgini = "Scarlet", Mclaren = "Simon", Porche = "Sebastian", Subaru = "Pirlo";
        String menu = "CARRERA AUTOMOVILISTICA JHESU" + "\n"
                + "Seleccione un automovil :" + "\n"
                + "1. Ferrari" + "\n"
                + "2. Bmw" + "\n"
                + "3. Audi" + "\n"
                + "4. Bugatti" + "\n"
                + "5. Lamborgini" + "\n"
                + "6. Mclaren" + "\n"
                + "7. Porche" + "\n"
                + "8. Subaru" + "\n"
                + "9. Salir" + "\n";
        opcion = in.respuesta(menu);
        switch (opcion) {
            case 1: {

                Ferrari = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 2: {

                Bmw = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 3: {

                Audi = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 4: {

                Bugatti = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 5: {

                Lamborgini = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 6: {

                Mclaren = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 7: {

                Porche = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 8: {

                Subaru = in.texto("Ingresa tu nombre de conductor");

                break;
            }
            case 9: {
                in.informacion("\n" + "Hasta pronto");
                break;
            }
            default:
                in.informacion("Opcion no valida");

        }

        ca.Autos(Ferrari, Bmw, Audi, Bugatti, Lamborgini, Mclaren, Porche, Subaru);

    }

    public static void pista() {
       
        
    }

}
