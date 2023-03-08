package ro.ase.cts.sql;

public class Expression {
    String sqlDrop = "DROP TABLE IF EXISTS employees";
    String sqlCreate = "CREATE TABLE employees(id INTEGER PRIMARY KEY," + "name TEXT, address TEXT, salary REAL)";
    String sqlInsert = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
    String sqlInsertWithParams = "INSERT INTO employees VALUES (?,?,?,?)";
    String sqlSelect = "SELECT * FROM employees";

    public String getSqlDrop() {
        return sqlDrop;
    }

    public String getSqlCreate() {
        return sqlCreate;
    }

    public String getSqlInsert() {
        return sqlInsert;
    }

    public String getSqlInsertWithParams() {
        return sqlInsertWithParams;
    }

    public String getSqlSelect() {
        return sqlSelect;
    }
}
