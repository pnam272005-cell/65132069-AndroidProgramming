package com.phuongnam.baith13_thaydoifragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class FooterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_footer, container, false);

        Button b1 = view.findViewById(R.id.btn1);
        Button b2 = view.findViewById(R.id.btn2);
        Button b3 = view.findViewById(R.id.btn3);

        b1.setOnClickListener(v -> getParentFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView_Content, new Fragment1()).commit());
        b2.setOnClickListener(v -> getParentFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView_Content, new Fragment2()).commit());
        b3.setOnClickListener(v -> getParentFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView_Content, new Fragment3()).commit());

        return view;
    }
}