package Model;


import Service.UserServiceImpl;

public class User {
        private long Id;
        private String name;
        private String surname;
        private UserServiceImpl userImpl;

    public User(long id, String name, String surname) {

        Id = id;
        this.name = name;
        this.surname = surname;

    }


    public  long getId() {
        return setId(Id);
    }
    public long setId(long id) {
        Id = id;
        return userImpl.getUser(id);
    }

    public void getName() {
        setName(name);
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }

    public void getSurname() {
        setSurname(surname);
    }
    public String setSurname(String surname) {

        this.surname = surname;
    return surname;
    }



}
