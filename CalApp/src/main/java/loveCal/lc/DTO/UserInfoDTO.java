package loveCal.lc.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
public class UserInfoDTO {
    
    
    @NotBlank(message ="*Please enter your user name")
    @Size(min=2, max=9, message="*User characters should be between 2-9")
    private String userName;
    
    
    @NotBlank(message ="*Please enter your last name")
    @Size(min=2, max=9, message="*Last name characters should be between 2-9")
    private String lastName;
    
    @AssertTrue(message="*Please click the box to agree")
    private boolean termAndCondition;
    
    private CommunicationDTO communication;
    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTermAndCondition() {
        return termAndCondition;
    }
    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }
    public CommunicationDTO getCommunication() {
        return communication;
    }
    public void setCommunication(CommunicationDTO communication) {
        this.communication = communication;
    }
    
    
    
    

}
