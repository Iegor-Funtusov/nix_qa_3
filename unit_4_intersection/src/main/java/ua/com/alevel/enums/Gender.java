package ua.com.alevel.enums;

public enum Gender {

    MALE("male", ""),
    FEMALE("female", "");

    private final String enType;
    private final String ruType;

    Gender(String enType, String ruType) {
        this.enType = enType;
        this.ruType = ruType;
    }

    public String getEnType() {
        return enType;
    }

    public String getRuType() {
        return ruType;
    }
}
