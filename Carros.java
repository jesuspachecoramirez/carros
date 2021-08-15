package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import permanencia.UserPass;

public class Carros {

    private ArrayList<CarrosDTO> conductores;
    private UserPass cx;

    public Carros() {
        conductores = new ArrayList<CarrosDTO>();
        cx = new UserPass();

    }

    public Connection conectarBD() {
        Connection conn = null;
        int opcion = 2;
        switch (opcion) {
            case 1:
                conn = cx.conectarBDMySQL();
                break;
            case 2:
                conn = cx.conectarBDSQLite();
                break;
        }
        return conn;
    }

    public void Autos(String Ferrari, String Bmw, String Audi, String Bugatti, String Lamborgini, String Mclaren, String Porche, String Subaru) {
        try {
            Connection conn = conectarBD();
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO carros VALUES ('" + Ferrari + "','" + Bmw + "','" + Audi + "','" + Bugatti + "','" + Lamborgini + "','" + Mclaren + "','" + Porche + "','" + Subaru + "')";
            //System.out.println(sql);
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   

    public void Pista() {
        //int tamaño = 3000;
        //int carriles = 8;
        int distancia;
        int cont = 0, resultado = 0, i = 0;
        int p1 = 0, p2 = 0, p3, p4, p5, p6, p7, p8;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0;

        while (true) {

            for (i = 0; i <= 8; i++) {
                distancia = (int) (Math.random() * 7);
                distancia = distancia * 100;
                switch (i) {
                    case 1: {
                        cont1 = cont1 + distancia;
                        p1 = cont1;
                        String encontrado = "", bus = "Ferrari";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p1: " + p1);
                        if (p1 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);

                        }
                        break;
                    }
                    case 2: {
                        cont2 = cont2 + distancia;
                        p2 = cont2;
                        String encontrado = "", bus = "Bmw";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p2: " + p2);
                        if (p2 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);

                        }
                        break;
                    }
                    case 3: {
                        cont3 = cont3 + distancia;
                        p3 = cont3;
                        String encontrado = "", bus = "Audi";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p3: " + p3);
                        if (p3 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);
                        }
                        break;
                    }
                    case 4: {
                        cont4 = cont4 + distancia;
                        p4 = cont4;
                        String encontrado = "", bus = "Bugatti";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p4: " + p4);
                        if (p4 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);
                        }
                        break;
                    }
                    case 5: {
                        cont5 = cont5 + distancia;
                        p5 = cont5;
                        String encontrado = "", bus = "Lamborgini";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p5: " + p5);
                        if (p5 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);

                        }
                        break;
                    }
                    case 6: {
                        cont6 = cont6 + distancia;
                        p6 = cont6;
                        String encontrado = "", bus = "Mclaren";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p6: " + p6);
                        if (p6 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);
                        }
                        break;
                    }
                    case 7: {
                        cont7 = cont7 + distancia;
                        p7 = cont7;
                        String encontrado = "", bus = "Porche";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p7: " + p7);
                        if (p7 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);

                        }
                        break;
                    }
                    case 8: {
                        cont8 = cont8 + distancia;
                        p8 = cont8;
                        String encontrado = "", bus = "Subaru";
                        //System.out.println("contador: " + distancia);
                        //System.out.println("p8: " + p8);
                        if (p8 == 3000) {
                            cont = 3000;
                            System.out.println("El ganador es: "+bus);

                        }
                        break;
                    }
                    default:
                }

            }
            if (cont == 3000) {
                break;
            }

        }

    }

    public void selectCarros() {
        conductores=new ArrayList<CarrosDTO>();
        try {
            Connection conn = conectarBD();
            Statement stmt = conn.createStatement();
            CarrosDTO conductor;
            String sql = "SELECT * FROM carros";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                conductor = new CarrosDTO();
                conductor.setFerrari(rs.getString("Ferrari"));
                conductor.setBmw(rs.getString("Bmw"));
                conductor.setAudi(rs.getString("Audi"));
                conductor.setBugatti(rs.getString("Bugatti"));
                conductor.setLamborgini(rs.getString("Lamborgini"));
                conductor.setMclaren(rs.getString("Mclaren"));
                conductor.setPorche(rs.getString("Porche"));
                conductor.setSubaru(rs.getString("Subaru"));
                getConductores().add(conductor);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ganadores(){
        
        
    }

    /**
     * @return the conductores
     */
    public ArrayList<CarrosDTO> getConductores() {
        return conductores;
    }

    /**
     * @param conductores the conductores to set
     */
    public void setConductores(ArrayList<CarrosDTO> conductores) {
        this.conductores = conductores;
    }

}
