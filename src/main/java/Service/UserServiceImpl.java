package Service;

import Dao.FakeRepoInterface;
import Dao.FakeRepo;
import Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class  UserServiceImpl implements UserService {
@Autowired
    FakeRepo repo;

    @Override
    public void removeUser(long Id) {
        System.out.println(repo.findUserById(Id).getName() + " removed");
        repo.deleteUser(Id);
    }

    @Override
    public String getUser(long Id) {

        return "Hello " + repo.DB.get(Id).getName();
    }

    public String addUser(long Id, String name, String surname) {
        repo.insertUser(Id, name, surname);

        return name + " entered";
    }
}