package com.june13u.votebattle.mode;

import java.util.Date;
import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Stage {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Long stageId;

	@Persistent
	String stageTitle;

	@Persistent
	String imageATitle;

	// @Persistent
	// ImageA: Image

	@Persistent
	String imageBTitle;

	// @Persistent
	// ImageB: Image
	@Persistent
	Date createDate;

	@Persistent
	Date deleteDate;

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public String getStageTitle() {
		return stageTitle;
	}

	public void setStageTitle(String stageTitle) {
		this.stageTitle = stageTitle;
	}

	public String getImageATitle() {
		return imageATitle;
	}

	public void setImageATitle(String imageATitle) {
		this.imageATitle = imageATitle;
	}

	public String getImageBTitle() {
		return imageBTitle;
	}

	public void setImageBTitle(String imageBTitle) {
		this.imageBTitle = imageBTitle;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	@Override
	public String toString() {
		return "{stageId:" + getStageId() + ",stageTitle:'" + getStageTitle() + "',imageATitle:'" + getImageATitle()
				+ "',imageBTitle:'" + getImageBTitle() + "'}";
	}

}
