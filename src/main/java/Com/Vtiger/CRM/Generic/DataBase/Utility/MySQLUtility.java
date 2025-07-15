package Com.Vtiger.CRM.Generic.DataBase.Utility;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUtility {

        Connection connection;

        public void getConnection() throws SQLException {
            try {
                Driver driver = new Driver();
                DriverManager.registerDriver(driver);
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","root");
            }catch (Exception e){

            }

        }
        public ResultSet ExecuteQuery(String Query) throws SQLException {
            ResultSet resultSet=null;
            try {
                Statement statement=connection.createStatement();
                 resultSet= statement.executeQuery(Query);
            }catch (Exception e){

            }

            return resultSet;
        }

        public int ExecuteUpdate(String Query) throws SQLException {
            int result=0;
            try{
                Statement statement=connection.createStatement();
                 result= statement.executeUpdate(Query);
            }catch (Exception e){

            }

        return result;
        }


        public void CloseConnection() throws SQLException {
            try{
                connection.close();
            }catch (Exception e){

            }

        }

}
