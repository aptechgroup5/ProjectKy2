/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group5.onlinephamacy.Action.Backend.User;

import com.group5.onlinephamacy.Controller.Backend.User.UserBackendDAO;
import com.group5.onlinephamacy.Model.User.UserMODEL;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Chung
 */
public class UserBackendAction extends ActionSupport implements ModelDriven<UserMODEL>{
    
    private UserMODEL userMODEL = new UserMODEL();
    
    public String vnk_UserBackend_Login() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession();
        if (new UserBackendDAO().vnk_CheckLogin_Backend(userMODEL.getUsername(), userMODEL.getPassword())) {
            HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
            request.getSession().setAttribute("statusLogin", true);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    
    public UserBackendAction() {
    }

    public UserMODEL getUserMODEL() {
        return userMODEL;
    }

    public void setUserMODEL(UserMODEL userMODEL) {
        this.userMODEL = userMODEL;
    }

    @Override
    public UserMODEL getModel() {
        return userMODEL;
    }
}