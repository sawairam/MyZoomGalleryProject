package net.sr.dao;

import java.util.List;

import net.sr.model.Category;

public interface CategoryDao 
{
	public void addCategory(Category category);
	public void updateCategory(Category category);
	public Category getCategory(int id);
	public void deleteCategory(int id);
	public List<Category> retriveCategory();
}
