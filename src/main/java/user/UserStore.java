package user;

import java.util.List;

public interface UserStore {

    void store(User user);

    List<User> findAll();
}
