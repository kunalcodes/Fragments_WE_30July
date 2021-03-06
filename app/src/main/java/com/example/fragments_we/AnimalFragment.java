package com.example.fragments_we;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animalList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void builList() {
        for (int i=0; i<100; i++){
            animalList.add(new Animal("Scruffy", R.drawable.dog));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        builList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }
}