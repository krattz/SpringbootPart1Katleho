package Model;

public interface FakeRepoInterface< id, name, surname> {
   String insertUser(long id, String name, String surname);

   long findUserById(long id);

   void deleteUser(long id);


}
