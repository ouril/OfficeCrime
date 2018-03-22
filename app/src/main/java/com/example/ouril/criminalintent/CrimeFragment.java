package com.example.ouril.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by ouril on 22.03.18.
 */

public class CrimeFragment extends Fragment {

    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }


}
