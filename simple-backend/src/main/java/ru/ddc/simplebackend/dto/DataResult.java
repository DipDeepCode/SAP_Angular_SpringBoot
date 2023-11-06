package ru.ddc.simplebackend.dto;

import java.util.Random;

public class DataResult {

    private String data;
    private Integer followers;
    private Integer following;
    

    public DataResult(String data) {
        Random random = new Random();
        this.data = data;
        this.followers = random.nextInt(100);
        this.following = random.nextInt(10000);
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
    

    public Integer getFollowers() {
        return this.followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return this.following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }
}
