package com.example.erick_king.second_library;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mxn.soul.flowingdrawer_core.FlowingView;
import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;
import com.mxn.soul.flowingdrawer_core.MenuFragment;

import layout.MyMenuFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LeftDrawerLayout mLeftDrawerLayout = (LeftDrawerLayout) findViewById(R.id.id_drawerlayout);
            FragmentManager fm = getSupportFragmentManager();
            MyMenuFragment mMenuFragment = (MyMenuFragment) fm.findFragmentById(R.id.id_container_menu);
            FlowingView mFlowingView = (FlowingView) findViewById(R.id.sv);
            if (mMenuFragment == null) {
                fm.beginTransaction().add(R.id.id_container_menu, mMenuFragment = new MyMenuFragment()).commit();
            }
            mLeftDrawerLayout.setFluidView(mFlowingView);
            mLeftDrawerLayout.setMenuFragment(mMenuFragment);

        }
    }

