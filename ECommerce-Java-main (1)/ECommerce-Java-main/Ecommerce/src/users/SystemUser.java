package users;
public abstract class SystemUser {
    String userId = " ";
    String password = " ";
    
    //Password is stored as a hash in a dtabase, not hardcoded
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
