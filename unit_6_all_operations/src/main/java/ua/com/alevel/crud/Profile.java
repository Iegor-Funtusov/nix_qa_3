package ua.com.alevel.crud;

public class Profile extends BaseClass {

    private String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id='" + getId() + '\'' +
                "avatar='" + avatar + '\'' +
                '}';
    }
}
