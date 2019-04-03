package Model.entity;

public class User {
    private int userID;
    private String userName;
    private String userSureName;
    
    
    public int getUserID(){
        return userID;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getUserSureName(){
        return userSureName;
    }
    
    public void setUserID(int userID){
        this.userID = userID;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setUserSureName(String userSureName){
        this.userSureName = userSureName;
    }
    
    public String toString(){
        return userName;
    }
    
}
