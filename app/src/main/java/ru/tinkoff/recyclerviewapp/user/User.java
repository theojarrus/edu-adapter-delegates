package ru.tinkoff.recyclerviewapp.user;

import ru.tinkoff.recyclerviewapp.recycler.DelegateItem;

public class User implements DelegateItem {

    private String id;
    private String name;
    private String email;
    private String avatar;

    public User(String id, String name, String email, String avatar)  {
        this.id = id;
        this.name = name;
        this.email = email;
        this.avatar = avatar;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getContent() {
        return name + email + avatar;
    }
}
