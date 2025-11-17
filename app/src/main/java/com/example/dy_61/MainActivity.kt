package com.example.dy_61
import android.annotation.SuppressLint
import android.content.Intent
import android.widget.EditText
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userLogin: EditText = findViewById(R.id.user_login)
        val userPass: EditText = findViewById(R.id.user_password)
        val Button: Button = findViewById(R.id.button_auth)


        Button.setOnClickListener() {
            val login = userLogin.text.toString().trim()
            val pass = userPass.text.toString().trim()
            if (login == "" || pass == "")
                Toast.makeText(this, "не все поля заполнены", Toast.LENGTH_LONG).show()
            else {
                val db = DbHelper(this, null)
                val isauth = db.getUser(login, pass)
                if (isauth) {
                    Toast.makeText(this, "Пользователь $login вошёл", Toast.LENGTH_LONG).show()
                    userLogin.text.clear()
                    userPass.text.clear()
                    val intent = Intent(this, itemsActivity2::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Пользователь $login не авторизован", Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }
}