package builder;

public class Button extends Component{
    private String text;

    public Button() {
        super.setName("Przycisk");
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
