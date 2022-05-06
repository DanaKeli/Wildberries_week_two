package com.example.wildberries_week_two

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.wildberries_week_two.databinding.FragmentFirstBinding
import com.example.wildberries_week_two.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private lateinit var fm: FragmentManager

    override fun onAttach(context: Context) {
        super.onAttach(context)
        log("onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        fm = requireActivity().supportFragmentManager

        log("onCreateView")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        log("onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        binding.apply {
            btnBack.setOnClickListener {
                fm.beginTransaction().replace(R.id.main_container, FirstFragment()).commit()
            }
            btnShowDialog.setOnClickListener {
                showDialog()
            }
        }
        log("onStart")
    }

    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        log("onDestroyView")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        log("onDetach")
    }

    private fun log(methodName: String) {
        Log.i("Activity/Fragment lifecycle", "Second fragment: $methodName")
    }

    private fun showDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Пример диалога")
            .setPositiveButton("Ок") { dialog, _ ->
                dialog.cancel()
            }
            .show()
    }
}