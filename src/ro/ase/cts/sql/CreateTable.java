package ro.ase.cts.sql;

import ro.ase.cts.contract.ExpressionSQL;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable extends Expression implements ExpressionSQL {

    @Override
    public void expression(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(getSqlDrop());
            statement.executeUpdate(getSqlCreate());
            statement.close();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
