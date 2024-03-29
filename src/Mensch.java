import java.util.Date;

public class Mensch {

	private String vorname;
	private String nachname;
	private Date geburtsdatum; // UNIX Timestamp
	
	{ this.vorname = null; this.nachname = null; this.geburtsdatum = new Date (); }
	
	public Mensch (String vorname, String nachname, Date geburtsdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}
	
	@SuppressWarnings("deprecation")
	public boolean isVolljährig () {
		
		Date volljährig = new Date (this.geburtsdatum.getDate());
		volljährig.setYear(volljährig.getYear() + 18);
		
		if (new Date ().getTime() > volljährig.getTime())
			return true;
		
		return false;
		
	}

	// getter:
	public String getVorname () { return vorname; }
	public String getNachname () { return nachname; }
	public Date getGeburtsdatum () { return geburtsdatum; }

	// setter:
	public void setVorname (String vorname) { this.vorname = vorname; }
	public void setNachname (String nachname) { this.nachname = nachname; }
	public void setGeburtsdatum (Date geburtsdatum) { this.geburtsdatum = geburtsdatum; }
	
	

}
