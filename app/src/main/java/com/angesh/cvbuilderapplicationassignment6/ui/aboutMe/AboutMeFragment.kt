package com.angesh.cvbuilderapplicationassignment6.ui.aboutMe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.angesh.cvbuilderapplicationassignment6.R
import com.angesh.cvbuilderapplicationassignment6.data.Certification
import com.angesh.cvbuilderapplicationassignment6.data.Education

class AboutMeFragment : Fragment(R.layout.fragment_about_me) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initEducation(view)
        initCertification(view)
    }

    private fun initEducation(view: View) {
        val educationRecyclerView = view.findViewById<RecyclerView>(R.id.education_recycler_view)
        val adapter = EducationAdapter(Education.getEducationList())
        educationRecyclerView.adapter = adapter
    }

    private fun initCertification(view: View) {
        val certificationRecycler = view.findViewById<RecyclerView>(R.id.certification_recycler_view)
        val adapter = CertificationAdapter(Certification.getCertificateList())
        certificationRecycler.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = AboutMeFragment()
    }
}