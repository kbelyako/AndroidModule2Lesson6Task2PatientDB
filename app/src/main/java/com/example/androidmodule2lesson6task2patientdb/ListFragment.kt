package com.example.androidmodule2lesson6task2patientdb

import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment(),PatiensListCallBack {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
 /*   private val patients= arrayListOf<Patient>(
        Patient(
            BitmapFactory.decodeResource(resources,R.drawable.lion),"Peter","Jhons","Male","32","1. Complaints (at admission to the hospital)\n" +
                "\n" +
                "The main complaints: a sudden rise in body temperature up to 40 °C, stunning chills, headache, severe pain of stabbing character in the left chest, radiating to the epigastric region, aggravated by deep breathing and bending to a healthy side, constant during the day, cough with moderate amounts of rusty-colored, odorless sputum and the constant shortness of breath of a mixed nature.\n" +
                "\n" +
                "Secondary complaints: general weakness, loss of appetite.\n" +
                "\n" +
                "2. History of present illness\n" +
                "\n" +
                "Development of the disease the patient connects with a history of emotional stress - the death of his father, after which he drank alcohol for 3 days (from 14 to 16 February). On February 16, intoxicated patient fell asleep at a bus stop and got hypothermia. In 2 days (February 18 at 13.00), he had sudden rise of the body temperature to 40 °C, a terrific chills and severe headache developed. His wife said he had episodes of impaired consciousness (delirium). On February 19 the patient developed a dry, hacking cough, he was troubled by pain in the left side of chest while coughing and breathing (with a deep breath.). He took paracetamol and cough syrup without any improvement - the temperature remained until 40.2 °C, there was shortness of breath at rest, cough became productive, with rusty sputum, there appeared general weakness. February 20 (the third day of illness) ambulance was called and the patient was admitted to the therapeutic department of the hospital."),
        Patient(BitmapFactory.decodeResource(resources,R.drawable.lion),"Andrew","James","Male","32"," Past Psychiatric History\n" +
                "\n" +
                "\"Many psychiatric illnesses are recurrent or have an acute-on-chronic course, so that the link between the present illness and past psychiatric history may be strong. This is the rational for describing the past psychiatric history immediately after the present illness.\"\n" +
                "\n" +
                "Bloch and Singh (2001: 91)\n" +
                "\n" +
                "The following points are relevant in this section:\n" +
                "\n" +
                "    details of previous episodes of illness\n" +
                "    previous psychiatric admissions/treatment\n" +
                "    outpatient/community treatment\n" +
                "    suicide attempts/drug and alcohol abuse\n" +
                "    interval functioning (what is the patient like between episodes/when \"well')\n" +
                "\n" +
                "By including this sort of information, you will build a picture of the pattern of illness (chronicity, severity, coping strategies, crisis triggers, etc.), which will contribute toward a complete discussion of the illness."),
        Patient(BitmapFactory.decodeResource(resources,R.drawable.lion),"Michel","Barton","Male","32","1.4 Past Medical History\n" +
                "\n" +
                "In this section of the report, you need to show that you a) understand the relationship between medical conditions and psychiatric symptoms, and b) can appreciate the complexity of medical problems that might be exacerbated by psychiatric conditions.\n" +
                "\n" +
                "Record medications. Demonstrate an understanding of the significance of drug therapy on psychological function and, if appropriate, focus on medications taken by the patient that may influence the patient's psychological function.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "1.5 Family History\n" +
                "\n" +
                "Include details of:\n" +
                "\n" +
                "    Parents and siblings, nature of the relationships between family members\n" +
                "    Any family tensions and stresses and family models of coping\n" +
                "    Family history of psychiatric illness (incl. drug/alcohol abuse, suicide attempts)\n" +
                "\n" +
                "Include a geneogram (drawing of family tree).")

    ) */

       private val patients= arrayListOf<Patient>(
        Patient(BitmapFactory.decodeResource(resources,R.drawable.lion),
            "Peter","Jhons","Male","1. Complaints (at admission to the hospital)\n" +
                "\n" +
                "The main complaints: a sudden rise in body temperature up to 40 °C, stunning chills, headache, severe pain of stabbing character in the left chest, radiating to the epigastric region, aggravated by deep breathing and bending to a healthy side, constant during the day, cough with moderate amounts of rusty-colored, odorless sputum and the constant shortness of breath of a mixed nature.\n" +
                "\n" +
                "Secondary complaints: general weakness, loss of appetite.\n" +
                "\n" +
                "2. History of present illness\n" +
                "\n" +
                "Development of the disease the patient connects with a history of emotional stress - the death of his father, after which he drank alcohol for 3 days (from 14 to 16 February). On February 16, intoxicated patient fell asleep at a bus stop and got hypothermia. In 2 days (February 18 at 13.00), he had sudden rise of the body temperature to 40 °C, a terrific chills and severe headache developed. His wife said he had episodes of impaired consciousness (delirium). On February 19 the patient developed a dry, hacking cough, he was troubled by pain in the left side of chest while coughing and breathing (with a deep breath.). He took paracetamol and cough syrup without any improvement - the temperature remained until 40.2 °C, there was shortness of breath at rest, cough became productive, with rusty sputum, there appeared general weakness. February 20 (the third day of illness) ambulance was called and the patient was admitted to the therapeutic department of the hospital."),
        Patient(BitmapFactory.decodeResource(resources,R.drawable.smal_pic1),"Andrew","James","Male"," Past Psychiatric History\n" +
                "\n" +
                "\"Many psychiatric illnesses are recurrent or have an acute-on-chronic course, so that the link between the present illness and past psychiatric history may be strong. This is the rational for describing the past psychiatric history immediately after the present illness.\"\n" +
                "\n" +
                "Bloch and Singh (2001: 91)\n" +
                "\n" +
                "The following points are relevant in this section:\n" +
                "\n" +
                "    details of previous episodes of illness\n" +
                "    previous psychiatric admissions/treatment\n" +
                "    outpatient/community treatment\n" +
                "    suicide attempts/drug and alcohol abuse\n" +
                "    interval functioning (what is the patient like between episodes/when \"well')\n" +
                "\n" +
                "By including this sort of information, you will build a picture of the pattern of illness (chronicity, severity, coping strategies, crisis triggers, etc.), which will contribute toward a complete discussion of the illness."),
        Patient(BitmapFactory.decodeResource(resources,R.drawable.smal_pic5),"Michel","Barton","Male","1.4 Past Medical History\n" +
                "\n" +
                "In this section of the report, you need to show that you a) understand the relationship between medical conditions and psychiatric symptoms, and b) can appreciate the complexity of medical problems that might be exacerbated by psychiatric conditions.\n" +
                "\n" +
                "Record medications. Demonstrate an understanding of the significance of drug therapy on psychological function and, if appropriate, focus on medications taken by the patient that may influence the patient's psychological function.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "1.5 Family History\n" +
                "\n" +
                "Include details of:\n" +
                "\n" +
                "    Parents and siblings, nature of the relationships between family members\n" +
                "    Any family tensions and stresses and family models of coping\n" +
                "    Family history of psychiatric illness (incl. drug/alcohol abuse, suicide attempts)\n" +
                "\n" +
                "Include a geneogram (drawing of family tree).")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (context!=null){
         //  rvPatients.adapter=PatientAdapter(patients, context!!,this)
            rvPatients.adapter=PatientAdapter(patients, requireContext(),this)

            rvPatients.layoutManager=LinearLayoutManager(context)

        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onItemSelected(index: Int) {
        if (activity!=null){

            //activity!!.supportFragmentManager
            requireActivity().supportFragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.flDetails,DetailsFragment.newInstance(
                    patients[index].name,patients[index].lastName,patients[index].details))
                .commit()
        }

    }
}