package Service;


public interface UserService<name,surname, Id> {
   void addUser(String name, String surname);

   void removeUser(long Id);

   void getUser(long Id);

}
