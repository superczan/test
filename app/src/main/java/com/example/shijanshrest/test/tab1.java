package com.example.shijanshrest.test;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.example.shijanshrest.test.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class tab1 extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "1";


    EditText annuityCash;
    EditText annuityN;
    EditText annuityRate;
    TextView annuityAnswer;
    EditText annuityPV;
    EditText annuityFV;
    private TextView FVAnswer;
    private TextView PVAnswer;
    private TextView RAnswer,NAnswer,cfAnswer;


    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);
        annuityCash=(EditText) rootView.findViewById(R.id.annuityCash);
        annuityN=(EditText)rootView.findViewById(R.id.annuityN);
        annuityRate=(EditText)rootView.findViewById(R.id.annuityRate);
        annuityPV=(EditText)rootView.findViewById(R.id.annuityPV);
        annuityFV=(EditText)rootView.findViewById(R.id.annuityFV);
        RAnswer=(TextView)rootView.findViewById(R.id.rAnswer);
        NAnswer=(TextView)rootView.findViewById(R.id.nAnswer);
        FVAnswer=(TextView)rootView.findViewById(R.id.fvAnswer);
        PVAnswer=(TextView)rootView.findViewById(R.id.pvAnswer);
        Button btn=(Button)rootView.findViewById(R.id.calculate);
        btn.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {

                double c=Double.NaN;
                double n=Double.NaN;
                double r=Double.NaN;
                double fv=Double.NaN;
                double pv=Double.NaN;
                double answer=Double.NaN;

                try {
                    c = Double.parseDouble(annuityCash.getText().toString());
                }
                catch (NumberFormatException e) {
                    c=Double.NaN;
                }
                try {
                    n=Double.parseDouble(annuityN.getText().toString());

                }
                catch (NumberFormatException e) {
                    n=Double.NaN;
                }
                try {

                    r=Double.parseDouble(annuityRate.getText().toString());
                }
                catch (NumberFormatException e) {
                    r=Double.NaN;
                }

                try{
                    fv=Double.parseDouble(annuityFV.getText().toString());

                }
                catch (NumberFormatException e)
                {
                    fv=Double.NaN;
                }
                try{
                    pv=Double.parseDouble(annuityPV.getText().toString());


                }
                catch (NumberFormatException e)
                {
                    pv=Double.NaN;
                }

                if (!Double.isNaN(c) && !Double.isNaN(n) && !Double.isNaN(r)) {
                    fv = (1 + r) * c * ((Math.pow(1 + r, n) - 1) / r);
                    fv=Math.round(fv*10000)/100;

                    FVAnswer.setText( Double.toString(fv));
                    pv = c * ((1 - Math.pow(1 + r, -1 * n)) / r) * (1 + r);
                    pv=Math.round(pv*10000)/100;

                    PVAnswer.setText(Double.toString(pv));
                    NAnswer.setText(Double.toString(n));
                    RAnswer.setText(Double.toString(r));

                }
                else if (!Double.isNaN(c) && !Double.isNaN(n) && !Double.isNaN(fv))
                {

                }
                else if (!Double.isNaN(c) && !Double.isNaN(n) && !Double.isNaN(pv))
                {

                }
                else if (!Double.isNaN(n) && !Double.isNaN(r) && !Double.isNaN(pv))
                {

                }
                else if (!Double.isNaN(n) && !Double.isNaN(r) && !Double.isNaN(fv))
                {

                }
                else if (!Double.isNaN(c) && !Double.isNaN(r) && !Double.isNaN(pv))
                {

                }
                else if(!Double.isNaN(c) && !Double.isNaN(r) && !Double.isNaN(fv))
                {

                }

            }


        });
        return rootView;
    }


    public void calculate1(View view)
    {
    }

}