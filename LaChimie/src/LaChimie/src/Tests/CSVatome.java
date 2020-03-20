package Tests;

import java.io.File;
import java.io.PrintWriter;

public class CSVatome {
	
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter (new File("tableauPeriodique.csv"));
			StringBuilder sb = new StringBuilder();
			sb.append("# nom");
			sb.append(",");
			sb.append("num_atomique");
			sb.append(",");
			sb.append("masse_atomique");
			sb.append(",");
			sb.append("sym_chimique");
			sb.append("\r\n");
			
			sb.append("hydrogène");
			sb.append(",");
			sb.append("1");
			sb.append(",");
			sb.append("1.00794");
			sb.append(",");
			sb.append("H");
			sb.append("\r\n");
			
			sb.append("hélium");
			sb.append(",");
			sb.append("2");
			sb.append(",");
			sb.append("4.002602");
			sb.append(",");
			sb.append("He");
			sb.append("\r\n");
			
			sb.append("lithium");
			sb.append(",");
			sb.append("3");
			sb.append(",");
			sb.append("6.941");
			sb.append(",");
			sb.append("Li");
			sb.append("\r\n");
			
			sb.append("béryllium");
			sb.append(",");
			sb.append("4");
			sb.append(",");
			sb.append("9.012182");
			sb.append(",");
			sb.append("Be");
			sb.append("\r\n");
			
			sb.append("bore");
			sb.append(",");
			sb.append("5");
			sb.append(",");
			sb.append("10.811");
			sb.append(",");
			sb.append("B");
			sb.append("\r\n");
			
			sb.append("carbone");
			sb.append(",");
			sb.append("6");
			sb.append(",");
			sb.append("12.011");
			sb.append(",");
			sb.append("C");
			sb.append("\r\n");
			
			sb.append("azote");
			sb.append(",");
			sb.append("7");
			sb.append(",");
			sb.append("14.00674");
			sb.append(",");
			sb.append("N");
			sb.append("\r\n");
			
			sb.append("oxygène");
			sb.append(",");
			sb.append("8");
			sb.append(",");
			sb.append("15.9994");
			sb.append(",");
			sb.append("O");
			sb.append("\r\n");
			
			sb.append("fluor");
			sb.append(",");
			sb.append("9");
			sb.append(",");
			sb.append("18.9984032");
			sb.append(",");
			sb.append("F");
			sb.append("\r\n");
			
			sb.append("néon");
			sb.append(",");
			sb.append("10");
			sb.append(",");
			sb.append("20.1797");
			sb.append(",");
			sb.append("Ne");
			sb.append("\r\n");
			
			sb.append("sodium");
			sb.append(",");
			sb.append("11");
			sb.append(",");
			sb.append("22.989768");
			sb.append(",");
			sb.append("Na");
			sb.append("\r\n");
			
			sb.append("magnésium");
			sb.append(",");
			sb.append("12");
			sb.append(",");
			sb.append("24.305");
			sb.append(",");
			sb.append("Mg");
			sb.append("\r\n");
			
			sb.append("aluminium");
			sb.append(",");
			sb.append("13");
			sb.append(",");
			sb.append("26.981539");
			sb.append(",");
			sb.append("Al");
			sb.append("\r\n");
			
			sb.append("silicium");
			sb.append(",");
			sb.append("14");
			sb.append(",");
			sb.append("28.0855");
			sb.append(",");
			sb.append("Si");
			sb.append("\r\n");
			
			sb.append("phosphore");
			sb.append(",");
			sb.append("15");
			sb.append(",");
			sb.append("30.973762");
			sb.append(",");
			sb.append("P");
			sb.append("\r\n");
			
			sb.append("soufre");
			sb.append(",");
			sb.append("16");
			sb.append(",");
			sb.append("32.066");
			sb.append(",");
			sb.append("S");
			sb.append("\r\n");
			
			sb.append("chlore");
			sb.append(",");
			sb.append("17");
			sb.append(",");
			sb.append("35.4527");
			sb.append(",");
			sb.append("Cl");
			sb.append("\r\n");
			
			sb.append("argon");
			sb.append(",");
			sb.append("18");
			sb.append(",");
			sb.append("39.948");
			sb.append(",");
			sb.append("Ar");
			sb.append("\r\n");
			
			sb.append("potassium");
			sb.append(",");
			sb.append("19");
			sb.append(",");
			sb.append("39.0983");
			sb.append(",");
			sb.append("K");
			sb.append("\r\n");
			
			sb.append("calcium");
			sb.append(",");
			sb.append("20");
			sb.append(",");
			sb.append("40.078");
			sb.append(",");
			sb.append("Ca");
			sb.append("\r\n");
			
			sb.append("scandium");
			sb.append(",");
			sb.append("21");
			sb.append(",");
			sb.append("44.95591");
			sb.append(",");
			sb.append("Sc");
			sb.append("\r\n");
			
			sb.append("titane");
			sb.append(",");
			sb.append("22");
			sb.append(",");
			sb.append("47.95591");
			sb.append(",");
			sb.append("Ti");
			sb.append("\r\n");
			
			sb.append("vanadium");
			sb.append(",");
			sb.append("23");
			sb.append(",");
			sb.append("50.9415");
			sb.append(",");
			sb.append("V");
			sb.append("\r\n");
			
			sb.append("chrome");
			sb.append(",");
			sb.append("24");
			sb.append(",");
			sb.append("51.9961");
			sb.append(",");
			sb.append("Cr");
			sb.append("\r\n");
			
			sb.append("manganèse");
			sb.append(",");
			sb.append("25");
			sb.append(",");
			sb.append("54.93805");
			sb.append(",");
			sb.append("Mn");
			sb.append("\r\n");
			
			sb.append("fer");
			sb.append(",");
			sb.append("26");
			sb.append(",");
			sb.append("55.847");
			sb.append(",");
			sb.append("Fe");
			sb.append("\r\n");
			
			sb.append("cobalt");
			sb.append(",");
			sb.append("27");
			sb.append(",");
			sb.append("58.9332");
			sb.append(",");
			sb.append("Co");
			sb.append("\r\n");
			
			sb.append("nickel");
			sb.append(",");
			sb.append("28");
			sb.append(",");
			sb.append("58.69");
			sb.append(",");
			sb.append("Ni");
			sb.append("\r\n");
			
			sb.append("cuivre");
			sb.append(",");
			sb.append("29");
			sb.append(",");
			sb.append("63.546");
			sb.append(",");
			sb.append("Cu");
			sb.append("\r\n");
			
			sb.append("zinc");
			sb.append(",");
			sb.append("30");
			sb.append(",");
			sb.append("65.39");
			sb.append(",");
			sb.append("Zn");
			sb.append("\r\n");
			
			sb.append("gallium");
			sb.append(",");
			sb.append("31");
			sb.append(",");
			sb.append("69.723");
			sb.append(",");
			sb.append("Ga");
			sb.append("\r\n");
			
			sb.append("germanium");
			sb.append(",");
			sb.append("32");
			sb.append(",");
			sb.append("72.61");
			sb.append(",");
			sb.append("Ge");
			sb.append("\r\n");
			
			sb.append("arsenic");
			sb.append(",");
			sb.append("33");
			sb.append(",");
			sb.append("74.92159");
			sb.append(",");
			sb.append("As");
			sb.append("\r\n");
			
			sb.append("sélénium");
			sb.append(",");
			sb.append("34");
			sb.append(",");
			sb.append("78.96");
			sb.append(",");
			sb.append("Se");
			sb.append("\r\n");
			
			sb.append("brome");
			sb.append(",");
			sb.append("35");
			sb.append(",");
			sb.append("79.904");
			sb.append(",");
			sb.append("Br");
			sb.append("\r\n");
			
			sb.append("krypton");
			sb.append(",");
			sb.append("36");
			sb.append(",");
			sb.append("83.8");
			sb.append(",");
			sb.append("Kr");
			sb.append("\r\n");
			
			sb.append("rubidium");
			sb.append(",");
			sb.append("37");
			sb.append(",");
			sb.append("85.4678");
			sb.append(",");
			sb.append("Rb");
			sb.append("\r\n");
			
			sb.append("strontium");
			sb.append(",");
			sb.append("38");
			sb.append(",");
			sb.append("87.62");
			sb.append(",");
			sb.append("Sr");
			sb.append("\r\n");
			
			sb.append("yttrium");
			sb.append(",");
			sb.append("39");
			sb.append(",");
			sb.append("88.90638");
			sb.append(",");
			sb.append("Y");
			sb.append("\r\n");
			
			sb.append("zirconium");
			sb.append(",");
			sb.append("40");
			sb.append(",");
			sb.append("91.224");
			sb.append(",");
			sb.append("Zr");
			sb.append("\r\n");
			
			sb.append("niobium");
			sb.append(",");
			sb.append("41");
			sb.append(",");
			sb.append("92.9063");
			sb.append(",");
			sb.append("Nb");
			sb.append("\r\n");
			
			sb.append("molybdène");
			sb.append(",");
			sb.append("42");
			sb.append(",");
			sb.append("95.94");
			sb.append(",");
			sb.append("Mo");
			sb.append("\r\n");
			
			sb.append("technétium");
			sb.append(",");
			sb.append("43");
			sb.append(",");
			sb.append("98.9063");
			sb.append(",");
			sb.append("Tc");
			sb.append("\r\n");
			
			sb.append("ruthénium");
			sb.append(",");
			sb.append("44");
			sb.append(",");
			sb.append("101.07");
			sb.append(",");
			sb.append("Ru");
			sb.append("\r\n");
			
			sb.append("rhodium");
			sb.append(",");
			sb.append("45");
			sb.append(",");
			sb.append("102.9055");
			sb.append(",");
			sb.append("Rh");
			sb.append("\r\n");
			
			sb.append("palladium");
			sb.append(",");
			sb.append("46");
			sb.append(",");
			sb.append("106.42");
			sb.append(",");
			sb.append("Pd");
			sb.append("\r\n");
			
			sb.append("argent");
			sb.append(",");
			sb.append("47");
			sb.append(",");
			sb.append("107.8682");
			sb.append(",");
			sb.append("Ag");
			sb.append("\r\n");
			
			sb.append("cadmium");
			sb.append(",");
			sb.append("48");
			sb.append(",");
			sb.append("112.411");
			sb.append(",");
			sb.append("Cd");
			sb.append("\r\n");
			
			sb.append("indium");
			sb.append(",");
			sb.append("49");
			sb.append(",");
			sb.append("114.82");
			sb.append(",");
			sb.append("In");
			sb.append("\r\n");
			
			sb.append("étain");
			sb.append(",");
			sb.append("50");
			sb.append(",");
			sb.append("118.71");
			sb.append(",");
			sb.append("Sn");
			sb.append("\r\n");
			
			sb.append("antimoine");
			sb.append(",");
			sb.append("51");
			sb.append(",");
			sb.append("121.75");
			sb.append(",");
			sb.append("Sb");
			sb.append("\r\n");
			
			sb.append("tellure");
			sb.append(",");
			sb.append("52");
			sb.append(",");
			sb.append("127.6");
			sb.append(",");
			sb.append("Te");
			sb.append("\r\n");
			
			sb.append("iode");
			sb.append(",");
			sb.append("53");
			sb.append(",");
			sb.append("126.90447");
			sb.append(",");
			sb.append("I");
			sb.append("\r\n");
			
			sb.append("xénon");
			sb.append(",");
			sb.append("54");
			sb.append(",");
			sb.append("131.29");
			sb.append(",");
			sb.append("Xe");
			sb.append("\r\n");
			
			sb.append("césium");
			sb.append(",");
			sb.append("55");
			sb.append(",");
			sb.append("132.90543");
			sb.append(",");
			sb.append("Cs");
			sb.append("\r\n");
			
			sb.append("baryum");
			sb.append(",");
			sb.append("56");
			sb.append(",");
			sb.append("137.327");
			sb.append(",");
			sb.append("Ba");
			sb.append("\r\n");
			
			sb.append("lanthane");
			sb.append(",");
			sb.append("57");
			sb.append(",");
			sb.append("138.9055");
			sb.append(",");
			sb.append("La");
			sb.append("\r\n");
			
			sb.append("cérium");
			sb.append(",");
			sb.append("58");
			sb.append(",");
			sb.append("140.115");
			sb.append(",");
			sb.append("Ce");
			sb.append("\r\n");
			
			sb.append("preséodyme");
			sb.append(",");
			sb.append("59");
			sb.append(",");
			sb.append("140.90765");
			sb.append(",");
			sb.append("Pr");
			sb.append("\r\n");
			
			sb.append("néodyme");
			sb.append(",");
			sb.append("60");
			sb.append(",");
			sb.append("144.24");
			sb.append(",");
			sb.append("Nd");
			sb.append("\r\n");
			
			sb.append("prométhium");
			sb.append(",");
			sb.append("61");
			sb.append(",");
			sb.append("146.9151");
			sb.append(",");
			sb.append("Pm");
			sb.append("\r\n");
			
			sb.append("samarium");
			sb.append(",");
			sb.append("62");
			sb.append(",");
			sb.append("150.36");
			sb.append(",");
			sb.append("Sm");
			sb.append("\r\n");
			
			sb.append("europium");
			sb.append(",");
			sb.append("63");
			sb.append(",");
			sb.append("151.965");
			sb.append(",");
			sb.append("Eu");
			sb.append("\r\n");
			
			sb.append("gadolinium");
			sb.append(",");
			sb.append("64");
			sb.append(",");
			sb.append("157.25");
			sb.append(",");
			sb.append("Gd");
			sb.append("\r\n");
			
			sb.append("terbium");
			sb.append(",");
			sb.append("65");
			sb.append(",");
			sb.append("158.92534");
			sb.append(",");
			sb.append("Tb");
			sb.append("\r\n");
			
			sb.append("dysprosium");
			sb.append(",");
			sb.append("66");
			sb.append(",");
			sb.append("162.5");
			sb.append(",");
			sb.append("Dy");
			sb.append("\r\n");
			
			sb.append("holmium");
			sb.append(",");
			sb.append("67");
			sb.append(",");
			sb.append("164.93032");
			sb.append(",");
			sb.append("Ho");
			sb.append("\r\n");
			
			sb.append("erbium");
			sb.append(",");
			sb.append("68");
			sb.append(",");
			sb.append("167.26");
			sb.append(",");
			sb.append("Er");
			sb.append("\r\n");
			
			sb.append("thulium");
			sb.append(",");
			sb.append("69");
			sb.append(",");
			sb.append("168.93421");
			sb.append(",");
			sb.append("Tm");
			sb.append("\r\n");
			
			sb.append("ytterbium");
			sb.append(",");
			sb.append("70");
			sb.append(",");
			sb.append("173.04");
			sb.append(",");
			sb.append("Yb");
			sb.append("\r\n");
			
			sb.append("lutécium");
			sb.append(",");
			sb.append("71");
			sb.append(",");
			sb.append("174.967");
			sb.append(",");
			sb.append("Lu");
			sb.append("\r\n");
			
			sb.append("hafnium");
			sb.append(",");
			sb.append("72");
			sb.append(",");
			sb.append("178.49");
			sb.append(",");
			sb.append("Hf");
			sb.append("\r\n");
			
			sb.append("tantale");
			sb.append(",");
			sb.append("73");
			sb.append(",");
			sb.append("180.9479");
			sb.append(",");
			sb.append("Ta");
			sb.append("\r\n");
			
			sb.append("tungstène");
			sb.append(",");
			sb.append("74");
			sb.append(",");
			sb.append("183.85");
			sb.append(",");
			sb.append("W");
			sb.append("\r\n");
			
			sb.append("rhénium");
			sb.append(",");
			sb.append("75");
			sb.append(",");
			sb.append("186.207");
			sb.append(",");
			sb.append("Re");
			sb.append("\r\n");
			
			sb.append("osmium");
			sb.append(",");
			sb.append("76");
			sb.append(",");
			sb.append("190.2");
			sb.append(",");
			sb.append("Os");
			sb.append("\r\n");
			
			sb.append("iridium");
			sb.append(",");
			sb.append("77");
			sb.append(",");
			sb.append("192.22");
			sb.append(",");
			sb.append("Ir");
			sb.append("\r\n");
			
			sb.append("platine");
			sb.append(",");
			sb.append("78");
			sb.append(",");
			sb.append("195.08");
			sb.append(",");
			sb.append("Pt");
			sb.append("\r\n");
			
			sb.append("or");
			sb.append(",");
			sb.append("79");
			sb.append(",");
			sb.append("196.96654");
			sb.append(",");
			sb.append("Au");
			sb.append("\r\n");
			
			sb.append("mercure");
			sb.append(",");
			sb.append("80");
			sb.append(",");
			sb.append("200.59");
			sb.append(",");
			sb.append("Hg");
			sb.append("\r\n");
			
			sb.append("thallium");
			sb.append(",");
			sb.append("81");
			sb.append(",");
			sb.append("204.3833");
			sb.append(",");
			sb.append("Ti");
			sb.append("\r\n");
			
			sb.append("plomb");
			sb.append(",");
			sb.append("82");
			sb.append(",");
			sb.append("207.2");
			sb.append(",");
			sb.append("Pb");
			sb.append("\r\n");
			
			sb.append("bismuth");
			sb.append(",");
			sb.append("83");
			sb.append(",");
			sb.append("208.98037");
			sb.append(",");
			sb.append("Bi");
			sb.append("\r\n");
			
			sb.append("polonium");
			sb.append(",");
			sb.append("84");
			sb.append(",");
			sb.append("208.9824");
			sb.append(",");
			sb.append("Po");
			sb.append("\r\n");
			
			sb.append("astate");
			sb.append(",");
			sb.append("85");
			sb.append(",");
			sb.append("209.9871");
			sb.append(",");
			sb.append("At");
			sb.append("\r\n");
			
			sb.append("radon");
			sb.append(",");
			sb.append("86");
			sb.append(",");
			sb.append("222.0176");
			sb.append(",");
			sb.append("Rn");
			sb.append("\r\n");
			
			sb.append("francium");
			sb.append(",");
			sb.append("87");
			sb.append(",");
			sb.append("223.0197");
			sb.append(",");
			sb.append("Fr");
			sb.append("\r\n");
			
			sb.append("radium");
			sb.append(",");
			sb.append("88");
			sb.append(",");
			sb.append("226.0254");
			sb.append(",");
			sb.append("Ra");
			sb.append("\r\n");
			
			sb.append("actinium");
			sb.append(",");
			sb.append("89");
			sb.append(",");
			sb.append("227.0278");
			sb.append(",");
			sb.append("Ac");
			sb.append("\r\n");
			
			sb.append("thorium");
			sb.append(",");
			sb.append("90");
			sb.append(",");
			sb.append("232.0381");
			sb.append(",");
			sb.append("Th");
			sb.append("\r\n");
			
			sb.append("protactinium");
			sb.append(",");
			sb.append("91");
			sb.append(",");
			sb.append("231.0359");
			sb.append(",");
			sb.append("Pa");
			sb.append("\r\n");
			
			sb.append("uranium");
			sb.append(",");
			sb.append("92");
			sb.append(",");
			sb.append("238.0289");
			sb.append(",");
			sb.append("U");
			sb.append("\r\n");
			
			sb.append("neptunium");
			sb.append(",");
			sb.append("93");
			sb.append(",");
			sb.append("237.0482");
			sb.append(",");
			sb.append("Np");
			sb.append("\r\n");
			
			sb.append("plutonium");
			sb.append(",");
			sb.append("94");
			sb.append(",");
			sb.append("244.0614");
			sb.append(",");
			sb.append("Pu");
			sb.append("\r\n");
			
			sb.append("américium");
			sb.append(",");
			sb.append("95");
			sb.append(",");
			sb.append("243.0614");
			sb.append(",");
			sb.append("Am");
			sb.append("\r\n");
			
			sb.append("curium");
			sb.append(",");
			sb.append("96");
			sb.append(",");
			sb.append("247.0703");
			sb.append(",");
			sb.append("Cm");
			sb.append("\r\n");
			
			sb.append("berkélium");
			sb.append(",");
			sb.append("97");
			sb.append(",");
			sb.append("247.0703");
			sb.append(",");
			sb.append("Bk");
			sb.append("\r\n");
			
			sb.append("californium");
			sb.append(",");
			sb.append("98");
			sb.append(",");
			sb.append("251.0796");
			sb.append(",");
			sb.append("Cf");
			sb.append("\r\n");
			
			sb.append("einsteinium");
			sb.append(",");
			sb.append("99");
			sb.append(",");
			sb.append("252.0829");
			sb.append(",");
			sb.append("Es");
			sb.append("\r\n");
			
			sb.append("fermium");
			sb.append(",");
			sb.append("100");
			sb.append(",");
			sb.append("257.0951");
			sb.append(",");
			sb.append("Fm");
			sb.append("\r\n");
			
			sb.append("mendélévium");
			sb.append(",");
			sb.append("101");
			sb.append(",");
			sb.append("258.0986");
			sb.append(",");
			sb.append("Md");
			sb.append("\r\n");
			
			sb.append("nobélium");
			sb.append(",");
			sb.append("102");
			sb.append(",");
			sb.append("259.1009");
			sb.append(",");
			sb.append("No");
			sb.append("\r\n");
			
			sb.append("lawrencium");
			sb.append(",");
			sb.append("103");
			sb.append(",");
			sb.append("260.1053");
			sb.append(",");
			sb.append("Lr");
			sb.append("\r\n");
			
			sb.append("rutherfordium");
			sb.append(",");
			sb.append("104");
			sb.append(",");
			sb.append("261.1087");
			sb.append(",");
			sb.append("Rf");
			sb.append("\r\n");
			
			sb.append("dubnium");
			sb.append(",");
			sb.append("105");
			sb.append(",");
			sb.append("262.1138");
			sb.append(",");
			sb.append("Db");
			sb.append("\r\n");
			
			sb.append("seaborgium");
			sb.append(",");
			sb.append("106");
			sb.append(",");
			sb.append("263.1182");
			sb.append(",");
			sb.append("Sg");
			sb.append("\r\n");
			
			sb.append("bohrium");
			sb.append(",");
			sb.append("107");
			sb.append(",");
			sb.append("262.1229");
			sb.append(",");
			sb.append("Bh");
			sb.append("\r\n");
			
			sb.append("hassium");
			sb.append(",");
			sb.append("108");
			sb.append(",");
			sb.append("265");
			sb.append(",");
			sb.append("Hs");
			sb.append("\r\n");
			
			sb.append("meitnérium");
			sb.append(",");
			sb.append("109");
			sb.append(",");
			sb.append("266");
			sb.append(",");
			sb.append("Mt");
			sb.append("\r\n");
			
			sb.append("darmstadium");
			sb.append(",");
			sb.append("110");
			sb.append(",");
			sb.append("269");
			sb.append(",");
			sb.append("Ds");
			sb.append("\r\n");
			
			sb.append("roentgenium");
			sb.append(",");
			sb.append("111");
			sb.append(",");
			sb.append("272");
			sb.append(",");
			sb.append("Rg");
			sb.append("\r\n");
			
			sb.append("copernicium");
			sb.append(",");
			sb.append("112");
			sb.append(",");
			sb.append("277");
			sb.append(",");
			sb.append("Cn");
			sb.append("\r\n");
			
			sb.append("nihonium");
			sb.append(",");
			sb.append("113");
			sb.append(",");
			sb.append("286");
			sb.append(",");
			sb.append("Nh");
			sb.append("\r\n");
			
			sb.append("flérovium");
			sb.append(",");
			sb.append("114");
			sb.append(",");
			sb.append("289");
			sb.append(",");
			sb.append("Fl");
			sb.append("\r\n");
			
			sb.append("moscovium");
			sb.append(",");
			sb.append("115");
			sb.append(",");
			sb.append("288");
			sb.append(",");
			sb.append("Mc");
			sb.append("\r\n");
			
			sb.append("livermorium");
			sb.append(",");
			sb.append("116");
			sb.append(",");
			sb.append("292");
			sb.append(",");
			sb.append("Lv");
			sb.append("\r\n");
			
			sb.append("tennesse");
			sb.append(",");
			sb.append("117");
			sb.append(",");
			sb.append("294");
			sb.append(",");
			sb.append("Ts");
			sb.append("\r\n");
			
			sb.append("oganesson");
			sb.append(",");
			sb.append("118");
			sb.append(",");
			sb.append("294");
			sb.append(",");
			sb.append("Og");
			sb.append("\r\n");
			pw.write(sb.toString());
			pw.close();
			System.out.println("finished");
		}
		catch (Exception e) {
			//TODO : handle exception
		}
	}
}
