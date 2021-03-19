package co.cyclopsapps.viewmodellivedatadatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Carlos Daniel Agudelo on 20/02/2021.
 */
class MainActivityViewModel: ViewModel() {
    val _count = MutableLiveData<Int>()
    val count: LiveData<Int> = _count

    init {
        _count.value = 0
    }

    fun updateAdd() {
        _count.value = (count.value)?.plus(1)
    }
}