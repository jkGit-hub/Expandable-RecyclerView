package com.jkapps.expandablerecyclerviewdemo;

import android.os.Parcel;
import android.os.Parcelable;

public class ChildData implements Parcelable{

    String name;

    public ChildData(Parcel parcel) { name = parcel.readString();}

    public ChildData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static final Creator<ChildData> CREATOR = new Creator<ChildData>() {
        @Override
        public ChildData createFromParcel(Parcel in) {
            return new ChildData(in);
        }

        @Override
        public ChildData[] newArray(int size) {
            return new ChildData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
         parcel.writeString(name);
    }
}
