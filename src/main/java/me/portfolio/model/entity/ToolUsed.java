package me.portfolio.model.entity;

import jakarta.persistence.*;

@Entity
public class ToolUsed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "project_id")
	private Realisation project;
}
