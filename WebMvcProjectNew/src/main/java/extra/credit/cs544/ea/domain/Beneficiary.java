package extra.credit.cs544.ea.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilip
 *
 */

@Entity
public class Beneficiary {
	@Id
	@GeneratedValue
	private int beneficiaryId;
	private String beneficiaryName;
	private String beneficiaryDescription;
	@Lob byte[] image;
	
	@ManyToMany(mappedBy="beneficiaries")
	private List<Project> projects = new ArrayList<Project>();

	public Beneficiary() {
	}

	public int getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(int beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBeneficiaryDescription() {
		return beneficiaryDescription;
	}

	public void setBeneficiaryDescription(String beneficiaryDescription) {
		this.beneficiaryDescription = beneficiaryDescription;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Beneficiary [beneficiaryId=" + beneficiaryId + ", beneficiaryName=" + beneficiaryName
				+ ", beneficiaryDescription=" + beneficiaryDescription + "]";
	}
	
}
