package loveCal.lc.DTO;

import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
public class CommunicationDTO {
    
    @NotBlank(message="*Cannot be blank!")
    private String email;
    
    private Phone phone;
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
