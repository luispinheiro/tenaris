package com.lespit.tenaris.domain.uh;

public enum Condicao {

	LIMPO("Limpo"),
	SUJO("Sujo");
	
	private String descricao;
	
	Condicao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
