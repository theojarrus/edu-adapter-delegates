package ru.tinkoff.recyclerviewapp.user;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import ru.tinkoff.recyclerviewapp.recycler.AdapterDelegate;
import ru.tinkoff.recyclerviewapp.recycler.DelegateItem;
import ru.tinkoff.recyclerviewapp.databinding.ItemUserBinding;

public class UserAdapterDelegate implements AdapterDelegate {

    private UserItemClickListener userItemClickListener;

    public UserAdapterDelegate(UserItemClickListener userItemClickListener) {
        this.userItemClickListener = userItemClickListener;
    }

    @Override
    public boolean isOfViewType(DelegateItem item) {
        return item instanceof User;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemUserBinding binding = ItemUserBinding.inflate(inflater, parent, false);
        return new UserViewHolder(binding, userItemClickListener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, DelegateItem item) {
        ((UserViewHolder) holder).bind((User) item);
    }
}
