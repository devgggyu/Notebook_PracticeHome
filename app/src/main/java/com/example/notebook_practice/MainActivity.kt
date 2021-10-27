package com.example.notebook_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        문법 연습(조건문)

//        나이를 확인해서 -> 성인인지  /  아닌지
        val userage = 14

        if (userage >= 20) {

        Log.d("성인판별","성인이 맞습니다.")

        }

        else if (userage >= 17) {
          Log.d("성인판별","고등학생 입니다.")
        }

        else if (userage >= 14) {
            Log.d("성인판별","중학생 입니다.")
        }

        else {
            Log.d("성인판별","성인이 아닙니다.")
        }






//       문법 연습(변수)
        var myname = "강대규"// 변수 생성 + 대입=> 변수의 초기화

        myname = "Kdg"

        Log.d("변수값",myname)

        val num1 =10


        clickBtn.setOnClickListener {
            //주석 남기는 법
//             ctrl + / 커서가 있는 줄을 주석으로 남기는 방법
//            이{ }안 에 있는 코드만, 버튼이 눌렀을때 실행됨
            Log.d("메인화면로그","클릭용 버튼 눌림")
            Log.e("메인화면로그","에러 관련 로그")

        }
        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼이 눌렸어", Toast.LENGTH_SHORT).show()
        }
    }

}