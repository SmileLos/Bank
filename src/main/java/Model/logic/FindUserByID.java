package Model.logic;

import Model.entity.container.UserList;
import Model.entity.User;
public class FindUserByID {
    public static String getUserName(int userID, UserList list){
        String userName = "";
        for (User user: list.getList()){
            if (user.getUserID() == userID){
                userName = user.getUserName() + " " + user.getUserSureName();
            }
        }

        return userName;
    }
}
