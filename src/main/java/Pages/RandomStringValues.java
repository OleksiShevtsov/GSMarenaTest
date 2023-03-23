package Pages;

import org.apache.commons.lang3.RandomStringUtils;

public abstract class RandomStringValues {
    String nickname;
    String email;
    String password;

    public RandomStringValues() {
    }

    public RandomStringValues(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static String setGeneratedString(int length, boolean useLetters, boolean useNumbers) {
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

}
