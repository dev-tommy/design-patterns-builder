package builder;

public class BuilderTest {
    public static void main(String[] args) {
        FormBuilder builder = new ContactFormBuilder();
        Director director = new Director(builder);
        director.createForm();
        Form form = builder.getForm();
        System.out.println(form);

        builder = new AddressFormBuilder();
        director = new Director(builder);
        director.createForm();
        form = builder.getForm();
        System.out.println(form);
    }
}
