package ru.tinkoff.recyclerviewapp.group;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import ru.tinkoff.recyclerviewapp.databinding.ItemGroupBinding;

public class GroupViewHolder extends ViewHolder {

    private ItemGroupBinding binding;

    public GroupViewHolder(ItemGroupBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Group item) {
        // Set text data
        binding.name.setText(item.getName());
    }
}
