package com.example.tweetskeeper.database.color;

import java.lang.reflect.Field;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "color_table")
public class Color {

    @PrimaryKey (autoGenerate = true)
    @NonNull
    private int id;

    @ColumnInfo (name = "name")
    private String name;

    @ColumnInfo (name = "real_name")
    private String realName;

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public String getRealName () {
        return realName;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setRealName (String realName) {
        this.realName = realName;
    }

    public static int getId(String resourceName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resourceName);
            return idField.getInt(idField);
        } catch (Exception e) {
            throw new RuntimeException("No resource ID found for: "
                    + resourceName + " / " + c, e);
        }
    }

}
