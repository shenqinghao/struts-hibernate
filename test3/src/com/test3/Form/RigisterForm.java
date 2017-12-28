package com.test3.Form;



import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RigisterForm extends ActionForm{
	
private int uid;
	private String uname;
	private String upwd;
	


	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	/*public ActionErrors validate(ActionMapping arg0,HttpServletRequest arg1){
		ActionErrors errors = new ActionErrors();
		String queryString = arg1.getQueryString();
		System.out.println(queryString);
		if(queryString.equalsIgnoreCase("method=Register")){        //忽略大小写
			if(uname==null||uname.equals("")){
				errors.add("uname",new ActionMessage("register.error.uname"));
			}
			if(upwd==null||upwd.equals("")){
				errors.add("upwd",new ActionMessage("register.error.upwd"));
			}
		}
		arg1.setAttribute("RegisterFormBean", this);
		return errors;
	}*/

}
