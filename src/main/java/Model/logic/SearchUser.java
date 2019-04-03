package Model.logic;

import Model.entity.User;
import Model.entity.container.UserList;

public class SearchUser {
    public String findUserFullName(UserList list, int userID){
        String userFullName = "";
        
        for( User user: list.getList()){
            if(userID == user.getUserID()){
                userFullName = user.getUserName() + " "
                        + user.getUserSureName();
                break;
            }
        }
        
        return userFullName;
    }
    
}
