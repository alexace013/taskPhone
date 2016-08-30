package phone;

public class IPhone extends Phone {

    public IPhone() {
    }

    public IPhone(int screen, boolean touchStatus, boolean wifiStatus) {
        super(screen, touchStatus, wifiStatus);
    }

    @Override
    public void call(String phoneNumber) {
        super.call(String.format("call from IPhone on %s number", phoneNumber));
    }

    @Override
    public void sendMessage(String phoneNumber, String textMessage) {
        super.sendMessage(phoneNumber, String.format("send message from IPhone on %s with text < %s >", phoneNumber, textMessage));
    }
}
