package com.example.xiaochenwang.suppertodo.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class Todo implements Parcelable{
    public String text;
    public Date remainDate;

    public Todo(String s, Date d) {
        text = s;
        remainDate = d;
    }
    public Todo(Parcel par) {
       text= par.readString();
        remainDate = new Date(par.readLong());
    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel source) {
            return new Todo(source);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[0];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(text);
        dest.writeLong(remainDate.getTime());
    }
}
