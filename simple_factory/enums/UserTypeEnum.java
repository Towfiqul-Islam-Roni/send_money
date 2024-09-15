package enums;
public enum UserTypeEnum {
    APP_USER("App User"),
    BENEFICIARY("Beneficiary"),
    NONE("None");

    public final String label;

    private UserTypeEnum(String label) {
        this.label = label;
    }
}
