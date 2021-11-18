package ua.com.alevel.crud;

import java.util.List;

public interface ProfileDao {

    void create(Profile profile);
    List<Profile> findAll();
}
