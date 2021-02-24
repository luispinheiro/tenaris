package com.lespit.tenaris.domain.uh;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.lespit.tenaris.domain.tag.Tag;
import com.lespit.tenaris.domain.user.AppUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chu")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Chu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Column(name = "whentodo")
	private LocalDateTime whenToDo = LocalDateTime.now();

	@NotEmpty(message = "Nível é obrigatório")
	@Size(min = 0, max = 100, message = "O tamanho da tag não pode ser menor que {min} maior que {max} caracteres")
	private Integer nivel;
	
	@NotEmpty(message = "Abastecimento é obrigatório")
	@Size(min = 0, max = 500, message = "O tamanho da tag não pode ser menor que {min} maior que {max} caracteres")
	private BigDecimal abastecimento;
	
	@Enumerated(EnumType.STRING)
	private Condicao condicao;

	private String observacao;
	
	@NotEmpty(message = "TAG é obrigatório")
	@ManyToOne
	@JoinColumn(name = "tag_id")
	private Tag tag;
	
	@ManyToOne
	@JoinColumn(name = "app_user_id")
	//@JsonIgnore
	private AppUser appUser;
}
