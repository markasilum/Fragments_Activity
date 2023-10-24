package com.example.fragments_activity.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fragments_activity.InputActivity
import com.example.fragments_activity.Play
import com.example.fragments_activity.QPIcalc
import com.example.fragments_activity.R
import com.example.fragments_activity.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val btnInput: Button
        btnInput = root.findViewById(R.id.btInput)
        btnInput.setOnClickListener{

            val inputScreen: Intent
            inputScreen = Intent(activity, InputActivity::class.java)
            startActivity(inputScreen)

            Log.d("aaa","input button clicked")

        }
        val btnQpi: Button
        btnQpi = root.findViewById(R.id.btQpiCalc)
        btnQpi.setOnClickListener{

            val qpiCalcScreen: Intent
            qpiCalcScreen = Intent(activity, QPIcalc::class.java)
            startActivity(qpiCalcScreen)
            Log.d("aaa","qpi button clicked")

        }
        val btnAct7: Button
        btnAct7 = root.findViewById(R.id.btAct7)
        btnAct7.setOnClickListener{
            val act7Screen: Intent
            act7Screen = Intent(activity, Play::class.java)
            startActivity(act7Screen)
            Log.d("aaa","act 7 button clicked")

        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}