package net.hu.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.hu.shoppingbackend.dao.CategoryDAO;
import net.hu.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some Description");
		category.setImageURL("Cat1.png");

		categories.add(category);

		category = new Category();

		// adding second category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some Description for Mobile");
		category.setImageURL("Cat4.png");

		categories.add(category);

	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) 
	{
		//enhanced for loop
		for (Category category : categories)
		{
			if (category.getId() == id) return category;
				
		}
		
		return null;
}
}
