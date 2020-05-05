package builder;

public interface FormBuilder {
    void addTitle();
    void addComponents();
    void addCaptcha();
    void addSendButton();
    Form getForm();
}

