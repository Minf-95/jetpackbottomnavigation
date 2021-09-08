 package com.example.jetpackbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.jetpackbottomnavigation.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

    private lateinit var mbinding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) //ViewBinding을 해주었으므로 mbinding:ActivityMainBinding 이걸로 대체 가능

        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)

        //네비게이션들을 담는 호스트
        val navHostFrament = supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment

        //네비게이션 컨트롤러
        val navController = navHostFrament.navController

        //바텀 네비게이션 뷰 와 네비게에션을 묶어준다.
        NavigationUI.setupWithNavController(mbinding.myBottomNav,navController)

    }
}