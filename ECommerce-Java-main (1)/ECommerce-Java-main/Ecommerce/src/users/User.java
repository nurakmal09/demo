package users;
public abstract class User {
    String userId = " ";
    String password = " ";
    
    abstract Boolean verifyUser();
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
        
    }
    public User(){
    }
}
