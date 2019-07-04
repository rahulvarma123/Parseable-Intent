package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {

    int stNum;
    String stName;
    int stMarks;

    public Student() { }

    protected Student(Parcel parcel) {
        stNum = parcel.readInt();
        stName = parcel.readString();
        stMarks = parcel.readInt();
    }

    public void setStNum(int stNum) {
        this.stNum = stNum;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public void setStMarks(int stMarks) {
        this.stMarks = stMarks;
    }

    public String getStName() {
        return stName;
    }

    public int getStMarks() {
        return stMarks;
    }

    public int getStNum() {
        return stNum;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeInt(stNum);
        parcel.writeString(stName);
        parcel.writeInt(stMarks);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
