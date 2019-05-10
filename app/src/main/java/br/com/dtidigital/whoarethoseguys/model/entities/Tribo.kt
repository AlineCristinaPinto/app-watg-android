package br.com.dtidigital.whoarethoseguys.model.entities

import com.google.gson.annotations.SerializedName

data class Tribo(@SerializedName("id") val codTribo: String,
                 val codTriboPai: String,
                 @SerializedName("nome") val nomeTribo: String) {

}