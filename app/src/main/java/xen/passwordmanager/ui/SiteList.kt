package xen.passwordmanager.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import xen.passwordmanager.databinding.ListSiteBinding

class SiteList : Fragment() {

    private var _binding: ListSiteBinding? = null // почему var а не val?
    private val binding: ListSiteBinding
        get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ListSiteBinding.inflate(inflater, container, false)
        return binding.root
    }
}