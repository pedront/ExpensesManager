package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category extends Model {

	private static final long serialVersionUID = -7985692005498087358L;

	@Id
	public Long id;

	@Required
	public String name;

	@JsonIgnore
	@OneToMany
	public List<Expense> expenses;

	@JsonIgnore
	@OneToMany
	public List<Earn> earns;
}
