package com.example.admin.lab1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {
        Log.d("ServiceStarted","Đã vào hàm onCrate");
        Toast.makeText(this, "Service đã được khởi tạo", Toast.LENGTH_SHORT).show();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d("ServiceTest","Đã vào hàm onDestroy");
        Toast.makeText(this, "Service đã được khởi tạo", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("ServiceTest","Đã vào hàm onStartCommand");
        Toast.makeText(this, "Service đã được khởi tạo", Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
