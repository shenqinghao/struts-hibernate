package com.test3.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.test3.Entity.User;


public class LoginAction extends Action {
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,  
    HttpServletRequest request, HttpServletResponse response)  
    throws Exception{
		 
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
        if ((uname==null)||(upwd==null)) {  
            return mapping.findForward("loginFail");  
        } else {  
        	Session sess = new Configuration().configure().buildSessionFactory().openSession();
        	Query query = sess.createQuery("from User");
        	List<User> list = query.list();
        	 for(int i=0;i<list.size();i++){
        		 	User user = list.get(i);
        		  	if(uname.equals(user.getUname())&&upwd.equals(user.getUpwd())){
        		  		return mapping.findForward("loginSuccess");
        		  	}
        	 }
        	 return mapping.findForward("loginFail"); 
        }  
	}
}
