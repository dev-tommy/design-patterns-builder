package builder;

public class AddressFormBuilder implements FormBuilder{
    Form newForm;

    public AddressFormBuilder() {
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
        edit.setText("");
        newForm.addComponent(edit);

        Label label2 = new Label();
        label2.setText("Ulica");
        newForm.addComponent(label2);

        Edit edit2= new Edit();
        edit2.setText("");
        newForm.addComponent(edit2);

        Label label3 = new Label();
        label3.setText("Miejscowość");
        newForm.addComponent(label3);

        Edit edit3 = new Edit();
        edit3.setText("");
        newForm.addComponent(edit3);
    }

    @Override
    public void addCaptcha() {

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