package com.example.nis;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static android.content.Context.MODE_PRIVATE;

public class FragmentProfile extends Fragment {

    SharedPreferences sPref;
    TextView text;

    public static FragmentProfile newInstance(Bundle bundle) {
        FragmentProfile fragment = new FragmentProfile();
        fragment.setArguments(bundle);
        return fragment;
    }

    View view;
    private TextView textView;
    private String name;

    public FragmentProfile() {
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        name = args.getString("");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.profile_fragment,container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        textView = view.findViewById(R.id.counter);

        if (name != null) {
            textView.setText(name);
        }
    }



    public void showCounterValue(int counter) {
        textView.setText(String.valueOf(counter));
    }
}
