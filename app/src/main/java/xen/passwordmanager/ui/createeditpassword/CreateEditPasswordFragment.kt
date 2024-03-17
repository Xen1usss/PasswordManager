package xen.passwordmanager.ui.createeditpassword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import xen.passwordmanager.databinding.FragmentCreateEditPasswordBinding

class CreateEditPasswordFragment : Fragment() {

    private var _binding: FragmentCreateEditPasswordBinding? = null
    private val binding: FragmentCreateEditPasswordBinding
        get() = _binding!!
    private val viewModel: CreateEditPasswordViewModel by inject()

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.siteAddressEditText.doAfterTextChanged {
            viewModel.onSiteAddressEntered(it.toString())
        }
        binding.passwordEditText.doAfterTextChanged {
            viewModel.onPasswordEntered(it.toString())
        }
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.siteAddress
                .combine(viewModel.password){ siteAddress, password ->
                    siteAddress.isNullOrEmpty().not() && password.isNullOrEmpty().not()
                }
                .flowWithLifecycle(viewLifecycleOwner.lifecycle, Lifecycle.State.STARTED)
                .collect { siteAddressAndPassswordNotEmpty ->
                    binding.bSave.isEnabled = siteAddressAndPassswordNotEmpty
                }
        }
    }


}