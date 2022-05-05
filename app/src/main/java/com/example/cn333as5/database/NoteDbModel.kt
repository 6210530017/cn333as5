package com.example.cn333as5.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Pramote Siriparp", "0888888888",  1, 2,false),
            NoteDbModel(2, "Elon Musk", "0123456789",  2, 2,false),
            NoteDbModel(3, "Warren Buffett", "0987654321",  3, 2,false),
            NoteDbModel(4, "Yuranan Yuwadee", "0112358132", 4,2, false),
            NoteDbModel(5, "Itthiphon Ploypradab", "0112358132", 4,2, false),
        )
    }
}
