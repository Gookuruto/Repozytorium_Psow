
public class Pies implements Zwierz {
	
	Pies(){
		System.out.println("Pies");
		color = "bury";
		rasa = "kundel";
		waga = 0.5;
		wiek = 1;
		wysokosc = 10;
		
		
	}
	
	//Atributes
	private String color;
	private String rasa;
	private double waga;
	private int wiek;
	private double wysokosc;
	
	
	//Methods
	public void daj_Glos(){
		System.out.println(" Hau Hau!");
	}
	
	public void obejrzyj_Psa(){
		System.out.printf("Pies jest rasy %s o sierści koloru %s wadze %f kg oraz wysokosci %f cm i w wieku %d lat\n",
				rasa,color,waga,wysokosc,wiek);
	}
	public void setcolor(String c){
		color = c;
	}
	public void setrasa(String r){
		rasa =r;
	}
	public void setwaga(float w){
		waga = w;
		
	}
	public void setwiek(int wie){
		wiek = wie;
	}
	public void setwys(int wys){
		wysokosc = wys;
	}
}
