import pl.coderslab.entity.User;

public class MainUser {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
//        #dodawanie
        User user = new User();
        user.setUsername("kazik");
        user.setEmail("kazunio@yahoo.com");
        user.setPassword("KaZiUmistrz9345");
        userDao.createUser(user);

//        #czytanie
//        User readUser = userDao.readUser(5);
//        System.out.println(readUser);

//        #usuwanie
//        userDao.removeUser(5);

//        #update
//        User userUpdate = userDao.readUser(1);
//        userUpdate.setUsername("Grud");
//        userUpdate.setEmail("grud65@o2.pl");
//        userUpdate.setPassword("grud1234");
//        userDao.updateUser(userUpdate);

//        #wyswietlanie wszystkich
//        User[] all = userDao.findAllUsers();
//        for (User u : all) {
//            System.out.println(u);
//        }

    }



}
