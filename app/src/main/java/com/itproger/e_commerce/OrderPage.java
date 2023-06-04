package com.itproger.e_commerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.itproger.e_commerce.model.Course;
import com.itproger.e_commerce.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);


        ListView orders_list = findViewById(R.id.orders_list);

        List<String> courseTitle = new ArrayList<>();
        for(Course c: MainActivity.fullCoursesList){
            if (Order.items_id.contains(c.getId()))
                courseTitle.add(c.getTitle());
        }

        orders_list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Order.items_id.toArray()));
    }
}