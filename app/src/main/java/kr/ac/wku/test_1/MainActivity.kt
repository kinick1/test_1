package kr.ac.wku.test_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.test_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnLogIn.setOnClickListener{

            val userID=binding.userID.text.toString()
            val userPassWord=binding.userPW.text.toString()

//            if (userID=="admin@test.com"){
//                if(userPassWord=="qwer"){
//                    Toast.makeText(this, "관리자 로그인입니다", Toast.LENGTH_SHORT).show()
//                }
//                else{
//                    Toast.makeText(this, "존재하지 않는 아이디 입니다.", Toast.LENGTH_SHORT).show()
//                }
//            }
//            else{
//                Toast.makeText(this, "존재하지 않는 아이디 입니다.", Toast.LENGTH_SHORT).show()
//            }

            if (userID == "admin@text.com" && userPassWord == "qwer") {
                Toast.makeText(this, "관리자 로그인입니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "잘못된 정보입니다.", Toast.LENGTH_SHORT).show()
            }

//            when(userID){
//                "admin@text.com"->{
//                    when(userPassWord){
//                        "qwer"->{
//                            Toast.makeText(this, "관리자 로그인입니다.", Toast.LENGTH_SHORT).show()
//                        }
//                        else->{
//                            Toast.makeText(this, "잘못된 정보입니다.", Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                }
//                else->{
//                    Toast.makeText(this, "잘못된 정보입니다.", Toast.LENGTH_SHORT).show()
//                }
//            }

        }


    }
}