/**
 * WebEdge 2018
 */
package com.webedge.lotterystatistics;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mai Thành Duy An
 */
@SuppressWarnings("serial")
public class TicketEntity implements Serializable {

	@SuppressWarnings("unused")
	private static long serialVersionUID = 1L;

	private Date ngayXoSo;
	private String dai;
	private int giaiDacBiet;
	private int giaiNhat;
	private int giaiNhi;
	private int giaiBa1;
	private int giaiBa2;
	private int giaiTu1;
	private int giaiTu2;
	private int giaiTu3;
	private int giaiTu4;
	private int giaiTu5;
	private int giaiTu6;
	private int giaiTu7;
	private int giaiNam;
	private int giaiSau1;
	private int giaiSau2;
	private int giaiSau3;
	private int giaiBay;
	private int giaiTam;


	public String getDai() {
		return dai;
	}

	public void setDai(String dai) {
		this.dai = dai;
	}

	public Date getNgayXoSo() {
		return ngayXoSo;
	}

	public void setNgayXoSo(Date ngayXoSo) {
		this.ngayXoSo = ngayXoSo;
	}

	public int getGiaiDacBiet() {
		return giaiDacBiet;
	}

	public void setGiaiDacBiet(int giaiDacBiet) {
		this.giaiDacBiet = giaiDacBiet;
	}

	public int getGiaiNhat() {
		return giaiNhat;
	}

	public void setGiaiNhat(int giaiNhat) {
		this.giaiNhat = giaiNhat;
	}

	public int getGiaiNhi() {
		return giaiNhi;
	}

	public void setGiaiNhi(int giaiNhi) {
		this.giaiNhi = giaiNhi;
	}

	public int getGiaiBa1() {
		return giaiBa1;
	}

	public void setGiaiBa1(int giaiBa1) {
		this.giaiBa1 = giaiBa1;
	}

	public int getGiaiBa2() {
		return giaiBa2;
	}

	public void setGiaiBa2(int giaiBa2) {
		this.giaiBa2 = giaiBa2;
	}

	public int getGiaiTu1() {
		return giaiTu1;
	}

	public void setGiaiTu1(int giaiTu1) {
		this.giaiTu1 = giaiTu1;
	}

	public int getGiaiTu2() {
		return giaiTu2;
	}

	public void setGiaiTu2(int giaiTu2) {
		this.giaiTu2 = giaiTu2;
	}

	public int getGiaiTu3() {
		return giaiTu3;
	}

	public void setGiaiTu3(int giaiTu3) {
		this.giaiTu3 = giaiTu3;
	}

	public int getGiaiTu4() {
		return giaiTu4;
	}

	public void setGiaiTu4(int giaiTu4) {
		this.giaiTu4 = giaiTu4;
	}

	public int getGiaiTu5() {
		return giaiTu5;
	}

	public void setGiaiTu5(int giaiTu5) {
		this.giaiTu5 = giaiTu5;
	}

	public int getGiaiTu6() {
		return giaiTu6;
	}

	public void setGiaiTu6(int giaiTu6) {
		this.giaiTu6 = giaiTu6;
	}

	public int getGiaiTu7() {
		return giaiTu7;
	}

	public void setGiaiTu7(int giaiTu7) {
		this.giaiTu7 = giaiTu7;
	}

	public int getGiaiNam() {
		return giaiNam;
	}

	public void setGiaiNam(int giaiNam) {
		this.giaiNam = giaiNam;
	}

	public int getGiaiSau1() {
		return giaiSau1;
	}

	public void setGiaiSau1(int giaiSau1) {
		this.giaiSau1 = giaiSau1;
	}

	public int getGiaiSau2() {
		return giaiSau2;
	}

	public void setGiaiSau2(int giaiSau2) {
		this.giaiSau2 = giaiSau2;
	}

	public int getGiaiSau3() {
		return giaiSau3;
	}

	public void setGiaiSau3(int giaiSau3) {
		this.giaiSau3 = giaiSau3;
	}

	public int getGiaiBay() {
		return giaiBay;
	}

	public void setGiaiBay(int giaiBay) {
		this.giaiBay = giaiBay;
	}

	public int getGiaiTam() {
		return giaiTam;
	}

	public void setGiaiTam(int giaiTam) {
		this.giaiTam = giaiTam;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TicketEntity [ngayXoSo=");
		builder.append(ngayXoSo);
		builder.append(", dai=");
		builder.append(dai);
		builder.append(", giaiDacBiet=");
		builder.append(giaiDacBiet);
		builder.append(", giaiNhat=");
		builder.append(giaiNhat);
		builder.append(", giaiNhi=");
		builder.append(giaiNhi);
		builder.append(", giaiBa1=");
		builder.append(giaiBa1);
		builder.append(", giaiBa2=");
		builder.append(giaiBa2);
		builder.append(", giaiTu1=");
		builder.append(giaiTu1);
		builder.append(", giaiTu2=");
		builder.append(giaiTu2);
		builder.append(", giaiTu3=");
		builder.append(giaiTu3);
		builder.append(", giaiTu4=");
		builder.append(giaiTu4);
		builder.append(", giaiTu5=");
		builder.append(giaiTu5);
		builder.append(", giaiTu6=");
		builder.append(giaiTu6);
		builder.append(", giaiTu7=");
		builder.append(giaiTu7);
		builder.append(", giaiNam=");
		builder.append(giaiNam);
		builder.append(", giaiSau1=");
		builder.append(giaiSau1);
		builder.append(", giaiSau2=");
		builder.append(giaiSau2);
		builder.append(", giaiSau3=");
		builder.append(giaiSau3);
		builder.append(", giaiBay=");
		builder.append(giaiBay);
		builder.append(", giaiTam=");
		builder.append(giaiTam);
		builder.append("]");
		return builder.toString();
	}

	

}
