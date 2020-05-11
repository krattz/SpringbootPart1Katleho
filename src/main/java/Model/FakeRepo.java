package Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeRepo implements FakeRepoInterface {
    public FakeRepoInterface fkrepo;
    private static Map<Integer, User> link;

    static {
        link = new HashMap<Integer, User>() {
            {
                put(1, new User(1, "Roger", "Good"));
                put(1, new User(1, "Dan", "Mabote"));
                put(1, new User(1, "Skara", "Ngobese"));
                put(1, new User(1, "Fat", "Amy"));
            }
        };
    }
    public Collection<User> getAllUsers(){
        return this.link.values();
    }

            @Override
            public String insertUser(long id, String name, String surname) {
                return id + name + surname;
            }

            @Autowired
            public long findUserById(long id) {
                if (link.containsKey(id)) {
                    System.out.println(findUserById(id));
                }

                return findUserById(id);
            }


            @Autowired
            public void deleteUser(long id) {
                link.remove(link.get(id));
            }
        }