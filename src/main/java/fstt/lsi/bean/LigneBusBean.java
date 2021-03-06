package fstt.lsi.bean;



public class LigneBusBean {
	
	

	private int id;
	
	private String nom;
	
	private StationBean stationDepart;
	
	private StationBean stationDest;
	private int nmbreligne;
	public LigneBusBean(int id, String nom, StationBean stationDepart, StationBean stationDest, int nmbreligne) {
		super();
		this.id = id;
		this.nom = nom;
		this.stationDepart = stationDepart;
		this.stationDest = stationDest;
		this.nmbreligne = nmbreligne;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public StationBean getStationDepart() {
		return stationDepart;
	}
	public void setStationDepart(StationBean stationDepart) {
		this.stationDepart = stationDepart;
	}
	public StationBean getStationDest() {
		return stationDest;
	}
	public void setStationDest(StationBean stationDest) {
		this.stationDest = stationDest;
	}
	public int getNmbreligne() {
		return nmbreligne;
	}
	public void setNmbreligne(int nmbreligne) {
		this.nmbreligne = nmbreligne;
	}
	
	


}
