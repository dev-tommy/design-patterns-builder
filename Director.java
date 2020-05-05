package builder;

public class Director {
    private FormBuilder formBuilder;

    public Director(FormBuilder builder) {
        formBuilder = builder;
    }

    public void createForm() {
        formBuilder.addTitle();
        formBuilder.addComponents();
        formBuilder.addCaptcha();
        formBuilder.addSendButton();
    }
}
