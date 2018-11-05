package com.nguyenvanthuan.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity(name = "sanpham")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int MASANPHAM;
	String TENSANPHAM;
	String MOTA;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="MASANPHAM")
	Set<ChiTietSanPham> Chitietsanpham;
	int ISDELETE;
	int DELETEID;
	Date TIMEDELETE;
	int CREATEID;
	Date TIMECREATE;
	int UPDATEID;
	Date TIMEUPDATE;
	public Set<ChiTietSanPham> getChitietsanpham() {
		return Chitietsanpham;
	}

	public void setChitietsanpham(Set<ChiTietSanPham> chitietsanpham) {
		Chitietsanpham = chitietsanpham;
	}

	public int getISDELETE() {
		return ISDELETE;
	}

	public void setISDELETE(int iSDELETE) {
		ISDELETE = iSDELETE;
	}

	public int getDELETEID() {
		return DELETEID;
	}

	public void setDELETEID(int dELETEID) {
		DELETEID = dELETEID;
	}

	public Date getTIMEDELETE() {
		return TIMEDELETE;
	}

	public void setTIMEDELETE(Date tIMEDELETE) {
		TIMEDELETE = tIMEDELETE;
	}

	public int getCREATEID() {
		return CREATEID;
	}

	public void setCREATEID(int cREATEID) {
		CREATEID = cREATEID;
	}

	public Date getTIMECREATE() {
		return TIMECREATE;
	}

	public void setTIMECREATE(Date tIMECREATE) {
		TIMECREATE = tIMECREATE;
	}

	public int getUPDATEID() {
		return UPDATEID;
	}

	public void setUPDATEID(int uPDATEID) {
		UPDATEID = uPDATEID;
	}

	public Date getTIMEUPDATE() {
		return TIMEUPDATE;
	}

	public void setTIMEUPDATE(Date tIMEUPDATE) {
		TIMEUPDATE = tIMEUPDATE;
	}

	

	public int getMASANPHAM() {
		return MASANPHAM;
	}

	public void setMASANPHAM(int mASANPHAM) {
		MASANPHAM = mASANPHAM;
	}

	public String getTENSANPHAM() {
		return TENSANPHAM;
	}

	public void setTENSANPHAM(String tENSANPHAM) {
		TENSANPHAM = tENSANPHAM;
	}

	public String getMOTA() {
		return MOTA;
	}

	public void setMOTA(String mOTA) {
		MOTA = mOTA;
	}

}
