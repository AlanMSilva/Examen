package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (creamos unas variables constant que se requieren en el screen de resultado)
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "¿En que se usa la unidad sp?",
            "Para objetos tipo view",
            "Solo en texto",
            "Para view y texto",
            2
        )

        questionsList.add(que1)
        val que2 = Question(
            2, "¿Que es LinearLayout?",
            "Es una función",
            "Es un grupo de vistas",
            "Es un parametro",
            2
        )

        questionsList.add(que2)
        val que3 = Question(
            3, "Es una herramienta  que permite la automatización de compilación de código abierto:",
            "Bundle",
            "jdk",
            "Gradle",
            3
        )
        questionsList.add(que3)

        return questionsList
    }
}