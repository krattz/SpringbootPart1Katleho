package Service;

import Model.FakeRepoInterface;
import Model.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class  UserServiceImpl implements FakeRepoInterface  {
    private FakeRepoInterface fk;


    @Autowired
    LinkedList<FakeRepo>list = new LinkedList();

    public long addUser(long Id , String name, String surname){
        insertUser(Id,name,surname);
      return  getUser(Id);
    }

    public void removeUser(long Id) {
        fk.deleteUser(findUserById(Id));
    }

    public long getUser(long Id) {
        if(list.contains(Id)){
            System.out.println("Hello" + list.get((int) Id));
        }
        return Id;
    }
    @Override
    public String insertUser(long id, String name, String surname) {
    return id+name+surname;
    }
    @Override
    public long findUserById(long id) {
        return 0;
    }

    @Override
    public void deleteUser(long id) {
        if(list.contains(findUserById(id))){
            removeUser(id);
        }
        System.out.println(findUserById(id) + " removed");
    }
}
