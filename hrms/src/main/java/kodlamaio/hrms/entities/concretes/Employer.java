package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User {
	
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_site")
	private String webSite;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer") 
	private List<JobAdvertisement>  jobAdvertisements;
	  

	

}
