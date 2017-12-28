package com.test3.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test3.Entity.User;
import com.test3.Form.RigisterForm;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class Register extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,  
    HttpServletRequest request, HttpServletResponse response)  
    throws Exception{
		
		request.setCharacterEncoding("UTF-8");
		User u = new User();
		RigisterForm rf = (RigisterForm) form;
		//u.setUname(rf.getUname());
		//u.setUpwd(rf.getUpwd());
		BeanUtils.copyProperties(u, rf);
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
		return mapping.findForward("welcome");
        
	}
}


		
	
