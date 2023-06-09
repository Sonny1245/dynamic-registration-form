package com.sonny.java.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
    
    @NotBlank(message="*Cannot be blank")
    @Size(min=3, max=15, message="*Your name is between 3-15 chars")
    private String userName;
    
    @NotBlank(message="*Cannot be empty")
    @Size(min=3, max=15, message="*Crush name is between 3-15 chars")
    private String crushName;
    
    @AssertTrue(message = "Agree to check the box")
    private boolean termAndCondition;
    
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCrushName() {
        return crushName;
    }
    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }
    
    public boolean isTermAndCondition() {
        return termAndCondition;
    }
    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }
    @Override
    public String toString() {
        return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
    }
    
    

}
