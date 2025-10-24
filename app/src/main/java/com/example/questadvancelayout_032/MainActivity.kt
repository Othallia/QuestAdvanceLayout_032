package com.example.questadvancelayout_032

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.questadvancelayout_032.ui.theme.QuestAdvanceLayout_032Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestAdvanceLayout_032Theme {
                // Kita pakai Surface aja, gak perlu Scaffold
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background // Latar belakang default
                ) {
                    // Panggil ProfileScreen di sini
                    ProfileScreen()
                }
            }
        }
    }
}