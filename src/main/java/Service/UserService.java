package Service;


import Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
   String addUser(long Id, String name, String surname);

   void removeUser(long Id);

   String getUser(long Id);

}
