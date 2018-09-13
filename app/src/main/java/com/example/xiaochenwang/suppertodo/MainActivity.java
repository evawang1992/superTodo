package com.example.xiaochenwang.suppertodo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ListView;

import com.example.xiaochenwang.suppertodo.models.Todo;
import com.example.xiaochenwang.suppertodo.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.StaggeredGridLayoutManager.HORIZONTAL;
import static android.support.v7.widget.StaggeredGridLayoutManager.VERTICAL;

public class MainActivity extends AppCompatActivity {

    public List<Todo> todos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mockData();
        setUpUI(todos);
    }

    private void setUpUI (@NonNull List<Todo> todos) {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.main_list_view);
        recyclerView.setAdapter(new TodoListAdapter(todos));
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void mockData() {
        for (int i = 0; i < 50; i++) {
            Todo todo = new Todo(i + " buy milk", DateUtils.stringToDate("12/12/2018"));
            todos.add(todo);
        }
    }
}
