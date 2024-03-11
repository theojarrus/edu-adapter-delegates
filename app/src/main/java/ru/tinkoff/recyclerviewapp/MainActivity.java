package ru.tinkoff.recyclerviewapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ru.tinkoff.recyclerviewapp.databinding.ActivityMainBinding;
import ru.tinkoff.recyclerviewapp.group.GroupAdapterDelegate;
import ru.tinkoff.recyclerviewapp.recycler.AdapterDelegate;
import ru.tinkoff.recyclerviewapp.recycler.BaseAdapter;
import ru.tinkoff.recyclerviewapp.recycler.DelegateItem;
import ru.tinkoff.recyclerviewapp.user.UserAdapterDelegate;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Create delegates
        List<AdapterDelegate> delegates = new ArrayList<>();
        delegates.add(new GroupAdapterDelegate());
        delegates.add(new UserAdapterDelegate(user -> {
            Toast.makeText(this, "Clicked on: " + user.getName(), Toast.LENGTH_SHORT).show();
        }));

        // Create and set BaseAdapter
        BaseAdapter baseAdapter = new BaseAdapter(delegates);
        binding.recycler.setAdapter(baseAdapter);

        // Create and set items
        List<DelegateItem> items = new ItemsFactory().createItems();
        baseAdapter.submitList(items);
    }
}
