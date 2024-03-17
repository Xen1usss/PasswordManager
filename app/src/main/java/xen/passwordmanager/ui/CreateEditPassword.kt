package xen.passwordmanager.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import xen.passwordmanager.databinding.FragmentCreateEditPasswordBinding

class CreateEditPassword : Fragment() {

    private var _binding: FragmentCreateEditPasswordBinding? = null
    private val binding: FragmentCreateEditPasswordBinding
        get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCreateEditPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

}