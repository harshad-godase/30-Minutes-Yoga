package harshad.g30minutesyoga

import android.app.Application

class WorkOutApp:Application(){
    val db by lazy {
        HistoryDatabase.getInstance(this)
    }

}