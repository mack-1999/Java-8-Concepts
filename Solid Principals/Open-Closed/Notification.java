class Notification implements NotifyService {
    @Override
    public void sendOpt(String medium) {
        if(medium.equals("email")) {
            System.out.println("Send OTP via Email");
        } else if(medium.equals("sms")) {
            System.out.println("Send OTP via SMS");
        } else if(medium.equals("whatsapp")) {
            System.out.println("Send OTP via WhatsApp");
        }
    }
}

/* Every time a new medium is added, you must modify this class. 
That’s a violation — class is not closed for modification. */