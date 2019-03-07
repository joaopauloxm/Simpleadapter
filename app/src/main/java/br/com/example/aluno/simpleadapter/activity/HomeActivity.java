package br.com.example.aluno.simpleadapter.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.example.aluno.simpleadapter.ArrayAdapter;
import br.com.example.aluno.simpleadapter.R;
import br.com.example.aluno.simpleadapter.simpleadapter;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void simpleadapter(View view) {
        startActivity(new Intent(this,simpleadapter.class));
    }

    public void Arrayadapter(View view) {
        startActivity(new Intent(this,ArrayAdapter.class));
    }
}
