package com.lespit.tenaris.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_user")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

	@Id
	@GeneratedValue
	@EqualsAndHashCode.Include
	private Long id;

	@NotEmpty(message = "Username é obrigatório")
	private String username;
	
	@NotEmpty(message = "Senha é obrigatória")
	private String password;
	
	@NotEmpty(message = "Nome é obrigatório")
	@Column(name="display_name")
	private String displayName;
	
	@NotEmpty(message = "E-mail é obrigatório")
	@Email(message = "E-mail inválido")
	private String email;
	
	@NotEmpty(message = "Matrícula é obrigatório")
	private String matricula;
	
	@NotEmpty(message = "Turno é obrigatório")
	@Enumerated(EnumType.STRING)
	private Turno turno;
	
	@NotEmpty(message = "Cargo é obrigatório")
	private String cargo;	
	

}
