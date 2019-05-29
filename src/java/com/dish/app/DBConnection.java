package com.dish.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cperalta
 */
public class DBConnection {

    private Connection connect;

    public Connection connect() throws PIDPlatformException {
        connect = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_DISH?serverTimezone=UTC", "root", "87654321");

        } catch (ClassNotFoundException | SQLException ex) {
            throw new PIDPlatformException("Imposible conectar a la base de datos - " + ex.getMessage());
        }
        return connect;
    }

    public void disconnect() throws PIDPlatformException{
        try {
            this.connect.close();
        } catch (SQLException ex) {
            throw new PIDPlatformException(ex.getMessage());
        }
    }
}
