package com.lespit.tenaris.domain.user;

public enum Turno {

	PRIMEIRO("1�"),
	SEGUNDO("2�"),
	TERCEIRO("3�"),
	ADMIN("ADM");
	
	private String descricao;
	
	Turno(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
