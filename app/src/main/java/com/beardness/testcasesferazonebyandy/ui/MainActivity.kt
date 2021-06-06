package com.beardness.testcasesferazonebyandy.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.beardness.testcasesferazonebyandy.R
import com.beardness.testcasesferazonebyandy.models.User

class MainActivity : AppCompatActivity() {

    lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.users)

        val userList: ArrayList<User> = ArrayList()

        userList.add(User("Stan", 10)) // < 18
        userList.add(User("Andy", 27))

        userList.add(User("Kyle", 11)) // < 18
        userList.add(User("Bash", 22))

        userList.add(User("Kenny", 9)) // < 18
        userList.add(User("Ivan", 22))

        userList.add(User("Cartman", 10)) // < 18
        userList.add(User("Misha", 46))

        val filteredUsers: ArrayList<User> = ArrayList(
                userList.asSequence()
                    .filter { it.age >= 18 }
                    .toList()
        )

        mTextView.text = filteredUsers.joinToString(separator = "\n")

    }
}