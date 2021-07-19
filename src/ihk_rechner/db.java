package ihk_rechner;

import java.sql.*;

public class db {
    static Connection connect = null;                                                                                   // Klasse connection liefert uns die Basis für alle Datenbankverbindungen
    static Statement sql=null;                                                                                          //Klasse Statement liefert uns die Basis für alle SQL-Abfragen und Anweisungen (Befehlserstellung)
    static ResultSet result = null;


    public static Connection connect(){
        try {
            String db_driver = "com.mysql.cj.jdbc.Driver";                                                                  //was brauchen wir für die Verbindung zur Datenbank
            String db_url = "jdbc:mysql://localhost:3306/ihk";                                                        //Datenbanktreiber, Datenbank-url und Datenbankname, Benutzername, Passwort
            String db_username ="dbconnect";                                                                                // --> String Variablen
            String db_pass = "popo";

            Class.forName(db_driver);                                                                                         // zugriff auf den treiber aus der library des mysql-Connectors
            connect = DriverManager.getConnection(db_url, db_username,db_pass);                                           //Auflösung des treibernamens aus der String-Variable db_driver --> Suche in der Library
            System.out.println("Verbindung hergestellt");
            return connect;

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void insert()
    {
        connect = connect();
        System.out.println("verbindung hergestellt");//Connection zur Datenbank
        try {
            String name = gui.textField_32.getText();
            String[] namensteil = name.split(" ");

            String sql = "INSERT INTO `pruefergebnis`(`ID`, `Vorname`, `Nachname`, `Projektarbeit`, `Projekt Dokumentation`," +
                    " `Projekt Praesentation`, `Projekt Fachgespraech`, `Fachqualifikation`, `Kernqualifikation`, `WISO`," +
                    " `SummeA`, `SummeB`, `Pruefergebnis`) " +
                    "VALUES ('"+ gui.textField_33.getText() +"','"+ namensteil[0]  +" ','"+ namensteil[1]+"'," +
                    "'"+ Double.parseDouble(gui.textField.getText()) +"','"+ Double.parseDouble(gui.textField_1.getText()) +"','"+ Double.parseDouble(gui.textField_2.getText()) +"','"+ Double.parseDouble(gui.textField_3.getText()) +"'," +
                    "'"+ Double.parseDouble(gui.textField_16.getText()) +"','"+ Double.parseDouble(gui.textField_17.getText()) +"','"+ Double.parseDouble(gui.textField_18.getText()) +"','"+ Double.parseDouble(gui.textField_28.getText()) +"','"+ Double.parseDouble(gui.textField_29.getText()) +"','"+ Double.parseDouble(gui.textField_34.getText()) +"')";
            PreparedStatement insert_dataset = connect.prepareStatement(sql);
            insert_dataset.executeUpdate();

            connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
