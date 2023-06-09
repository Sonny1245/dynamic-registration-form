package com.sonnyjava.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;





public class LCApplicationDTO {
    
    @NotBlank(message = " *User Name should not be blank")
    @Size(min = 3, max= 8, message="*User name should be between 3-8 characters")
    private String userName;
    @NotBlank(message = " *Crush Name should not be blank")
    @Size(min = 3, max= 8, message="*Crush name should be between 3-8 characters")
    private String crushName;
    @AssertTrue(message="*Please click the box")
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
        return "LCApplicationDTO [userName=" + userName + ", crushName=" + crushName + ", getUserName()="
                + getUserName() + ", getCrushName()=" + getCrushName() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }
    
   
}
