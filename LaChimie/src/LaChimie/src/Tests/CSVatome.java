package Tests;

import java.io.BufferedWriter;
import java.io.FileWriter;



public class CSVatome {
	public final static String SEPARATOR = ";";
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter (new FileWriter("tableauPeriodique.csv"));
			bw.write("# nom" + SEPARATOR + "num_atomique" + SEPARATOR+ "masse_atomique" + SEPARATOR + "sym_chimique" + SEPARATOR + "famille");
			bw.newLine();
			
			bw.write("hydrog�ne" + SEPARATOR + "1" + SEPARATOR + "1.00794" + SEPARATOR + "H" + SEPARATOR + "non-m�teaux");
			bw.newLine();
			
			bw.write("h�lium" + SEPARATOR + "2" + SEPARATOR + "4.002602" + SEPARATOR + "He" + SEPARATOR + "gaz nobles");
			bw.newLine();
			
			bw.write("lithium" + SEPARATOR + "3" + SEPARATOR + "6.941" + SEPARATOR +"Li" + SEPARATOR + "alcalins");
			bw.newLine();
			
			bw.write("b�ryllium" + SEPARATOR + "4" + SEPARATOR + "9.012182" + SEPARATOR + "Be" + SEPARATOR + "alcalino-terreux");
			bw.newLine();
			
			bw.write("bore" + SEPARATOR + "5" + SEPARATOR + "10.811" + SEPARATOR + "B" + SEPARATOR + "m�tallo�des");
			bw.newLine();
			
			bw.write("carbone" + SEPARATOR + "6" + SEPARATOR + "12.011" + SEPARATOR + "C" + SEPARATOR + "non-m�teaux");
			bw.newLine();
			
			bw.write("azote" + SEPARATOR + "7" + SEPARATOR + "14.00674" + SEPARATOR + "N" + SEPARATOR + "non-m�teaux" );
			bw.newLine();
			
			bw.write("oxyg�ne" + SEPARATOR + "8" + SEPARATOR + "15.9994" + SEPARATOR + "O" + SEPARATOR + "non-m�teaux");
			bw.newLine();
			
			bw.write("fluor" + SEPARATOR + "9" + SEPARATOR + "18.9984032" + SEPARATOR + "F"  + SEPARATOR + "halog�nes");
			bw.newLine();
			
			bw.write("n�on" + SEPARATOR + "10" + SEPARATOR + "20.1797" + SEPARATOR + "Ne" + SEPARATOR + "gaz nobles");
			bw.newLine();
			
			bw.write("sodium" + SEPARATOR + "11" + SEPARATOR + "22.989768" + SEPARATOR + "Na" + SEPARATOR + "alcalins");
			bw.newLine();
			
			bw.write("magn�sium" + SEPARATOR + "12" + SEPARATOR + "24.305" + SEPARATOR + "Mg" + SEPARATOR + "alcalino-terreux");
			bw.newLine();
			
			bw.write("aluminium" + SEPARATOR + "13" + SEPARATOR + "26.981539" + SEPARATOR + "Al" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("silicium" + SEPARATOR + "14" + SEPARATOR + "28.0855" + SEPARATOR + "Si" + SEPARATOR + "m�tallo�des");
			bw.newLine();
			
			bw.write("phosphore" + SEPARATOR + "15" + SEPARATOR + "30.973762" + SEPARATOR + "P" + SEPARATOR + "non-m�teaux");
			bw.newLine();
			
			bw.write("soufre" + SEPARATOR + "16" + SEPARATOR + "32.066" + SEPARATOR + "S" + SEPARATOR + "non-m�teaux");
			bw.newLine();
			
			bw.write("chlore" + SEPARATOR + "17" + SEPARATOR + "35.4527" + SEPARATOR + "Cl"  + SEPARATOR + "halog�nes");
			bw.newLine();
			
			bw.write("argon" + SEPARATOR +"18" + SEPARATOR + "39.948" + SEPARATOR + "Ar" + SEPARATOR + "gaz nobles");
			bw.newLine();
			
			bw.write("potassium" + SEPARATOR + "19" + SEPARATOR + "39.0983" + SEPARATOR + "K" + SEPARATOR + "alcalins");
			bw.newLine();
			
			bw.write("calcium" + SEPARATOR + "20" + SEPARATOR + "40.078" + SEPARATOR + "Ca" + SEPARATOR + "alcalino-terreux");
			bw.newLine();
			
			bw.write("scandium" + SEPARATOR + "21" + SEPARATOR + "44.95591" + SEPARATOR + "Sc" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("titane" + SEPARATOR + "22" + SEPARATOR + "47.95591" + SEPARATOR + "Ti" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("vanadium" + SEPARATOR + "23" + SEPARATOR + "50.9415" + SEPARATOR + "V" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("chrome" + SEPARATOR + "24" + SEPARATOR + "51.9961" + SEPARATOR + "Cr" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("mangan�se" + SEPARATOR + "25" + SEPARATOR + "54.93805" + SEPARATOR + "Mn" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("fer" + SEPARATOR + "26" + SEPARATOR + "55.847" + SEPARATOR + "Fe" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("cobalt" + SEPARATOR + "27" + SEPARATOR + "58.9332" + SEPARATOR + "Co" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("nickel" + SEPARATOR + "28" + SEPARATOR + "58.69" + SEPARATOR + "Ni" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("cuivre" + SEPARATOR + "29" + SEPARATOR + "63.546" + SEPARATOR + "Cu" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("zinc" + SEPARATOR + "30" + SEPARATOR + "65.39" + SEPARATOR + "Zn" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("gallium" + SEPARATOR + "31" + SEPARATOR + "69.723" + SEPARATOR + "Ga" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("germanium" + SEPARATOR + "32" + SEPARATOR + "72.61" + SEPARATOR + "Ge" + SEPARATOR + "m�tallo�des");
			bw.newLine();
			
			bw.write("arsenic" + SEPARATOR + "33" + SEPARATOR + "74.92159" + SEPARATOR + "As" + SEPARATOR + "m�tallo�des");
			bw.newLine();
			
			bw.write("s�l�nium" + SEPARATOR + "34" + SEPARATOR + "78.96" + SEPARATOR + "Se" + SEPARATOR + "non-m�teaux");
			bw.newLine();
			
			bw.write("brome" + SEPARATOR + "35" + SEPARATOR + "79.904" + SEPARATOR + "Br"  + SEPARATOR + "halog�nes");
			bw.newLine();
			
			bw.write("krypton" + SEPARATOR + "36" + SEPARATOR + "83.8" + SEPARATOR + "Kr" + SEPARATOR + "gaz nobles");
			bw.newLine();
			
			bw.write("rubidium" + SEPARATOR + "37" + SEPARATOR + "85.4678" + SEPARATOR + "Rb" + SEPARATOR + "alcalins");
			bw.newLine();
			
			bw.write("strontium" + SEPARATOR + "38" + SEPARATOR + "87.62" + SEPARATOR + "Sr" + SEPARATOR + "alcalino-terreux");
			bw.newLine();
			
			bw.write("yttrium" + SEPARATOR + "39" + SEPARATOR + "88.90638" + SEPARATOR + "Y" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("zirconium" + SEPARATOR + "40" + SEPARATOR + "91.224" + SEPARATOR + "Zr" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("niobium" + SEPARATOR + "41" + SEPARATOR + "92.9063" + SEPARATOR + "Nb" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("molybd�ne" + SEPARATOR + "42" + SEPARATOR + "95.94" + SEPARATOR + "Mo" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("techn�tium" + SEPARATOR + "43" + SEPARATOR + "98.9063" + SEPARATOR + "Tc" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("ruth�nium" + SEPARATOR + "44" + SEPARATOR + "101.07" + SEPARATOR + "Ru" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("rhodium" + SEPARATOR + "45" + SEPARATOR + "102.9055" + SEPARATOR + "Rh" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("palladium" + SEPARATOR + "46" + SEPARATOR + "106.42" + SEPARATOR + "Pd" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("argent" + SEPARATOR + "47" + SEPARATOR + "107.8682" + SEPARATOR + "Ag" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("cadmium" + SEPARATOR + "48" + SEPARATOR + "112.411" + SEPARATOR + "Cd" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("indium" + SEPARATOR + "49" + SEPARATOR + "114.82" + SEPARATOR + "In" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("�tain" + SEPARATOR + "50" + SEPARATOR + "118.71" + SEPARATOR + "Sn" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("antimoine" + SEPARATOR + "51" + SEPARATOR + "121.75" + SEPARATOR + "Sb" + SEPARATOR + "m�tallo�des");
			bw.newLine();
			
			bw.write("tellure" + SEPARATOR + "52" + SEPARATOR + "127.6" + SEPARATOR + "Te" + SEPARATOR + "m�tallo�des");
			bw.newLine();
			
			bw.write("iode" + SEPARATOR + "53" + SEPARATOR + "126.90447" + SEPARATOR + "I"  + SEPARATOR + "halog�nes");
			bw.newLine();
			
			bw.write("x�non" + SEPARATOR + "54" + SEPARATOR + "131.29" + SEPARATOR + "Xe" + SEPARATOR + "gaz nobles");
			bw.newLine();
			
			bw.write("c�sium" + SEPARATOR + "55" + SEPARATOR + "132.90543" + SEPARATOR + "Cs" + SEPARATOR + "alcalins");
			bw.newLine();
			
			bw.write("baryum" + SEPARATOR + "56" + SEPARATOR + "137.327" + SEPARATOR + "Ba" + SEPARATOR + "alcalino-terreux");
			bw.newLine();
			
			bw.write("lanthane" + SEPARATOR + "57" + SEPARATOR + "138.9055" + SEPARATOR + "La" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("c�rium" + SEPARATOR + "58" + SEPARATOR + "140.115" + SEPARATOR + "Ce" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("pres�odyme" + SEPARATOR + "59" + SEPARATOR + "140.90765" + SEPARATOR + "Pr" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("n�odyme" + SEPARATOR + "60" + SEPARATOR + "144.24" + SEPARATOR + "Nd" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("prom�thium" + SEPARATOR + "61" + SEPARATOR + "146.9151" + SEPARATOR + "Pm" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("samarium" + SEPARATOR + "62" + SEPARATOR + "150.36" + SEPARATOR + "Sm" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("europium" + SEPARATOR + "63" + SEPARATOR + "151.965" + SEPARATOR + "Eu" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("gadolinium" + SEPARATOR + "64" + SEPARATOR + "157.25" + SEPARATOR + "Gd" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("terbium" + SEPARATOR + "65" + SEPARATOR + "158.92534" + SEPARATOR + "Tb" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("dysprosium" + SEPARATOR + "66" + SEPARATOR + "162.5" + SEPARATOR + "Dy" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("holmium" + SEPARATOR + "67" + SEPARATOR + "164.93032" + SEPARATOR + "Ho" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("erbium" + SEPARATOR + "68" + SEPARATOR + "167.26" + SEPARATOR + "Er" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("thulium" + SEPARATOR + "69" + SEPARATOR + "168.93421" + SEPARATOR + "Tm" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("ytterbium" + SEPARATOR + "70" + SEPARATOR + "173.04" + SEPARATOR + "Yb" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("lut�cium" + SEPARATOR + "71" + SEPARATOR + "174.967" + SEPARATOR + "Lu" + SEPARATOR + "lanthanides");
			bw.newLine();
			
			bw.write("hafnium" + SEPARATOR + "72" + SEPARATOR + "178.49" + SEPARATOR + "Hf" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("tantale" + SEPARATOR + "73" + SEPARATOR + "180.9479" + SEPARATOR + "Ta" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("tungst�ne" + SEPARATOR + "74" + SEPARATOR + "183.85" + SEPARATOR + "W" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("rh�nium" + SEPARATOR + "75" + SEPARATOR + "186.207" + SEPARATOR + "Re" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("osmium" + SEPARATOR + "76" + SEPARATOR + "190.2" + SEPARATOR + "Os" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("iridium" + SEPARATOR + "77" + SEPARATOR + "192.22" + SEPARATOR + "Ir" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("platine" + SEPARATOR + "78" + SEPARATOR + "195.08" + SEPARATOR + "Pt" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("or" + SEPARATOR + "79" + SEPARATOR + "196.96654" + SEPARATOR + "Au" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("mercure" + SEPARATOR + "80" + SEPARATOR + "200.59" + SEPARATOR + "Hg" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("thallium" + SEPARATOR + "81" + SEPARATOR + "204.3833" + SEPARATOR + "Ti" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("plomb" + SEPARATOR + "82" + SEPARATOR + "207.2" + SEPARATOR + "Pb" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("bismuth" + SEPARATOR + "83" + SEPARATOR + "208.98037" + SEPARATOR + "Bi" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("polonium" + SEPARATOR + "84" + SEPARATOR + "208.9824" + SEPARATOR + "Po" + SEPARATOR + "m�teaux pauvre");
			bw.newLine();
			
			bw.write("astate" + SEPARATOR + "85" + SEPARATOR + "209.9871" + SEPARATOR + "At" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("radon" + SEPARATOR + "86" + SEPARATOR + "222.0176" + SEPARATOR + "Rn" + SEPARATOR + "gaz nobles");
			bw.newLine();
			
			bw.write("francium" + SEPARATOR + "87" + SEPARATOR + "223.0197" + SEPARATOR + "Fr" + SEPARATOR + "alcalins");
			bw.newLine();
			
			bw.write("radium" + SEPARATOR + "88" + SEPARATOR + "226.0254" + SEPARATOR + "Ra" + SEPARATOR + "alcalino-terreux");
			bw.newLine();
			
			bw.write("actinium" + SEPARATOR + "89" + SEPARATOR + "227.0278" + SEPARATOR +"Ac" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("thorium" + SEPARATOR + "90" + SEPARATOR + "232.0381" + SEPARATOR + "Th" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("protactinium" + SEPARATOR + "91" + SEPARATOR + "231.0359" + SEPARATOR + "Pa" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("uranium" + SEPARATOR + "92" + SEPARATOR + "238.0289" + SEPARATOR + "U" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("neptunium" + SEPARATOR + "93" + SEPARATOR + "237.0482" + SEPARATOR + "Np" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("plutonium" + SEPARATOR + "94" + SEPARATOR + "244.0614" + SEPARATOR + "Pu" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("am�ricium" + SEPARATOR + "95" + SEPARATOR + "243.0614" + SEPARATOR + "Am" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("curium" + SEPARATOR + "96" + SEPARATOR + "247.0703" + SEPARATOR + "Cm" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("berk�lium" + SEPARATOR + "97" + SEPARATOR + "247.0703" + SEPARATOR + "Bk" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("californium" + SEPARATOR + "98" + SEPARATOR + "251.0796" + SEPARATOR + "Cf" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("einsteinium" + SEPARATOR + "99" + SEPARATOR + "252.0829" + SEPARATOR + "Es" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("fermium" + SEPARATOR + "100" + SEPARATOR + "257.0951" + SEPARATOR + "Fm" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("mend�l�vium" + SEPARATOR + "101" + SEPARATOR + "258.0986" + SEPARATOR + "Md" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("nob�lium" + SEPARATOR + "102" + SEPARATOR + "259.1009" + SEPARATOR + "No" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("lawrencium" + SEPARATOR + "103" + SEPARATOR + "260.1053" + SEPARATOR + "Lr" + SEPARATOR + "actinides");
			bw.newLine();
			
			bw.write("rutherfordium" + SEPARATOR + "104" + SEPARATOR + "261.1087" + SEPARATOR + "Rf" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("dubnium" + SEPARATOR + "105" + SEPARATOR + "262.1138" + SEPARATOR + "Db" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("seaborgium" + SEPARATOR + "106" + SEPARATOR + "263.1182" + SEPARATOR + "Sg" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("bohrium" + SEPARATOR +"107" + SEPARATOR + "262.1229" + SEPARATOR + "Bh" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("hassium" + SEPARATOR + "108" + SEPARATOR + "265" + SEPARATOR + "Hs" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("meitn�rium" + SEPARATOR + "109" + SEPARATOR + "266" + SEPARATOR + "Mt" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("darmstadium" + SEPARATOR + "110" + SEPARATOR + "269" + SEPARATOR + "Ds" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("roentgenium" + SEPARATOR + "111" + SEPARATOR + "272" + SEPARATOR + "Rg" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("copernicium" + SEPARATOR + "112" + SEPARATOR + "277" + SEPARATOR + "Cn" + SEPARATOR + "m�teaux de transition");
			bw.newLine();
			
			bw.write("nihonium" + SEPARATOR + "113" + SEPARATOR + "286" + SEPARATOR + "Nh" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("fl�rovium" + SEPARATOR + "114" + SEPARATOR + "289" + SEPARATOR + "Fl" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("moscovium" + SEPARATOR + "115" + SEPARATOR + "288" + SEPARATOR + "Mc" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("livermorium" + SEPARATOR + "116" + SEPARATOR + "292" + SEPARATOR + "Lv" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("tennesse" + SEPARATOR + "117" + SEPARATOR + "294" + SEPARATOR + "Ts" + SEPARATOR + "non class�");
			bw.newLine();
			
			bw.write("oganesson" + SEPARATOR + "118" + SEPARATOR + "294" + SEPARATOR + "Og" + SEPARATOR + "non class�");
			bw.newLine();
		
			bw.close();
			System.out.println("finished");
		}
		catch (Exception e) {
			//TODO : handle exception
		}
	}
}	

