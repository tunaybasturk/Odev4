package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonGitA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaAgecis)
        }

       binding.buttonGitX.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.sayfaXgecis)
       }

      val geriTusu = object : OnBackPressedCallback(true){
           override fun handleOnBackPressed() {
               isEnabled = false
               requireActivity().finish()
           }
       }

       requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)


        return binding.root
    }


}