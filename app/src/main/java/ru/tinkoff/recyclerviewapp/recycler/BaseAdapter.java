package ru.tinkoff.recyclerviewapp.recycler;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;

public class BaseAdapter extends ListAdapter<DelegateItem, ViewHolder> {

    private List<AdapterDelegate> delegates;

    public BaseAdapter(List<AdapterDelegate> delegates) {
        super(new DelegateItemCallback());
        this.delegates = delegates;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return delegates.get(viewType).onCreateViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        DelegateItem item = getItem(position);
        AdapterDelegate delegate = delegates.get(viewType);
        delegate.onBindViewHolder(holder, item);
    }

    @Override
    public int getItemViewType(int position) {
        DelegateItem item = getItem(position);
        for (int i = 0; i < delegates.size(); i++) {
            if (delegates.get(i).isOfViewType(item)) {
                return i;
            }
        }
        return -1;
    }
}
