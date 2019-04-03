package Model.logic;

import Model.entity.Account;
import Model.entity.container.AccountList;
public class CountSumOfAccounts {
    public static int calculateTotalAccount(AccountList list){
        int totalAccs = 0;
        
        for(Account acc: list.getList()){
            totalAccs += acc.getAccount();
        }
        
        return totalAccs;
    }
    
}
