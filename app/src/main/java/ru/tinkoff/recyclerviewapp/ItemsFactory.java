package ru.tinkoff.recyclerviewapp;

import java.util.ArrayList;
import java.util.List;

import ru.tinkoff.recyclerviewapp.group.Group;
import ru.tinkoff.recyclerviewapp.recycler.DelegateItem;
import ru.tinkoff.recyclerviewapp.user.User;

public class ItemsFactory {

    public List<DelegateItem> createItems() {
        // Create List
        List<DelegateItem> items = new ArrayList<>();
        // Create users
        items.add(new User("0", "Sample Name 1", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("1", "Sample Name 2", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("2", "Sample Name 3", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new Group("Group A"));
        items.add(new User("3", "Sample Name 4", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("4", "Sample Name 5", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("5", "Sample Name 7", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new Group("Group B"));
        items.add(new User("6", "Sample Name 8", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("7", "Sample Name 9", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("8", "Sample Name 10", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("9", "Sample Name 11", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new Group("Group C"));
        items.add(new User("10", "Sample Name 12", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        items.add(new User("11", "Sample Name 13", "email@email.com", "https://static.vecteezy.com/system/resources/previews/021/515/129/original/android-icon-logo-symbol-with-name-white-design-operating-system-illustration-with-black-background-free-vector.jpg"));
        // Return users
        return items;
    }
}
