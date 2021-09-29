package com.laioffer.tinnews.ui.details;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.laioffer.tinnews.R;
import com.laioffer.tinnews.databinding.FragmentDetailsBinding;
import com.laioffer.tinnews.databinding.FragmentHomeBinding;


public class DetailsFragment extends Fragment {
    private FragmentDetailsBinding binding;
//1.do view
    //2. view binding
    //3. create mvvm or not, where data is coming from;since date is from save, and is with every
    // everything, url primary key
    //4.linkage with other fragment

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false);
               return binding.getRoot();

        //return inflater.inflate(R.layout.fragment_details, container, false);
    }
}