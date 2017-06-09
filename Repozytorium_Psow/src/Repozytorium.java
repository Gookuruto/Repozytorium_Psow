import java.util.ArrayList;

public class Repozytorium {
	ArrayList<Pies> lista = new ArrayList<Pies>();
	CreatorPsow crt = new CreatorPsow();
	public void dodaj(){
		lista.add(crt.create());
		
	}
	public void usun(int index){
		lista.remove(index);
	}
	
	public void wyswietl(){
		int i =0;
		for (Pies o : lista){
			System.out.printf("%d ",i);o.obejrzyj_Psa();
			i++;
		}
	}

}
