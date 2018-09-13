package com.example.xiaochenwang.suppertodo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
   public TextView todoText;
   public ViewHolder(View itemView) {
      super(itemView);
      todoText = (TextView) itemView.findViewById(R.id.main_list_item_text);
   }

}
