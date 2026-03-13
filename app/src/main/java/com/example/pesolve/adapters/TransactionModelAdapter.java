package com.example.pesolve.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pesolve.databinding.HistoryListLayoutBinding;
import com.example.pesolve.model.TransactionModel;

import java.util.ArrayList;

public class TransactionModelAdapter extends RecyclerView.Adapter<TransactionModelAdapter.ViewHolder> {

    public Context context;
    public ArrayList<TransactionModel> arrayList;

    public TransactionModelAdapter(Context context, ArrayList<TransactionModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        HistoryListLayoutBinding binding =
                HistoryListLayoutBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TransactionModel model = arrayList.get(position);

        holder.binding.category.setText(model.category);
        holder.binding.note.setText(model.note);
        holder.binding.date.setText(model.date);
        holder.binding.amount.setText("₱ " + model.amount);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        HistoryListLayoutBinding binding;

        public ViewHolder(HistoryListLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}