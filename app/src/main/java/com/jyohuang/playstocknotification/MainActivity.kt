package com.jyohuang.playstocknotification

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.jyohuang.playstocknotification.presentation.login.LoginScreen
import com.jyohuang.playstocknotification.presentation.main.MainTabScaffold
import com.jyohuang.playstocknotification.ui.theme.PlaystocknotificationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlaystocknotificationTheme {
                AppRoot()
            }
        }
    }
}

/**
 * AppRoot : 透過判斷是否已經登入了 來決定要顯示 登入頁還是主畫面
 */
@Composable
fun AppRoot(){
    var isLoggedIn by rememberSaveable { mutableStateOf(false) }

    if(!isLoggedIn){
        LoginScreen(
            onLoginSuccess = {
                //先不做驗證
                isLoggedIn = true
            }
        )
    }else{
        MainTabScaffold()
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    PlaystocknotificationTheme {
        LoginScreen(
            onLoginSuccess = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    PlaystocknotificationTheme {
        MainTabScaffold(

        )
    }
}