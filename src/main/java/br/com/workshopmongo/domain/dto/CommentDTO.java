package br.com.workshopmongo.domain.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO autoAuthorDTO;

	public CommentDTO() {
	}

	public CommentDTO(String text, Date date, AuthorDTO autoAuthorDTO) {
		super();
		this.text = text;
		this.date = date;
		this.autoAuthorDTO = autoAuthorDTO;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAutoAuthorDTO() {
		return autoAuthorDTO;
	}

	public void setAutoAuthorDTO(AuthorDTO autoAuthorDTO) {
		this.autoAuthorDTO = autoAuthorDTO;
	}

}
