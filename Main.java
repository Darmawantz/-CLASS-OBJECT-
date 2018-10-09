
public class Main {

	

	public static void main(String[] args) {
		kotak main = new kotak() ;
		
		main.setPanjang(5);
		main.setLebar(3);
				
		double panjang = main.getPanjang();
		double lebar = main.getLebar();
		double luas = main.getLuas();
		double keliling = main.getKeliling();
		
		System.out.println("panjang :"+panjang);
		System.out.println("lebar :"+lebar);
		System.out.println("luas :"+luas);
		System.out.println("keliling :"+keliling);
		
		Mahasiswa main1 = new Mahasiswa();
		
		main1.setNama("Darmawan");
		main1.setNim("D0217504");
		main1.setAlamat("Lembang");
		main1.setGolonganDarah("AB");
		main1.setStatus("Mahasiswa");
		main1.setTinggiBadan(158);
		main1.setBeratBadan(43);
		
		String nama = main1.getNama();
		String nim = main1.getNim();
		String alamat = main1.getAlamat();
		String golonganDarah = main1.getGolonganDarah();
		String status = main1.getStatus();
		int tinggiBadan = main1.getTinggiBadan();
		int beratBadan = main1.getBeratBadan();
		
		System.out.println("nama :"+nama);
		System.out.println("nim :"+nim);
		System.out.println("alamat :"+alamat);
		System.out.println("golonganDarah :"+golonganDarah);
		System.out.println("status :"+status);
		System.out.println("tinggiBadan :"+tinggiBadan);
		System.out.println("beratBadan :"+beratBadan);
		
		Node main2 = new Node();
		
		main2.setLabel("Boruto");
		main2.setValue(3);
		
		String label = main2.getLabel();
		int value = main2.getValue();
		
		System.out.println("Label :"+label);
		System.out.println("value :"+value);
		
		Stack main3 = new Stack ();
		
		Stack.value[0] = "budi" ;
		Stack.value[1] = "omar";
		Stack.value[2] = "siska" ;
		Stack.value[3] = "herni";
		Stack.value[4] = "jack" ;
		Stack.value[5] = "max";
		Stack.value[6] = "buly" ;
		Stack.value[7] = "gery";
		Stack.value[8] = "mia" ;
		Stack.value[9] = "arthur";
		Stack.value[10] = "martis" ;
		Stack.value[11] = "helcurt";
		Stack.value[12] = "black" ;
		Stack.value[13] = "sen";
		Stack.value[14] = "aan" ;
		Stack.value[15] = "jugo";
		Stack.value[16] = "lany" ;
		Stack.value[17] = "fanny";
		Stack.value[18] = "bou" ;
		Stack.value[19] = "bict";
		Stack.value[20] = "mers" ;
		Stack.value[21] = "jhon";
		Stack.value[22] = "tuti" ;
		Stack.value[23] = "ben";
		Stack.value[24] = "sun";
		Stack.value[25] = "nur";
		Stack.value[26] = "lismawati";
		Stack.value[26] = "wati";
		Stack.value[27] = "rival";
		Stack.value[28] = "herni";
		Stack.value[29] = "mushaebi";
		Stack.value[30] = "ashar";
		Stack.value[31] = "abrar";
		Stack.value[32] = "akbar";
		Stack.value[33] = "farham";
		Stack.value[34] = "yudhi";
		Stack.value[35] = "dermawan";
		Stack.value[36] = "indah";
		Stack.value[37] = "sari";
		Stack.value[38] = "bulan";
		Stack.value[39] = "muhammad";
		Stack.value[40] = "ikram";
		Stack.value[41] = "bakri";
		Stack.value[42] = "puput";
		Stack.value[43] = "widya";
		Stack.value[44] = "fitri";
		Stack.value[45] = "ika";
		Stack.value[46] = "eka";
		Stack.value[47] = "anti";
		Stack.value[48] = "mita";
		Stack.value[49] = "juljul";
		Stack.value[50] = "amir";
		Stack.value[51] = "mira";
		Stack.value[52] = "zera";
		Stack.value[53] = "edi";
		Stack.value[54] = "andi";
		Stack.value[55] = "ifdal";
		Stack.value[56] = "sarwan";
		Stack.value[57] = "lisa";
		Stack.value[58] = "nisa";
		Stack.value[59] = "afdal";
		Stack.value[60] = "nini";
		Stack.value[61] = "nunu";
		Stack.value[62] = "siska";
		Stack.value[63] = "cika";
		Stack.value[64] = "mila";
		Stack.value[65] = "nurmah";
		Stack.value[66] = "cici";
		Stack.value[67] = "uma";
		Stack.value[68] = "ayu";
		Stack.value[69] = "nasrul";
		Stack.value[70] = "nini";
		Stack.value[71] = "ega";
		Stack.value[72] = "egi";
		Stack.value[73] = "andi";
		Stack.value[74] = "tiar";
		Stack.value[75] = "naja";
		Stack.value[76] = "vivi";
		Stack.value[77] = "fifit";
		Stack.value[78] = "viona";
		Stack.value[79] = "ina";
		Stack.value[80] = "ani";
		Stack.value[81] = "ona";
		Stack.value[82] = "marhumah";
		Stack.value[83] = "ana";
		Stack.value[84] = "mirna";
		Stack.value[85] = "dirman";
		Stack.value[86] = "rapiah";
		Stack.value[87] = "kiki";
		Stack.value[88] = "saskia";
		Stack.value[89] = "riska";
		Stack.value[90] = "pendi";
		Stack.value[91] = "reski";
		Stack.value[92] = "fajar";
		Stack.value[93] = "darliani";
		Stack.value[94] = "hasyim";
		Stack.value[95] = "nagif";
		Stack.value[96] = "aldi";
		Stack.value[97] = "icham";
		Stack.value[98] = "raditya";
		Stack.value[99] = "nisa";
		Stack.value[100] = "nisa";

		Stack.setValueAt(3, "boruto");
		for (int i=0;i<Stack.value.length;i++){System.out.println(Stack.value[i]);};


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
