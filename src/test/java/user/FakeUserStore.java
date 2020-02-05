package user;

import java.util.ArrayList;
import java.util.List;

public class FakeUserStore implements UserStore {
    private ArrayList<User> users = new ArrayList<User>();

    @Override
    public void store(User user) {
        users.add(user);
    }

    @Override
    public List<User> findAll() {
        return users;
    }
}
