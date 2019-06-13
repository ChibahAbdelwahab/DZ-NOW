package com.example.delllatitude5490.projet_tdm

import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import java.io.Serializable

class Article(var category: String, var title: String,var  date: String, var content: String,var saved: String, var imageView: Int) :Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(category)
        parcel.writeString(title)
        parcel.writeString(date)
        parcel.writeString(content)
        parcel.writeString(saved)
        parcel.writeInt(imageView)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Article> {
        override fun createFromParcel(parcel: Parcel): Article {
            return Article(parcel)
        }

        override fun newArray(size: Int): Array<Article?> {
            return arrayOfNulls(size)
        }
    }
}