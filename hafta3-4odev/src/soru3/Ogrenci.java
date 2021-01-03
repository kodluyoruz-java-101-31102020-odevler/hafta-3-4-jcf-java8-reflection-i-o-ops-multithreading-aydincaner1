package soru3;

public class Ogrenci {
	
	private String ogrno;
	private String ogrname;
	private String ogryas;
	private String bolum;
	
	
	public Ogrenci(String ogr_name, String ogrname, String ogr_yas, String bolum) {
		super();
		this.ogrno = ogr_name;
		this.ogrname = ogrname;
		this.ogryas = ogr_yas;
		this.bolum = bolum;
	}

	public String getOgrno() {
		return ogrno;
	}


	public void setOgrno(String ogrno) {
		this.ogrno = ogrno;
	}


	public String getOgrname() {
		return ogrname;
	}


	public void setOgrname(String ogrname) {
		this.ogrname = ogrname;
	}


	public String getOgryas() {
		return ogryas;
	}


	public void setOgryas(String ogryas) {
		this.ogryas = ogryas;
	}


	public String getBolum() {
		return bolum;
	}


	public void setBolum(String bolum) {
		this.bolum = bolum;
	}


	
}
