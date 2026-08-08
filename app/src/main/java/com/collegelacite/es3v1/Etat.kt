package com.collegelacite.es3v1

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView

class Etat(
    val nom: String,
    val code: String,
    val capitale: String,
    val superficie: Int,
    val union: String,
    val wikiUrl: String
) {
    // Accesseur de l'attribut drawable
    fun getDrawable(): String {
        return code
    }

    // Retourne une chaîne décrivant brièvement l'état
    override fun toString(): String {
        return nom
    }

    // Fonction permettant d'insérer l'image du drapeau dans un
    // ImageView fourni. L'image doit être dans res/drawable.
    fun intoImageView(iv: ImageView, contexte: Context) {
        val uri = "@drawable/" + this.getDrawable()
        val imageResource: Int =
            contexte.getResources().getIdentifier(uri, null, contexte.getPackageName())
        val res: Drawable? = contexte.getDrawable(imageResource)
        iv.setImageDrawable(res)
    }

    companion object {
        val USA: ArrayList<Etat>
            get() {
                var etats = ArrayList<Etat>()

                etats.add(Etat("Alaska", "ak", "Juneau", 1723337, "3 janvier 1959", "https://fr.wikipedia.org/wiki/Alaska"))
                etats.add(Etat("Alabama", "al", "Montgomery", 135767, "4 décembre 1819", "https://fr.wikipedia.org/wiki/Alabama"))
                etats.add(Etat("Arkansas", "ar", "Little Rock", 137732, "15 juin 1836", "https://fr.wikipedia.org/wiki/Arkansas"))
                etats.add(Etat("Arizona", "az", "Phoenix", 295234, "14 février 1912", "https://fr.wikipedia.org/wiki/Arizona"))
                etats.add(Etat("Californie", "ca", "Sacramento", 423972, "9 septembre 1850", "https://fr.wikipedia.org/wiki/Californie"))
                etats.add(Etat("Colorado", "co", "Denver", 269601, "1 août 1876", "https://fr.wikipedia.org/wiki/Colorado"))
                etats.add(Etat("Connecticut", "ct", "Hartford", 14357, "9 janvier 1788", "https://fr.wikipedia.org/wiki/Connecticut"))
                etats.add(Etat("Delaware", "de", "Dover", 6446, "7 décembre 1787", "https://fr.wikipedia.org/wiki/Delaware"))
                etats.add(Etat("Floride", "fl", "Tallahassee", 170312, "3 mars 1845", "https://fr.wikipedia.org/wiki/Floride"))
                etats.add(Etat("Géorgie", "ga", "Atlanta", 153910, "2 janvier 1788", "https://fr.wikipedia.org/wiki/Géorgie_(États-Unis)"))
                etats.add(Etat("Hawaï", "hi", "Honolulu", 28313, "21 août 1959", "https://fr.wikipedia.org/wiki/Hawaï"))
                etats.add(Etat("Iowa", "ia", "Des Moines", 145746, "28 décembre 1846", "https://fr.wikipedia.org/wiki/Iowa"))
                etats.add(Etat("Idaho", "id", "Boise", 216443, "3 juillet 1890", "https://fr.wikipedia.org/wiki/Idaho"))
                etats.add(Etat("Illinois", "il", "Springfield", 149995, "3 décembre 1818", "https://fr.wikipedia.org/wiki/Illinois"))
                etats.add(Etat("Indiana", "in", "Indianapolis", 94326, "11 décembre 1816", "https://fr.wikipedia.org/wiki/Indiana"))
                etats.add(Etat("Kansas", "ks", "Topeka", 213100, "29 janvier 1861", "https://fr.wikipedia.org/wiki/Kansas"))
                etats.add(Etat("Kentucky", "ky", "Frankfort", 104656, "1 juin 1792", "https://fr.wikipedia.org/wiki/Kentucky"))
                etats.add(Etat("Louisiane", "la", "Baton Rouge", 135659, "30 avril 1812", "https://fr.wikipedia.org/wiki/Louisiane"))
                etats.add(Etat("Massachusetts", "ma", "Boston", 27336, "6 février 1788", "https://fr.wikipedia.org/wiki/Massachusetts"))
                etats.add(Etat("Maryland", "md", "Annapolis", 32131, "28 avril 1788", "https://fr.wikipedia.org/wiki/Massachusetts"))
                etats.add(Etat("Maine", "me", "Augusta", 91633, "15 mars 1820", "https://fr.wikipedia.org/wiki/Maine_(États-Unis)"))
                etats.add(Etat("Michigan", "mi", "Lansing", 250487, "26 janvier 1837", "https://fr.wikipedia.org/wiki/Michigan"))
                etats.add(Etat("Minnesota", "mn", "Saint Paul", 225163, "11 mai 1858", "https://fr.wikipedia.org/wiki/Minnesota"))
                etats.add(Etat("Minnesota", "mo", "Jefferson City", 180540, "10 août 1821", "https://fr.wikipedia.org/wiki/Minnesota"))
                etats.add(Etat("Mississippi", "ms", "Jackson", 125438, "10 décembre 1817", "https://fr.wikipedia.org/wiki/Mississippi_(État)"))
                etats.add(Etat("Montana", "mt", "Helena", 380831, "8 novembre 1889", "https://fr.wikipedia.org/wiki/Montana"))
                etats.add(Etat("Caroline du Nord", "nc", "Raleigh", 139391, "21 novembre 1789", "https://fr.wikipedia.org/wiki/Caroline_du_Nord"))
                etats.add(Etat("Dakota du Nord", "nd", "Bismarck", 183108, "2 novembre 1889", "https://fr.wikipedia.org/wiki/Dakota_du_Nord"))
                etats.add(Etat("Nebraska", "ne", "Lincoln", 200330, "1 mars 1867", "https://fr.wikipedia.org/wiki/Nebraska"))
                etats.add(Etat("New Hampshire", "nh", "Concord", 24214, "21 juin 1788", "https://fr.wikipedia.org/wiki/New_Hampshire"))
                etats.add(Etat("New Jersey", "nj", "Trenton", 22591, "18 décembre 1787", "https://fr.wikipedia.org/wiki/New_Jersey"))
                etats.add(Etat("Nouveau-Mexique", "nm", "SantaFe", 314917, "6 janvier 1912", "https://fr.wikipedia.org/wiki/Nouveau-Mexique"))
                etats.add(Etat("Nevada", "nv", "Carson City", 286380, "31 octobre 1864", "https://fr.wikipedia.org/wiki/Nevada"))
                etats.add(Etat("New York", "ny", "Albany", 141297, "26 juillet 1788", "https://fr.wikipedia.org/wiki/État_de_New_York"))
                etats.add(Etat("Ohio", "oh", "Columbus", 116098, "1 mars 1803", "https://fr.wikipedia.org/wiki/Ohio"))
                etats.add(Etat("Oklahoma", "ok", "Oklahoma City", 181037, "16 novembre 1907", "https://fr.wikipedia.org/wiki/Oklahoma"))
                etats.add(Etat("Oregon", "or", "Salem", 254799, "14 février 1859", "https://fr.wikipedia.org/wiki/Oregon"))
                etats.add(Etat("Pennsylvanie", "pa", "Harrisburg", 119280, "12 décembre 1787", "https://fr.wikipedia.org/wiki/Pennsylvanie"))
                etats.add(Etat("Rhode Island", "ri", "Providence", 4001, "29 mai 1790", "https://fr.wikipedia.org/wiki/Rhode_Island"))
                etats.add(Etat("Caroline du Sud", "sc", "Columbia", 82933, "23 mai 1788", "https://fr.wikipedia.org/wiki/Caroline_du_Sud"))
                etats.add(Etat("Dakota du Sud", "sd", "Pierre", 199729, "2 novembre 1889", "https://fr.wikipedia.org/wiki/Dakota_du_Sud"))
                etats.add(Etat("Tennessee", "tn", "Nashville", 109153, "1 juin 1796", "https://fr.wikipedia.org/wiki/Tennessee"))
                etats.add(Etat("Texas", "tx", "Austin", 695662, "29 décembre 1845", "https://fr.wikipedia.org/wiki/Texas"))
                etats.add(Etat("Utah", "ut", "Salt Lake City", 219882, "4 janvier 1896", "https://fr.wikipedia.org/wiki/Utah"))
                etats.add(Etat("Virginie", "va", "Richmond", 110787, "25 juin 1788", "https://fr.wikipedia.org/wiki/Virginie_(États-Unis)"))
                etats.add(Etat("Vermont", "vt", "Montpelier", 24906, "4 mars 1791", "https://fr.wikipedia.org/wiki/Vermont"))
                etats.add(Etat("Washington", "wa", "Olympia", 184661, "11 novembre 1889", "https://fr.wikipedia.org/wiki/Washington_(État)"))
                etats.add(Etat("Wisconsin", "wi", "Madison", 169635, "29 mai 1848", "https://fr.wikipedia.org/wiki/Wisconsin"))
                etats.add(Etat("Virginie Occidentale", "wv", "Charleston", 62756, "20 juin 1863", "https://fr.wikipedia.org/wiki/Virginie-Occidentale"))
                etats.add(Etat("Wyoming", "wy", "Cheyenne", 253335, "10 juillet 1890", "https://fr.wikipedia.org/wiki/Wyoming"))

                return etats
            }
    }
}

