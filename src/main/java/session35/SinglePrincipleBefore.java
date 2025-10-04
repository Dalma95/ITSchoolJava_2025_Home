package session35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SinglePrincipleBefore {

}

class UserRegistration{
    public void registrationUser(String userName, String email, String password){

//        validare
        if(userName == null || userName.length() < 2){
            throw new IllegalArgumentException("Username validation faild");
        }
        if (!email.contains("@")){
            throw new IllegalArgumentException("Email validation faild");
        }
        if(password.length()<6){
            throw new IllegalArgumentException("Password validation faild.");
        }

        // add user in DB
        try(Connection connection = DriverManager.getConnection("con1")){
            String sql = "insert into Users (username, email, password) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userName);
            statement.setString(2, email);
            statement.setString(3,password);
            statement.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

        //email implementation
        try{
            //logic email
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
