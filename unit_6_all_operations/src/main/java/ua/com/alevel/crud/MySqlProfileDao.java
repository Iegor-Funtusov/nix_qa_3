package ua.com.alevel.crud;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class MySqlProfileDao implements ProfileDao {

    private final List<Profile> profiles = new ArrayList<>();

    public MySqlProfileDao() {
        System.out.println("MySqlProfileDao.MySqlProfileDao");
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
