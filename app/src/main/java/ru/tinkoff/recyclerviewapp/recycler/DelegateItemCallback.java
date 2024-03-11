package ru.tinkoff.recyclerviewapp.recycler;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil.ItemCallback;

public class DelegateItemCallback extends ItemCallback<DelegateItem> {

    @Override
    public boolean areItemsTheSame(@NonNull DelegateItem oldItem, @NonNull DelegateItem newItem) {
        return oldItem.getId().equals(newItem.getId());
    }

    @Override
    public boolean areContentsTheSame(@NonNull DelegateItem oldItem, @NonNull DelegateItem newItem) {
        return oldItem.getContent().equals(newItem.getContent());
    }
}
