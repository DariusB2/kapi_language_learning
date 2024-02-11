package com.isa.kapilanguagelearning.german.germanDate

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.isa.kapilanguagelearning.R
import kotlinx.android.synthetic.main.activity_german_date.*

class GermanDateActivity : AppCompatActivity (), View.OnClickListener
{
    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<GermanDateQuestion>? = null
    private var mCorrectAnswers: Int = 0
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_german_date)
        mQuestionsList = GermanDateConstants.getQuestions()

        setQuestion()

        text_view_option_one_german_date.setOnClickListener(this)
        text_view_option_two_german_date.setOnClickListener(this)
        text_view_option_three_german_date.setOnClickListener(this)
        text_view_option_four_german_date.setOnClickListener(this)

        // TODO(STEP 1: Adding a click event for submit button.)
        // START
        button_submit_german_date.setOnClickListener(this)
        // END
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Are you sure?")
        builder.setMessage("Do you want to exit the quiz?")
        builder.setPositiveButton("Yes") { _: DialogInterface, _: Int -> finish() }
        builder.setNegativeButton("No") { _: DialogInterface, _: Int -> }
        builder.show()
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.text_view_option_one_german_date -> {
                selectedOptionView(text_view_option_one_german_date, 1)
            }

            R.id.text_view_option_two_german_date -> {
                selectedOptionView(text_view_option_two_german_date, 2)
            }

            R.id.text_view_option_three_german_date -> {
                selectedOptionView(text_view_option_three_german_date, 3)
            }

            R.id.text_view_option_four_german_date -> {
                selectedOptionView(text_view_option_four_german_date, 4)
            }

            // TODO(STEP 2: Adding a click event for submit button. And change the questions and check the selected answers.)
            // START
            R.id.button_submit_german_date -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++
                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            val intent = Intent(this, GermanDateResultActivity::class.java)
                            intent.putExtra(GermanDateConstants.CORRECT_ANSWERS, mCorrectAnswers)
                            intent.putExtra(GermanDateConstants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    // This is to check if the answer is wrong
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    else{
                        mCorrectAnswers++
                    }
                    // This is for correct answer
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                    if (mCurrentPosition == mQuestionsList!!.size) {
                        button_submit_german_date.text = "FINISH"
                    } else {
                        button_submit_german_date.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        val question =
            mQuestionsList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.
        defaultOptionsView()
        // TODO (STEP 6: Check here if the position of question is last then change the text of the button.)
        // START
        if (mCurrentPosition == mQuestionsList!!.size) {
            button_submit_german_date.text = "FINISH"
        } else {
            button_submit_german_date.text = "SUBMIT"
        }
        // END
        progress_bar_german_date.progress = mCurrentPosition
        text_view_progress_german_date.text = "$mCurrentPosition" + "/" + progress_bar_german_date.max
        text_view_german_date_question.text = question.question
        image_view_german_date_question.setImageResource(question.image)
        text_view_option_one_german_date.text = question.optionOne
        text_view_option_two_german_date.text = question.optionTwo
        text_view_option_three_german_date.text = question.optionThree
        text_view_option_four_german_date.text = question.optionFour
    }
    /**
     * A function to set the view of selected option view.
     */
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    /**
     * A function to set default options view when the new question is loaded or when the answer is reselected.
     */
    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, text_view_option_one_german_date)
        options.add(1, text_view_option_two_german_date)
        options.add(2, text_view_option_three_german_date)
        options.add(3, text_view_option_four_german_date)
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@GermanDateActivity,
                R.drawable.gradient_background_green
            )
        }
    }

    // TODO (STEP 3: Create a function for answer view.)
    // START
    /**
     * A function for answer view which is used to highlight the answer is wrong or right.
     */
    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                text_view_option_one_german_date.background = ContextCompat.getDrawable(
                    this@GermanDateActivity,
                    drawableView
                )
            }
            2 -> {
                text_view_option_two_german_date.background = ContextCompat.getDrawable(
                    this@GermanDateActivity,
                    drawableView
                )
            }
            3 -> {
                text_view_option_three_german_date.background = ContextCompat.getDrawable(
                    this@GermanDateActivity,
                    drawableView
                )
            }
            4 -> {
                text_view_option_four_german_date.background = ContextCompat.getDrawable(
                    this@GermanDateActivity,
                    drawableView
                )
            }
        }
    }
}