package ru.tinkoff.recyclerviewapp.group;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import ru.tinkoff.recyclerviewapp.recycler.AdapterDelegate;
import ru.tinkoff.recyclerviewapp.recycler.DelegateItem;
import ru.tinkoff.recyclerviewapp.databinding.ItemGroupBinding;

public class GroupAdapterDelegate implements AdapterDelegate {

    @Override
    public boolean isOfViewType(DelegateItem item) {
        return item instanceof Group;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemGroupBinding binding = ItemGroupBinding.inflate(inflater, parent, false);
        return new GroupViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, DelegateItem item) {
        ((GroupViewHolder) holder).bind((Group) item);
    }
}
