package com.example.aluno.tabelas;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/*public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/

public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);

        //Criar o layout
        LinearLayout layout = new LinearLayout(this);
        layout.setPadding(10,10,10,10);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.setPadding(10,10,10,10);//pixels

        TextView nome = new TextView(this);
        nome.setText("Nome:");
        nome.setLayoutParams(new ActionBar.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(nome);
        setContentView(layout);
    }
}
