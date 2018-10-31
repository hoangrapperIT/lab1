package com.example.admin.lab1;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class LabService extends Service {
    public LabService() {
    }
    public void onStart(Intent intent,int StartID){
        Toast.makeText(this,"new Service was Started",Toast.LENGTH_LONG).show();
        Bundle b = intent.getBundleExtra("student");//lấy bunld từ intent
        int StuID =b.getInt("StuID");
        String StuName = b.getString("StuName");
        String Class = b.getString("Class");
        String content ="Thêm sinh viên thành công:  .\n Thông tin sinh viên: .\n Sinh viên: " +StuID+""+StuName;
        content +=".\n Lớp" +Class;
        Toast.makeText(this,content,Toast.LENGTH_LONG).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
