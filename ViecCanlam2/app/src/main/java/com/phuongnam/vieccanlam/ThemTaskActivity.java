package com.phuongnam.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ThemTaskActivity extends AppCompatActivity {

    EditText edtName, edtDate, edtMessage;
    Button btnLuu;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);

        edtName = findViewById(R.id.edtName);
        edtDate = findViewById(R.id.edtDate);
        edtMessage = findViewById(R.id.edtMessage);
        btnLuu = findViewById(R.id.btnLuu);

        mDatabase = FirebaseDatabase.getInstance("https://vieccanlam-aa357-default-rtdb.firebaseio.com/").getReference("TASKS");

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String date = edtDate.getText().toString();
                String message = edtMessage.getText().toString();
                String priority = "1";

                if (name.isEmpty() || date.isEmpty()) {
                    Toast.makeText(ThemTaskActivity.this, "Vui lòng nhập tên và ngày!", Toast.LENGTH_SHORT).show();
                    return;
                }

                String id = mDatabase.push().getKey();
                TASKS task = new TASKS(name, date, message, priority);

                if (id != null) {
                    mDatabase.child(id).setValue(task).addOnCompleteListener(task1 -> {
                        if (task1.isSuccessful()) {
                            Toast.makeText(ThemTaskActivity.this, "Đã lưu!", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(ThemTaskActivity.this, "Lỗi!", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }
}