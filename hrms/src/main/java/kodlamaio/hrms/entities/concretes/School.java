package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "schools")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	private JobSeeker jobSeeker;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "start_date")
	private LocalDate startDate;
	
	@Column(name = "date_of_graduation")
	private LocalDate dateOfGraduation;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@ManyToOne
	private Resume resume;

}
