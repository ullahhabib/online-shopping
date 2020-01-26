package net.hu.shoppingbackend.dao;
import java.util.List;
import net.hu.shoppingbackend.dto.Category;


public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
