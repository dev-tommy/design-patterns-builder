package builder;

public class ContactFormBuilder implements FormBuilder{
    Form newForm;

    public ContactFormBuilder() {
        newForm = new Form();
    }

    @Override
    public void addTitle() {
        newForm.addTitle("Formularz kontaktowy");
    }

    @Override
    public void addComponents() {
        Label label = new Label();
        label.setText("Imię i nazwisko");
        newForm.addComponent(label);

        Edit edit = new Edit();
        edit.setText("Wpisz swoje imię i nazwisko");
        newForm.addComponent(edit);

        Label label2 = new Label();
        label2.setText("Wiadomość");
        newForm.addComponent(label2);

        Edit edit2 = new Edit();
        edit2.setText("Wpisz wiadomość");
        newForm.addComponent(edit2);
    }

    @Override
    public void addCaptcha() {
        Captcha captcha = new Captcha();
        captcha.setText("reCAPTCHAv2");
        newForm.addComponent(captcha);
    }

    @Override
    public void addSendButton() {
        Button button = new Button();
        button.setText("Wyślij");
        newForm.addComponent(button);
    }

    @Override
    public Form getForm() {
        return newForm;
    }

    @Override
    public String toString() {
        return "ContactFormBuilder{" +
                "newForm=" + newForm +
                '}';
    }
}
