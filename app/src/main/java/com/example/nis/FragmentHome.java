package com.example.nis;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    View view;
    private RecyclerView myrecyclerView;
    private List<Home> lstPost;




    public FragmentHome() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.home_fragment, container, false);
        myrecyclerView = (RecyclerView) view.findViewById(R.id.home_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstPost);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstPost = new ArrayList<>();
        lstPost.add(new Home(R.drawable.aaa));
        lstPost.add(new Home(R.drawable.bbb));
        lstPost.add(new Home(R.drawable.ccc));
        lstPost.add(new Home(R.drawable.ddd));
        lstPost.add(new Home(R.drawable.eee));
        lstPost.add(new Home(R.drawable.fff));
        lstPost.add(new Home(R.drawable.ggg));
        lstPost.add(new Home(R.drawable.hhh));
        lstPost.add(new Home(R.drawable.iii));
        lstPost.add(new Home(R.drawable.aaa));
        lstPost.add(new Home(R.drawable.bbb));
        lstPost.add(new Home(R.drawable.ccc));
        lstPost.add(new Home(R.drawable.ddd));
        lstPost.add(new Home(R.drawable.eee));
        lstPost.add(new Home(R.drawable.fff));
        lstPost.add(new Home(R.drawable.ggg));
        lstPost.add(new Home(R.drawable.hhh));
        lstPost.add(new Home(R.drawable.iii));
    }


    public void counterResult(int counter) {

    }
}
