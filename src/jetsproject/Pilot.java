package jetsproject;

public class Pilot {
	private String fname;
	private String lname;
	private int pilotid;
	
	Pilot (String fname, String lname) {
		this.fname =fname;
		this.lname =lname;
	}

	public Pilot(String fname, String lname, int pilotid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.pilotid = pilotid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPilotid() {
		return pilotid;
	}

	public void setPilotid(int pilotid) {
		this.pilotid = pilotid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot Name: ");
		builder.append(fname);
		builder.append(" ");
		builder.append(lname);
		return builder.toString();
	}
	
	
	
}
