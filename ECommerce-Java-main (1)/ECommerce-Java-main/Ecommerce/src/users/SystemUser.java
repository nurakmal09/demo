package users;
public abstract class SystemUser {
    String userId = " ";
    String password = " ";
    
    abstract Boolean verifyUser();
    public SystemUser(String userId, String password) {
        this.userId = userId;
        this.password = password;
        
    }
    public SystemUser(){
    }
}
