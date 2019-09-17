package com.example.nva_cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnDangNhap;
    private CheckBox checkBoxLuuThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDangNhap=findViewById(R.id.btnDangNhap);
        checkBoxLuuThongTin=findViewById(R.id.checkBoxLuuThongTin);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBoxLuuThongTin.isChecked()==true){
                    Toast.makeText(getApplicationContext(),"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
