package ru.tinkoff.recyclerviewapp.group;

import ru.tinkoff.recyclerviewapp.recycler.DelegateItem;

public class Group implements DelegateItem {

    private String name;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public String getContent() {
        return name;
    }
}
