package io.cx.model

import java.util.Date
import org.bson.types.ObjectId
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate

public class baseStudent {

	@Id
	private ObjectId cxId;
	
	private String name
	
	private String address
	
	@CreatedDate
	Date createdDate
	
	@LastModifiedDate
	Date lastModifiedDate;
	
	public ObjectId getCxId() {
		cxId
	}
	
	public void setCxId(ObjectId id) {
		cxId = id;
	}
	
	public String getName() {
		name
	}
	public void setName(String name) {
		this.name = name;
	}
}
