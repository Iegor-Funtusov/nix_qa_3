package ua.com.alevel.crud;

import java.util.ArrayList;
import java.util.List;

//@Deprecated
public class MongoDBProfileDao implements ProfileDao {

    private final List<Profile> profiles = new ArrayList<>();

    public MongoDBProfileDao() {
        System.out.println("MongoDBProfileDao.MongoDBProfileDao");
    }

    @Override
    public void create(Profile profile) {
        profiles.add(profile);
    }

    @Override
    public List<Profile> findAll() {
        return profiles;
    }
}
