package com.project.foskin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.project.foskin.R
import java.util.Calendar

class HomeFragment : Fragment() {

    private lateinit var textUserName: TextView
    private lateinit var textGreeting: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize the views
        textUserName = view.findViewById(R.id.textUserName)
        textGreeting = view.findViewById(R.id.textGreeting)

        // Update the greeting text
        updateGreeting()

        return view
    }

    private fun updateGreeting() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)

        textGreeting.text = when (hour) {
            in 0..11 -> "Good Morning!"
            in 12..17 -> "Good Afternoon!"
            else -> "Good Evening!"
        }
    }
}
