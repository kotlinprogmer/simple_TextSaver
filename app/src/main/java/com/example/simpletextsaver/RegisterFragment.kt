package com.example.simpletextsaver

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.simpletextsaver.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {
   lateinit var binding: FragmentRegisterBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentRegisterBinding.inflate(layoutInflater , container ,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txtLogin.setOnClickListener {
            findNavController()
                .navigate(R.id.action_registerFragment_to_loginFragment)
        }

        binding.btnLogin.setOnClickListener {
            findNavController()
                .navigate(R.id.action_registerFragment_to_mainFragment)
        }

    }


}