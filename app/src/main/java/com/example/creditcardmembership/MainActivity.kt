package com.example.creditcardmembership

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var member=ClassicMembership("Tarkan", "Duran", 35, 45673,5000)
        member.limitCalculator()
        var user = StudentMembership("Dorukhan" , "Yılmaz", 21, 46579 )
        user.limitCalculator()

        var silver= SilverMembership("Meltem","Akbor",33,726302, 2000,10)
        silver.limitCalculator()

        val familymembership:Array<ClassicMembership> = arrayOf(   //Make a call to the properties of a child through parent class.
                SilverMembership("Meltem","Akbor",33,726302, 2000, 10),
                StudentMembership("Rengin","Akbor",21,378463)
        )
        familymembership[2].limitCalculator()
    }


}