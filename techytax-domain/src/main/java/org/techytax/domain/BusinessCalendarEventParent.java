package org.techytax.domain;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Getter;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.jasypt.hibernate4.type.EncryptedBigDecimalType;
import org.jasypt.hibernate4.type.EncryptedStringType;
import org.zkoss.calendar.impl.SimpleCalendarEvent;

@MappedSuperclass
@TypeDefs({
	@TypeDef(name = "encryptedString", typeClass = EncryptedStringType.class, parameters = { @Parameter(name = "encryptorRegisteredName", value = "strongHibernateStringEncryptor") }),
	@TypeDef(name = "encryptedBigDecimal", typeClass = EncryptedBigDecimalType.class, parameters = { @Parameter(name = "encryptorRegisteredName", value = "bigDecimalEncryptor"),
			@Parameter(name = "decimalScale", value = "2") }) })
@Getter
public class BusinessCalendarEventParent extends SimpleCalendarEvent {
	
	private static final long serialVersionUID = 1L;

	@Type(type = "encryptedString")
	private String content;
	
	@Type(type = "encryptedString")
	private String title;
	
	private String headerColor;
	
	private String contentColor;
	
	private Date beginDate;
	
	private Date endDate;

	public void setContent(String content) {
		super.setContent(content);
		this.content = content;
	}

	public void setTitle(String title) {
		super.setTitle(title);
		this.title = title;
	}

	public void setHeaderColor(String headerColor) {
		super.setHeaderColor(headerColor);
		this.headerColor = headerColor;
	}

	public void setContentColor(String contentColor) {
		super.setContentColor(contentColor);
		this.contentColor = contentColor;
	}

	public void setBeginDate(Date beginDate) {
		super.setBeginDate(beginDate);
		this.beginDate = beginDate;
	}

	public void setEndDate(Date endDate) {
		super.setEndDate(endDate);
		this.endDate = endDate;
	}

}
