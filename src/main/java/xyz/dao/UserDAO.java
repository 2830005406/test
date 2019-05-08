package xyz.dao;
import xyz.entity.*;

import java.util.List;

public interface UserDAO {
   List<User> queryAll();
   void insert(User user);
}
