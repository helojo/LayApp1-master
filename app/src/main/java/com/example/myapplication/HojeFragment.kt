package com.example.myapplication


import android.bluetooth.BluetoothAdapter
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.DataPointInterface
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.fragment_configuracao.*
import kotlinx.android.synthetic.main.fragment_hoje.*
import kotlinx.android.synthetic.main.fragment_hoje.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HojeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_hoje, container, false)
        dadosDoGrafico(view)

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        ScreenActivity.comunicacaoBT.SetTxtReceber(tempoUso)

    }

    fun dadosDoGrafico(view: View) {
        val graph = view.findViewById<GraphView>(R.id.GraphView)
        val series = LineGraphSeries(arrayOf(DataPoint(2.0, 7)))
        graph.addSeries(series)
    }

    private fun DataPoint(d: Double, i: Int): DataPointInterface? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
