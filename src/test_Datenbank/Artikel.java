package test_Datenbank;

public class Artikel {
	private String id;
	private String bezeichnung;
	private String preis;
	
	public Artikel(String id, String bezeichnung, String preis) {
		this.id = id;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}
	public String getId() {
		return id;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public String getPreis() {
		return preis;
	}
	@Override
	public String toString() {
		return "{ "+this.getId()+", "+this.getBezeichnung()+", "+this.getPreis()+" }";
	}
	
	
	

}
