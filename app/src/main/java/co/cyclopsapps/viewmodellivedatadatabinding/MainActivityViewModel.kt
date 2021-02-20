package co.cyclopsapps.viewmodellivedatadatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Carlos Daniel Agudelo on 20/02/2021.
 */
class MainActivityViewModel: ViewModel() {
    val count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun updateAdd() {
        count.value = (count.value)?.plus(1)
    }
}