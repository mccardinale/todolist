package models;
import java.util.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import play.db.ebean.Model;
@Entity
public class Task extends Model {

	
	@Id
	public Long id;
	
	@Required
	public String label;
	
	public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
	
	public static List<Task> all() {
		return find.all();
	}
	
	public static void create(Task task){
		
	}
}
