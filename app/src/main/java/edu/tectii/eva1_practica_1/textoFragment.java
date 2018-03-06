package edu.tectii.eva1_practica_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class textoFragment extends Fragment {
    View view;
    TextView txt;
    public textoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_texto, container, false);
        txt = view.findViewById(R.id.txt);
        txt.setText(textolargo.DIALOGUE[0]);
        return view;
    }

}
