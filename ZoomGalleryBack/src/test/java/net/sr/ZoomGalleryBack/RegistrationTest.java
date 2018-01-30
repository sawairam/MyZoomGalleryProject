package net.sr.ZoomGalleryBack;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.sr.dao.RegistrationFormDao;
import net.sr.hiberconfig.HiberConfig;
import net.sr.model.RegistrationForm;

public class RegistrationTest {

	static RegistrationFormDao registrationFormDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HiberConfig.class);
    	context.scan("net.sr.*");
    	registrationFormDao=(RegistrationFormDao)context.getBean("registrationFormDaoImpl");
	}
	@Ignore
	@Test
	public void addUser() 
	{
		try{
		RegistrationForm registrationForm=new RegistrationForm();
    	registrationForm.setAddress("17/B, Room no:-62");
    	registrationForm.setContact("9769841882");
    	registrationForm.setCountry("India");
    	registrationForm.setEmail("Ramesh1996@gmail.com");
    	registrationForm.setName("Ramesh");
    	registrationForm.setGender("Male");
    	registrationForm.setPassword("ramesh");
    	registrationForm.setConfirmPassword("ramesh");
    	registrationForm.setDob("06/03/1996");
    	registrationForm.setRole("ROLE_ADMIN");
    	registrationFormDao.createUser(registrationForm);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Ignore
	@Test
	public void updateUser() 
	{
		try{
		RegistrationForm registrationForm=new RegistrationForm();
    	registrationForm.setAddress("Room no:-62");
    	registrationForm.setContact("9769841882");
    	registrationForm.setCountry("India");
    	registrationForm.setEmail("Ram1996@gmail.com");
    	registrationForm.setName("Ram");
    	registrationForm.setGender("Male");
    	registrationForm.setConfirmPassword("ram");
    	registrationForm.setPassword("ram");
    	registrationForm.setDob("06/03/1996");
    	registrationForm.setRole("ROLE_USER");
    	registrationFormDao.updateUser(registrationForm);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Ignore
	@Test
	public void deleteUser() 
	{
		try{
		RegistrationForm registrationForm=new RegistrationForm();
    	registrationForm.setEmail("Ramesh1996@gmail.com");
    	registrationFormDao.deleteUser(registrationForm.getEmail());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Ignore
	@Test
	public void getUser()
	{
		try{
			RegistrationForm registrationForm=new RegistrationForm();
			registrationForm.setEmail("Ramesh1996@yahoo.com");
			RegistrationForm registrationForm1=registrationFormDao.getUser(registrationForm.getEmail());
			System.out.println(registrationForm1.getName());
			System.out.println(registrationForm1.getDob());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	
	@Test
	public void retrieveUser()
	{
		try{
		List<RegistrationForm> list=registrationFormDao.retrieveUser();	
		for (RegistrationForm registrationForm : list) {
			System.out.println(registrationForm.getEmail());
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}



}

