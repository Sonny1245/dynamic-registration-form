package loveCal.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import loveCal.lc.DTO.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

    @Override
    public String print(Phone object, Locale locale) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Phone parse(String phoneList, Locale locale) throws ParseException {
        
        Phone phone = new Phone();
  
        String[] phoneNumbers = phoneList.split("-");
        
        int index = phoneList.indexOf('-');
        
        if(index == -1) {
            
            phone.setDialNumber("1");
            phone.setZipCodeNumbers(phoneNumbers[0]);
            phone.setFirstThreeNumbers(phoneNumbers[1]);
            
            
        }else {
            
            phone.setDialNumber(phoneNumbers[0]);
            phone.setZipCodeNumbers(phoneNumbers[1]);
            phone.setFirstThreeNumbers(phoneNumbers[2]);
            phone.setLastFourNumbers(phoneNumbers[3]); 
                
        }
         
        return phone;
        
    }

}
