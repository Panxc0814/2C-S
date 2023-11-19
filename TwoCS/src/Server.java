


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Server {
    private static ArrayList<User> users = new ArrayList<>();

    public Server(){
        users.add(new User("潘兴成","18812345446","成都市"));
        users.add(new User("赵子龙","11561123120","常山"));
        users.add(new User("孙悟空","12345678912","花果山"));
        users.add(new User("猪八戒","12345688912","高老庄"));

    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }

    public static void deleteUserByName(String name){
        for (User user : users) {
            if(user.getName().equals(name)){
                users.remove(user);
                return;
            }
        }
    }

    public static void addUses(User user){
        users.add(user);
    }
}
