package com.test3.Action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test3.Entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class Update extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,  
    HttpServletRequest request, HttpServletResponse response)  
    throws Exception{
		
		request.setCharacterEncoding("utf-8");
		User u =(User)form;
		
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.update(u);
		session.getTransaction().commit();
		session.close();
		
		return mapping.findForward("info");
	}

}
