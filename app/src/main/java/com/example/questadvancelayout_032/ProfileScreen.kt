package com.example.questadvancelayout_032

// (SEMUA IMPORT BIARKAN SAJA, SUDAH BENAR)
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.baskara),
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )


            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.wa),
                    contentDescription = "WhatsApp",
                    modifier = Modifier.size(32.dp).padding(horizontal = 4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.spotify),
                    contentDescription = "Spotify",
                    modifier = Modifier.size(32.dp).padding(horizontal = 4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ig),
                    contentDescription = "Instagram",
                    modifier = Modifier.size(32.dp).padding(horizontal = 4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.tiktok),
                    contentDescription = "Tiktok",
                    modifier = Modifier.size(32.dp).padding(horizontal = 4.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Hindia",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "@Hindia",
                color = Color.Gray,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Album-Album Hindia",
                color = Color.White,
                fontSize = 16.sp
            )


            Spacer(modifier = Modifier.height(32.dp))
            MenuButton(
                text = "Privacy",
                icon = Icons.Default.Lock
            )
            Spacer(modifier = Modifier.height(16.dp))
            MenuButton(
                text = "Riwayat Transaksi",
                icon = Icons.Default.History
            )
            Spacer(modifier = Modifier.height(16.dp))
            MenuButton(
                text = "Pengaturan",
                icon = Icons.Default.Settings
            )
        }
    }
}


@Composable
fun MenuButton(text: String, icon: ImageVector) {
    Button(
        onClick = { /* TODO: Aksi tombol */ },
        shape = RoundedCornerShape(50.dp), // Bikin melengkung sempurna
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF3E3E3E) // Warna abu-abu tua
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp) // Beri jarak kiri-kanan
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = text,
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.weight(1f) // Trik agar ikon titik ke dorong ke kanan
            )
            Icon(
                imageVector = Icons.Default.Circle, // Ikon titik
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(8.dp)
            )
        }
    }
}