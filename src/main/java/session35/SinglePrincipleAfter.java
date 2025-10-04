package session35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SinglePrincipleAfter {
}

class UserValidation{

    public void validation(String userName, String email, String password){
        if(userName == null || userName.length() < 2){
            throw new IllegalArgumentException("Username validation faild");
        }
        if (!email.contains("@")){
            throw new IllegalArgumentException("Email validation faild");
        }
        if(password.length()<6){
            throw new IllegalArgumentException("Password validation faild.");
        }
    }
}

class UserRepository{
    public void saveUser(String userName, String email, String password){
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
    }
}

class UserEmailService{
    public void sendEmail(String userName, String email){
       try { // email configuration
           //email send
       } catch (Exception e){
           throw new RuntimeException();
       }

    }
}

class UserRegistrationService{
    private UserValidation userValidation;
    private UserRepository userRepository;
    private UserEmailService userEmailService;

    public UserRegistrationService(UserValidation userValidation, UserRepository userRepository, UserEmailService userEmailService) {
        this.userValidation = userValidation;
        this.userRepository = userRepository;
        this.userEmailService = userEmailService;
    }

    public void registrationUser(String userName, String email, String password){
        userValidation.validation(userName,email,password);
        userRepository.saveUser(userName,email,password);
        userEmailService.sendEmail(userName,email);
    }
}
