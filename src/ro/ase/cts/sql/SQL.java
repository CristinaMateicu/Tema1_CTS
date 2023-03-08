package ro.ase.cts.sql;

import ro.ase.cts.contract.DataBase;
import ro.ase.cts.contract.ExpressionSQL;
import ro.ase.cts.orchestrators.OrchestratorSQL;

import java.lang.reflect.InvocationTargetException;

public class SQL implements DataBase {

    @Override
    public void database() {
        try {
            ExpressionSQL create = (ExpressionSQL) Class.forName("ro.ase.cts.sql.CreateTable").getDeclaredConstructor().newInstance();
            ExpressionSQL insert = (ExpressionSQL) Class.forName("ro.ase.cts.sql.InsertData").getDeclaredConstructor().newInstance();
            ExpressionSQL read = (ExpressionSQL) Class.forName("ro.ase.cts.sql.ReadData").getDeclaredConstructor().newInstance();
            OrchestratorSQL orchestrator = new OrchestratorSQL(create, insert, read);
            orchestrator.execute();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
