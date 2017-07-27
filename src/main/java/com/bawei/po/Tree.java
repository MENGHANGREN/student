package com.bawei.po;

import java.io.Serializable;

public class Tree  implements Serializable{

	private Integer id;
	private String name;
	private Integer did;
	private String url;
	private String target;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	@Override
	public String toString() {
		return "Tree [id=" + id + ", name=" + name + ", did=" + did + ", url="
				+ url + ", target=" + target + "]";
	}
	
}
