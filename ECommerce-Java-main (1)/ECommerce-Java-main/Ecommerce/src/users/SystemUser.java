package users;
public abstract class SystemUser {
    String userId = " ";
    String password = " ";
    
    abstract Boolean verifyUser(String enteredPassword);
    public SystemUser(String userId, String password) {
        this.userId = userId;
        this.password = password;
        
    }
    public SystemUser(){
    }
}

@Override

//function to verify user
public void initialize(URL url, ResourceBundle resourceBundle){

}
