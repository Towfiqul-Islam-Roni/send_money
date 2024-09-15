package send_money;

import enums.UserTypeEnum;

public class SendNPSB implements Send{
    public void sendMoney(UserTypeEnum userType){
        System.out.println("Sending money through NPSB to + " + userType.label);
    }
}
