public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        DataValidation data = new DataValidation("2022_JavaClasses","SeeYouMan_2022","SeeYouMan_2022");
        DataValidation data2 = new DataValidation("45Man_t","SeeYouMan&^%$#@!=2022","SeeYouMan&^%$#@!=2022");
        DataValidation.checkReg(data);
        DataValidation.checkReg(data2);// не верный пароль.

    }
}