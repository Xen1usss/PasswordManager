package xen.passwordmanager.ui.createmasterpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import xen.passwordmanager.databinding.DialogCreateMasterPasswordBinding

class CreateMasterPasswordDialogFragment : DialogFragment() {

    var _binding: DialogCreateMasterPasswordBinding? = null
    val binding: DialogCreateMasterPasswordBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogCreateMasterPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}