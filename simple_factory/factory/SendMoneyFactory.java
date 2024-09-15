package factory;

import enums.UserTypeEnum;
import user.AppUser;
import user.BeneficiaryUser;
import user.User;

public class SendMoneyFactory {
    public static User getSendMoney(UserTypeEnum userType) {
        switch (userType) {
            case APP_USER:
                return new AppUser();
            case BENEFICIARY:
                return new BeneficiaryUser();
            default:
                return null;
        }
    }
}