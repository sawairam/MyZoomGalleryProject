package net.sr.dao;

import java.util.List;

import net.sr.model.Supplier;

public interface SupplierDao 
{

	public void addSupplier(Supplier supplier);
	public void updateSupplier(Supplier supplier);
	public void deleteSupplier(int id);
	public Supplier getSupplier(int id);
	public List<Supplier> retrieveSupplier();
}
