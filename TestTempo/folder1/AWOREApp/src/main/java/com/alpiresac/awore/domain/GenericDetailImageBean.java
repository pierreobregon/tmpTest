package com.alpiresac.awore.domain;

import java.util.List;

public class GenericDetailImageBean {
	private Timagenrepo imageSelect;
	private List<Timagenrepo> lstImages;

	public List<Timagenrepo> getLstImages() {
		return lstImages;
	}

	public void setLstImages(List<Timagenrepo> lstImages) {
		this.lstImages = lstImages;
	}

	public Timagenrepo getImageSelect() {
		return imageSelect;
	}

	public void setImageSelect(Timagenrepo imageSelect) {
		this.imageSelect = imageSelect;
	}

}
