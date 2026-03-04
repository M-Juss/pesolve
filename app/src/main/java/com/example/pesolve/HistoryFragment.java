package com.example.pesolve;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.pesolve.adapters.TransactionModelAdapter;
import com.example.pesolve.databinding.FragmentHistoryBinding;
import com.example.pesolve.model.TransactionModel;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {

    FragmentHistoryBinding binding;
    TransactionModelAdapter adapter;
    ArrayList<TransactionModel> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHistoryBinding.inflate(inflater, container, false);

        arrayList = new ArrayList<>();

        arrayList.add(new TransactionModel(1, "",
                "Shopping", "SM SuperMarket",
                "02-02-2026", 2000));

        arrayList.add(new TransactionModel(2, "",
                "Shopping", "SM SuperMarket",
                "02-02-2026", 1500));

        adapter = new TransactionModelAdapter(getContext(), arrayList);

        binding.recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext())
        );

        binding.recyclerView.setAdapter(adapter);

        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.arrayList = arrayList;
        adapter.notifyDataSetChanged();
    }
}