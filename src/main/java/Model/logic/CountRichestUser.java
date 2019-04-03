package Model.logic;

import Model.entity.Account;
import Model.entity.container.AccountList;

public class CountRichestUser {
    public static int calculateRichestUser(AccountList list){
        int biggerAcc = 0;
        int userID = 1;
        
        for(Account acc: list.getList()){
            if(acc.getAccount() > biggerAcc){
                biggerAcc = acc.getAccount();
                userID = acc.getUserID();
            }
        }
            
        return userID;
    }
    
}
