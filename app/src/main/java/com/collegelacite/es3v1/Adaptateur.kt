package com.collegelacite.es3v1

import android.content.Context
import android.widget.ArrayAdapter

class Adaptateur(
    contexte: Context,
    etats: ArrayList<Etat>
) : ArrayAdapter<Etat>(contexte, R.layout.item_listview, R.id.textView, etats)
