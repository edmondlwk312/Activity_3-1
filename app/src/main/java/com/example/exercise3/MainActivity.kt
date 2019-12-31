package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calc: Button = findViewById(R.id.buttonCalculate)
        calc.setOnClickListener{calculate()}
        val reset:Button = findViewById(R.id.buttonReset)
        reset.setOnClickListener{resetText()}
    }

    private fun calculate() {
        val age: Spinner= findViewById(R.id.spinnerAge)
        val ageString = age.selectedItem.toString()

        val genderID: Int=radioGroupGender.checkedRadioButtonId
        val gender: RadioButton=findViewById(genderID)
        val genderString = gender.text.toString()

        val smoker: CheckBox=findViewById(R.id.checkBoxSmoker)

        if(ageString == "Less than 17"){
            if(genderString == "Male" || genderString == "Female"){
                if(!smoker.isChecked || smoker.isChecked){
                    textViewPremium.text = "Insurance Premium :\nPrice: RM60\nTotal Payment: RM60\n"
                }
            }
        }
        else if (ageString=="17 to 25"){
            if(genderString=="Female"){
                if(smoker.isChecked) {
                    textViewPremium.text = "Insurance Premium :\nPrice: RM70\nExtra Payment for Smoker: RM 100\nTotal Payment: RM170\n"
                }
                else{
                    textViewPremium.text = "Insurance Premium :\nPrice: RM70\nTotal Payment: RM70\n"
                }
            }
            else{
                if(genderString=="Male"){
                    if(smoker.isChecked) {
                        textViewPremium.text = "Insurance Premium :\nPrice: RM70\nExtra Payment for Male: RM 50\nExtra Payment for Smoker: RM 100\nTotal Payment: RM220\n"
                    }
                    else{
                        textViewPremium.text = "Insurance Premium :\nPrice: RM70\nExtra Payment for Male: RM 50\nTotal Payment: RM120\n"
                    }
                }
            }
        }
        else if (ageString=="26 to 30"){
            if(genderString=="Female"){
                if(smoker.isChecked) {
                    textViewPremium.text = "Insurance Premium :\nPrice: RM90\nExtra Payment for Smoker: RM 150\nTotal Payment: RM240\n"
                }
                else{
                    textViewPremium.text = "Insurance Premium :\nPrice: RM90\nTotal Payment: RM90\n"
                }
            }
            else{
                if(genderString=="Male"){
                    if(smoker.isChecked) {
                        textViewPremium.text = "Insurance Premium :\nPrice: RM90\nExtra Payment for Male: RM 100\nExtra Payment for Smoker: RM 150\nTotal Payment: RM340\n"
                    }
                    else{
                        textViewPremium.text = "Insurance Premium :\nPrice: RM90\nExtra Payment for Male: RM 100\nTotal Payment: RM190\n"
                    }
                }
            }
        }
        else if (ageString=="31 to 40"){
            if(genderString=="Female"){
                if(smoker.isChecked) {
                    textViewPremium.text = "Insurance Premium :\nPrice: RM120\nExtra Payment for Smoker: RM 200\nTotal Payment: RM320\n"
                }
                else{
                    textViewPremium.text = "Insurance Premium :\nPrice: RM120\nTotal Payment: RM120\n"
                }
            }
            else{
                if(genderString=="Male"){
                    if(smoker.isChecked) {
                        textViewPremium.text = "Insurance Premium :\nPrice: RM120\nExtra Payment for Male: RM 150\nExtra Payment for Smoker: RM 200\nTotal Payment: RM470\n"
                    }
                    else{
                        textViewPremium.text = "Insurance Premium :\nPrice: RM120\nExtra Payment for Male: RM 150\nTotal Payment: RM270\n"
                    }
                }
            }
        }
        else if (ageString=="41 to 55"){
            if(genderString=="Female"){
                if(smoker.isChecked) {
                    textViewPremium.text = "Insurance Premium :\nPrice: RM150\nExtra Payment for Smoker: RM 250\nTotal Payment: RM400\n"
                }
                else{
                    textViewPremium.text = "Insurance Premium :\nPrice: RM150\nTotal Payment: RM150\n"
                }
            }
            else{
                if(genderString=="Male"){
                    if(smoker.isChecked) {
                        textViewPremium.text = "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nExtra Payment for Smoker: RM 250\nTotal Payment: RM600\n"
                    }
                    else{
                        textViewPremium.text = "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nTotal Payment: RM350\n"
                    }
                }
            }
        }
        else if (ageString=="More than 55"){
            if(genderString=="Female"){
                if(smoker.isChecked) {
                    textViewPremium.text = "Insurance Premium :\nPrice: RM150\nExtra Payment for Smoker: RM 300\nTotal Payment: RM450\n"
                }
                else{
                    textViewPremium.text = "Insurance Premium :\nPrice: RM150\nTotal Payment: RM150\n"
                }
            }
            else{
                if(genderString=="Male"){
                    if(smoker.isChecked) {
                        textViewPremium.text = "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nExtra Payment for Smoker: RM 300\nTotal Payment: RM650\n"
                    }
                    else{
                        textViewPremium.text = "Insurance Premium :\nPrice: RM150\nExtra Payment for Male: RM 200\nTotal Payment: RM350\n"
                    }
                }
            }
        }
    }
    private fun resetText() {
        spinnerAge.setSelection(0)
        radioGroupGender.clearCheck()
        checkBoxSmoker.isChecked=false
        textViewPremium.text="Insurance Premium :"
    }
}
