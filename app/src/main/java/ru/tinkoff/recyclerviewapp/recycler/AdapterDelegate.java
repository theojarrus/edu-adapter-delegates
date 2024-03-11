package ru.tinkoff.recyclerviewapp.recycler;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public interface AdapterDelegate {

    boolean isOfViewType(DelegateItem item);

    ViewHolder onCreateViewHolder(ViewGroup parent);

    void onBindViewHolder(ViewHolder holder, DelegateItem item);
}
