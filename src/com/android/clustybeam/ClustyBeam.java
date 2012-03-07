package com.android.clustybeam;

import android.app.Activity;
import android.os.Bundle;

public class ClustyBeam extends Activity {

    private ClustyBeamView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new ClustyBeamView(this);
        setContentView(mView);
    }
}
