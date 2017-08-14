package com.anik.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jawnnypoo.physicslayout.Physics;
import com.jawnnypoo.physicslayout.PhysicsLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhysicsLinearLayout physicsLinearLayout=(PhysicsLinearLayout) findViewById(R.id.physic_layout);
        physicsLinearLayout.getPhysics().enableFling();
        physicsLinearLayout.getPhysics().setOnCollisionListener(new Physics.OnCollisionListener(){
            @Override
            public void onCollisionEntered(int viewIdA, int viewIdB) {
//                if(viewIdA==R.id.n && viewIdB==R.id.p)
//                    Toast.makeText(getBaseContext(),"NAZMUL colide with Pantho",Toast.LENGTH_SHORT).show();
//                if(viewIdA==R.id.n && viewIdB==R.id.r)
//                    Toast.makeText(getBaseContext(),"NAZMUL colide with RUHANUL",Toast.LENGTH_SHORT).show();
//                if(viewIdA==R.id.n && viewIdB==R.id.s)
//                    Toast.makeText(getBaseContext(),"NAZMUL colide with SHUHIT",Toast.LENGTH_SHORT).show();
//                if(viewIdA==R.id.p && viewIdB==R.id.s)
//                    Toast.makeText(getBaseContext(),"PANTHO colide with SHUHIT",Toast.LENGTH_SHORT).show();
//                if(viewIdA==R.id.p && viewIdB==R.id.r)
//                    Toast.makeText(getBaseContext(),"PANTHO colide with RUHANUL",Toast.LENGTH_SHORT).show();
//                if(viewIdA==R.id.r && viewIdB==R.id.s)
//                    Toast.makeText(getBaseContext(),"RUHANUL colide with SHUHIT",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCollisionExited(int viewIdA, int viewIdB) {

            }


        });


    }
}
