package com.example.revampedvision;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class notf extends AppCompatActivity {
Button bt_not;
String chama;
    private NotificationChannel notificationChannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notf);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference("Dados");
        Dados dados = new Dados();


        // ------------------------------------------------ LEITURA ------------------------------------------------
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                try {
                    String  value = snapshot.child("Chama").getValue(String.class);

                    chama = value;


                } catch (Exception e) {

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(notf.this, error.toException().toString(), Toast.LENGTH_SHORT).show();

            }
        });


        if( chama=="alerta")
        {
            Toast.makeText(this,chama, Toast.LENGTH_SHORT).show();
            notif();
        }

    }
private void notif()
{
    NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    if(Build.VERSION.SDK_INT >= 26)
    {
        //When sdk version is larger than26
        String id = "channel_1";
        String description = "143";
        int importance = NotificationManager.IMPORTANCE_LOW;
        NotificationChannel channel = new NotificationChannel(id, description, importance);
//                     channel.enableLights(true);
//                     channel.enableVibration(true);//
        manager.createNotificationChannel(channel);
        Notification notification = new Notification.Builder(notf.this, id)
                .setCategory(Notification.CATEGORY_MESSAGE)
                .setSmallIcon(R.drawable.chama)
                .setContentTitle("Alerta:Revamped Vision")
                .setContentText("Foi detetado um pequeno incêndio")
                .setAutoCancel(true)
                .build();
        manager.notify(1, notification);
    }
    else
    {
        //When sdk version is less than26
        Notification notification = new NotificationCompat.Builder(notf.this)
                .setContentTitle("Alerta:Revamped Vision")
                .setContentText("Foi detetado um pequeno incêndio")
                .setSmallIcon(R.drawable.chama)
                .build();
        manager.notify(1,notification);
    }
}
}