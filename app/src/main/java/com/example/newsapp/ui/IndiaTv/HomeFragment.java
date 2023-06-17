package com.example.newsapp.ui.IndiaTv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.newsapp.R;
import com.example.newsapp.databinding.FragmentHomeBinding;

import java.time.Duration;

public class HomeFragment extends Fragment {

    //private FragmentHomeBinding binding;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(fragment this).get(HomeViewModel.class);

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        WebView webView = root.findViewById(R.id.webview);
        webView.loadUrl("https://www.indiatvnews.com/");


        return root;
    }


}