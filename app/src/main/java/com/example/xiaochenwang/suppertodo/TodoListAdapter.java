package com.example.xiaochenwang.suppertodo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.xiaochenwang.suppertodo.models.Todo;

import java.util.List;

public class TodoListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Todo> todos;

    public TodoListAdapter(@NonNull List<Todo> todos) {

        this.todos = todos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View todoView = inflater.inflate(R.layout.main_list_item, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(todoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Todo todo = todos.get(position);
        TextView textView = holder.todoText;
        textView.setText(todo.text);

    }




    @Override
    public int getItemCount() {
        return todos.size();
    }



    @Override
    public long getItemId(int position) {
        return position;
    }


}
