package edu.cs.birzeit.startedservice1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnActionOnClick(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("MESSAGE", "Data Example");
        startService(intent);
    }
}
