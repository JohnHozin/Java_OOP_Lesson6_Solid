package solid.isp;

public class TerminalPaymentService implements PayWebMoney,PayCreditCard {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

//    @Override
//    public void payPhoneNumber(int amount) {
//        throw new NotImplementedException();
//    }
}
