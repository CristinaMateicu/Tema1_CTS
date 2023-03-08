package ro.ase.cts.sql;

import ro.ase.cts.contract.ExpressionSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData extends Expression implements ExpressionSQL {

    @Override
    public void expression(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(getSqlInsert());
            statement.close();

            PreparedStatement preparedStatement = connection.prepareStatement(getSqlInsertWithParams());
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Ionescu Vasile");
            preparedStatement.setString(3, "Brasov");
            preparedStatement.setDouble(4, 4500);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
