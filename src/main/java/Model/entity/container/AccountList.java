package Model.entity.container;

import java.util.ArrayList;
import java.util.List;

import Model.entity.Account;
import Model.entity.Account;

public class AccountList {
    
    private List<Account> list = new ArrayList<>();
    
    public void add(Account acc){
        list.add(acc);
    }
    
    public List<Account> getList(){
        return list;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("List of accounts:\n");

        for (Account account : list)
            builder.append(account.toString()).append("\n");

        return builder.toString();
    }
}
