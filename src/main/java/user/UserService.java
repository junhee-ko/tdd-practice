package user;

import java.util.List;

public interface UserService {

    public abstract List<User> users();

    public abstract void register(String username);

    public abstract User find(String username);
}
