package com.example.flappybird;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class activity_BangXH extends AppCompatActivity {
    private ListView lvBangXH;
    private List<DiemXH> listDiemXH;
    private DiemXHAdapter diemXHAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bang_xh);
        addViews();
    }

    private void addViews() {
        lvBangXH = findViewById(R.id.listviewBangXH);
        DiemXHDAO diemXHDAO = new DiemXHDAO(this);
        DiemXH diemXH = new DiemXH();

        //Lay du lieu hien thi len listview
        listDiemXH = diemXHDAO.getDiemXH();
        diemXHAdapter = new DiemXHAdapter(activity_BangXH.this, R.layout.layout_item_diem, listDiemXH);
        lvBangXH.setAdapter(diemXHAdapter);

    }
}