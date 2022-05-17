package com.qtwo;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


@ManagedBean
@SessionScoped
public class Login implements Serializable{
	
	private String user;
	private String pwd;
	private String msg;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String validateUsernamePassword() {
		boolean valid = LoginDAO.validate(user, pwd);
		if(valid) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
			return "Admin";
		}
		else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Incorrect username and password", "Enter correct credentials"));
			return "LoginForm2";
		}
	}

}
