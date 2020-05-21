package Service;

import Dao.FakeRepoInterface;
import Dao.FakeRepo;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class  UserServiceImpl implements FakeRepoInterface {


    public List<User>  getList() {
        return Arrays.asList(new User(1, "Mzekelelo", "madisha")) ;
    }

    public String addUser(long Id , String name, String surname){
        insertUser(Id,name,surname);

      return   name+ " entered";
    }

    public void removeUser(long Id) {
        deleteUser(findUserById(Id));
    }

    public String getUser(long Id) {

        return "Hello "+ FakeRepo.DB.get((int)findUserById(Id)).toString();
    }
    @Override
    public String insertUser(long id, String name, String surname) {
        FakeRepo.DB.add(1, new User(id, name, surname));
    return id+" "+name+" "+surname;
    }
    @Override
    public long findUserById(long id) {
        return 0;
    }

    @Override
    public void deleteUser(long id) {
        if(FakeRepo.DB.contains(findUserById(id))){
            removeUser(id);
        }
        System.out.println(findUserById(id) + " removed");
    }

    @Autowired
    public List<User> selectUser() {
        System.out.println("trying");

        return FakeRepo.DB;
    }
}
