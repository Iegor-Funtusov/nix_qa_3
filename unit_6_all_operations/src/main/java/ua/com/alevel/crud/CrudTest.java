package ua.com.alevel.crud;

import java.util.List;
import java.util.UUID;

public class CrudTest {

    public void test() {
//        Profile profile = new Profile();
//        AuthUser authUser = new AuthUser();
//        BaseClass baseClass = new BaseClass();

//        MySqlProfileDao mySqlProfileDao = new MySqlProfileDao();
//        MongoDBProfileDao mongoDBProfileDao = new MongoDBProfileDao();

        DaoFactory daoFactory = new DaoFactory();

        ProfileDao profileDao = (ProfileDao) daoFactory.generateImplementationByInterface(ProfileDao.class);
        for (int i = 0; i < 3; i++) {
            Profile profile = new Profile();
            profile.setAvatar("https://" + UUID.randomUUID().toString() + ".png");
            profile.setId(UUID.randomUUID().toString());
            profileDao.create(profile);
        }

        List<Profile> all = profileDao.findAll();
        for (Profile profile : all) {
            System.out.println("profile = " + profile);
        }
    }
}
