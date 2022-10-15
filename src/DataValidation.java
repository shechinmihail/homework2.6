import java.lang.invoke.WrongMethodTypeException;

public class DataValidation {
    private final String login;
    private final String password;
    private final String confirmPassword;

    static final String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_]).{1,20}$";

    public DataValidation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean checkReg(DataValidation dataValidation) throws WrongPasswordException, WrongLoginException {
        if (dataValidation.login.matches(check) && !dataValidation.login.isBlank()) {
            System.out.println("Логин указан верно");
        } else {
            throw new WrongLoginException("Логин указан не верно");
        }
        if (dataValidation.password != null && !dataValidation.password.isBlank() && dataValidation.getPassword().matches(check) &&
                dataValidation.getPassword().equals(dataValidation.getConfirmPassword())) {
            System.out.println("Пароль принят");
        } else {
            throw new WrongPasswordException("Пароль неверный");
        }
        return false;
    }
}


