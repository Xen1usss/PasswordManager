package xen.passwordmanager.ui.createeditpassword

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CreateEditPasswordViewModel : ViewModel() {
    private val _siteAddress: MutableStateFlow<String?> = MutableStateFlow(null)
    val siteAddress = _siteAddress.asStateFlow()

    private val _password: MutableStateFlow<String?> = MutableStateFlow(null)
    val password = _password.asStateFlow()

    fun onSiteAddressEntered(siteAddress: String){
        viewModelScope.launch {
            _siteAddress.emit(siteAddress)
        }
    }

    fun onPasswordEntered(password: String){
        viewModelScope.launch {
            _password.emit(password)
        }
    }

    fun onSaveClick(){

    }
}