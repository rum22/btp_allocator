import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.btpallocator.viewmodel.ProfessorViewModel
import com.example.btpallocator.viewmodel.StudentViewModel

class ProfessorViewModelFactory constructor(private val context: Application) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ProfessorViewModel::class.java)) {
            ProfessorViewModel(context) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}