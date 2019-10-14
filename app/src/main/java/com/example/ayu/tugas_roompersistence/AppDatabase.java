package com.example.ayu.tugas_roompersistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.ayu.tugas_roompersistence.BarangDAO;
import com.example.ayu.tugas_roompersistence.Barang;
@Database(entities = {Barang.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}
