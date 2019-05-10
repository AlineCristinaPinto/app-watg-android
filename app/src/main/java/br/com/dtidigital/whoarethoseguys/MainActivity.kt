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

        callListaTribos()
    }

    private fun callListaTribos(){

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
    }

    private fun configuraListagemTribos(tribos : List<Tribo>){
        val recyclerView = recyclerViewTribo

        recyclerView.adapter = RecycleViewAdapter(tribos, imagensTribos(), this)

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }

    private fun imagensTribos() : List<String>{
        return listOf(
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6",
                "https://sites.google.com/site/narutoeremitafoda/_/rsrc/1270160638476/config/customLogo.gif?revision=6"
        )
    }

}
