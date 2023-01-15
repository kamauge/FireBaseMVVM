package com.regera.firebasemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user : MutableMap<String,Any> = HashMap()
        user["first"] = "Bruce"
        user["last"] = "Wayne"
        user["born"] = 1994

        FirebaseFirestore.getInstance().collection("users")
            .add(user)
            .addOnSuccessListener { documentReference ->
                Log.d("TAG",documentReference.id)

            }
            .addOnFailureListener {
                 e -> Log.w("TAG","Error adding document",e)
            }


    }
}