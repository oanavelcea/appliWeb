package fr.dawan.appliweb.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
// persistence des données récupérées avec JSON tool dans la base de donnée locale  
@Entity
@Table(name = "event")
public class Event implements Serializable{

	@Column(name = "latitude", length = 55, nullable = false)
	private double latitude;
	
	@Column(name = "longitude", length = 55, nullable = false)
	private double longitude;
	
	@Column(name = "lang", length = 50, nullable = false)
	private String lang;
	
	@Column(name = "city", length = 150, nullable = false)
	private String city;
	
	@Column(name = "uid", length = 55, nullable = false)
	private int uid;
	
	@Column(name = "placename", length = 150, nullable = false)
	private String placename;
	
	@Column(name = "pricingInfo", length = 150, nullable = false)
	private String pricingInfo;
	
	@Column(name = "image", length = 150, nullable = false)
	private String image;
	
	@Column(name = "dateStart", nullable = false)
	private Date dateStart;
	
	@Column(name = "updatedAt", nullable = false)
	private Date updatedAt;
	
	@Column(name = "spaceTimeInfo", length = 150, nullable = false)
	private String spaceTimeInfo;
	
	@Column(name = "department", length = 150, nullable = false)
	private String department;
	
	@Column(name = "link", length = 150, nullable = false)
	private String link;
	
	@Column(name = "title", length = 150, nullable = false)
	private String title;
	
	@Column(name = "address", length = 150, nullable = false)
	private String address;
	
	// @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE }, fetch = FetchType.LAZY)
	private List<String> timeTable;
	
	@Column(name = "imageThumb", length = 150, nullable = false)
	private String imageThumb;
	
	@Column(name = "region", length = 150, nullable = false)
	private String region;
	
	@Column(name = "dateEnd", nullable = false)
	private Date dateEnd;
	
	
	private List<String> tags;
	
	@Column(name = "description", length = 150, nullable = false)
	private String description;
	
	public Event() {
		tags = new ArrayList<String>();
		timeTable = new ArrayList<String>();
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getPlacename() {
		return placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	public String getPricingInfo() {
		return pricingInfo;
	}

	public void setPricingInfo(String pricingInfo) {
		this.pricingInfo = pricingInfo;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getTimeTable() {
		return timeTable;
	}

	public void setTimeTable(List<String> timetable) {
		this.timeTable = timetable;
	}

	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpaceTimeInfo() {
		return spaceTimeInfo;
	}

	public void setSpaceTimeInfo(String spaceTimeInfo) {
		this.spaceTimeInfo = spaceTimeInfo;
	}

	public String getImageThumb() {
		return imageThumb;
	}

	public void setImageThumb(String imageThumb) {
		this.imageThumb = imageThumb;
	}
	
	
	
	
}
