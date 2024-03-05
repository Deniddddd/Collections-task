package app;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private List<User> users;

    public Collection(){
        users = new ArrayList<>();
    }
    public void addser(User user) {
        users.add(user);
    }

    public void printAllUsers() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i));
        }
    }

    public User getUserAtIndex(int index) {
        if (index >= 0 && index < users.size()) {
            return users.get(index);
        } else {
            return null;
        }
    }
}
