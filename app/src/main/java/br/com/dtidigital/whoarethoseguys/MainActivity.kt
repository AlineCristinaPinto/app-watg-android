package br.com.dtidigital.whoarethoseguys

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.dtidigital.whoarethoseguys.adapter.RecycleViewAdapter
import br.com.dtidigital.whoarethoseguys.model.entities.Tribo
import br.com.dtidigital.whoarethoseguys.retrofit.RetrofitInitializer
import kotlinx.android.synthetic.main.activity_main_host.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_host)

        //callListaTribos()
        configuraListagemTribos()
    }

    /*private fun callListaTribos(){

        val call = RetrofitInitializer().triboService().listaTribos()

        call.enqueue(object : Callback<List<Tribo>?> {
            override fun onResponse(call: Call<List<Tribo>?>?,
                                    response: Response<List<Tribo>?>?) {
                response?.body()?.let {
                    val tribos: List<Tribo> = it
                    configuraListagemTribos(tribos)

                }
            }

            override fun onFailure(call: Call<List<Tribo>?>?, t: Throwable?) {
                Log.e("onFailure error", t?.message)
            }
        })
    }*/

    private fun configuraListagemTribos(){
        val recyclerView = recyclerViewTribo

        recyclerView.adapter = RecycleViewAdapter(tribos(), imagensTribos(), this)

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    private fun tribos() : List<Tribo>{
        return listOf(
                Tribo(  1,
                        0,
                        "Balboa",
                        false,
                        "" ),
                Tribo(  2,
                        0,
                        "Camaleões",
                        false,
                        "" ),
                Tribo(  3,
                        0,
                        "Coringas",
                        false,
                        "" ),
                Tribo(  4,
                        0,
                        "Dalminions",
                        false,
                        "" ),
                Tribo(  5,
                        0,
                        "Formigas",
                        false,
                        "" ),
                Tribo(  6,
                        0,
                        "GC",
                        false,
                        "" ),
                Tribo(  7,
                        0,
                        "Javalis",
                        false,
                        "" ),
                Tribo(  8,
                        0,
                        "Origami",
                        false,
                        "" ),
                Tribo(  9,
                        0,
                        "Rackers",
                        false,
                        "" ),
                Tribo(  10,
                        0,
                        "Rubix",
                        false,
                        "" ),
                Tribo(  11,
                        0,
                        "Triforce",
                        false,
                        "" ),
                Tribo(  12,
                        0,
                        "Unicórnios",
                        false,
                        "" )
        )
    }

    private fun imagensTribos() : List<String>{
        return listOf(
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6"
        )
    }
}
