package me.portfolio.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="experience_id")
	private Experience experience;
}
