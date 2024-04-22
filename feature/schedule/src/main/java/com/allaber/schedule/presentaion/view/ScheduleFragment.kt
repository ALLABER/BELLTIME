package com.allaber.schedule.presentaion.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.schedule.R
import com.allaber.schedule.databinding.FragmentScheduleBinding

class ScheduleFragment : Fragment(R.layout.fragment_schedule) {

    private val binding by viewBinding(
        FragmentScheduleBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
