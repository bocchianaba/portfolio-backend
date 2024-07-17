package me.portfolio.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String entreprise;
	private String role;
	private Date startDate;
	private Date endDate;
	
	@OneToMany(mappedBy = "experience", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Task> tasks;
	
	@OneToMany(mappedBy = "experience", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Realisation> projects;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", updatable = false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_at")
	private Date lastUpdatedAt;
}
