package builder;

public class Captcha extends Component{
    private String text;

    public Captcha() {
        super.setName("Captcha");
    }
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.getName() + "{" +
                "tekst = ' " + text + " '" +
                '}';
    }
}
