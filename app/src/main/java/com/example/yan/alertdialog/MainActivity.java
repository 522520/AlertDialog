package com.example.yan.alertdialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customView();
    }
    public void customView(){
        TableLayout loginForm=(TableLayout)getLayoutInflater()
                .inflate(R.layout.login,null);
        AlertDialog dialog=new AlertDialog.Builder(this)
                .setTitle(R.string.AndroidApp)
                .setView(loginForm)
                .setNegativeButton(R.string.Cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //执行取消操作

                    }


                })
                .setPositiveButton(R.string.Signin, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //执行登录操作

                    }
                })
                .create();

                dialog.show();
        dialog.getButton(dialog.BUTTON_POSITIVE).setTextColor(Color.GRAY);
        dialog.getButton(dialog.BUTTON_NEGATIVE).setTextColor(Color.GRAY);

    }
}
