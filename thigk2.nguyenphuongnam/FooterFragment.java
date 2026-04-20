package com.phuongnam.thigk2nguyenphuongnam;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class FooterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_footer, container, false);
        Button b1 = v.findViewById(R.id.btn1);
        Button b2 = v.findViewById(R.id.btn2);
        Button b3 = v.findViewById(R.id.btn3);
        Button b4 = v.findViewById(R.id.btn4);

        b1.setOnClickListener(view -> switchFrag(new Fragment1()));
        b2.setOnClickListener(view -> switchFrag(new Fragment2()));
        b3.setOnClickListener(view -> switchFrag(new Fragment3()));
        b4.setOnClickListener(view -> switchFrag(new Fragment4()));
        return v;
    }
    private void switchFrag(Fragment f) {
        getParentFragmentManager().beginTransaction().replace(R.id.fragmentContainerView_Content, f).commit();
    }
}