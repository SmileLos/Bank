package Model.entity.container;

import java.util.ArrayList;
import java.util.List;

import Model.entity.User;
import Model.entity.User;

public class UserList {
    
    private List<User> list = new ArrayList<>();
    
    public void add(User user){
        list.add(user);
    }
    
    public List<User> getList(){
        return list;
    }
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("List of users:\n");

        for (User user : list)
            builder.append(user.toString()).append("\n");

        return builder.toString();
    }
}

