package com.example.recyclerviewwithfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ListFragment extends Fragment {


    public ListFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_list, container, false);

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            students.add(new Student("rohit kumar"));
        }


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        StudentRecyclerAdapter adapter = new StudentRecyclerAdapter(getContext(), students );

        recyclerView.setAdapter(adapter);

        return view;
    }


}
