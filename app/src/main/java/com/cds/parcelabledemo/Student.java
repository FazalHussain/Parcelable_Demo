package com.cds.parcelabledemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fazal on 7/3/2017.
 */

public class Student implements Parcelable {
    int Id;
    String Name;
    String Age;

    public Student(int id, String name, String age) {
        Id = id;
        Name = name;
        Age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.Id);
        dest.writeString(this.Name);
        dest.writeString(this.Age);
    }

    protected Student(Parcel in) {
        this.Id = in.readInt();
        this.Name = in.readString();
        this.Age = in.readString();
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
