package Model.entity;

public class Account {
    
    private int accountID;
    private int account;
    private int userID;
    
    public int getAccountID(){
        return accountID;
    }
    
    public int getAccount(){
        return account;
    }
    
    public int getUserID(){
        return userID;
    }
    
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    
    public void setAccount(int account){
        this.account = account;
    }
    
    public void setUserID(int userID){
        this.userID = userID;
    }
    
}
