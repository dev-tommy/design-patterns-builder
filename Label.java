package builder;

public class Label extends Component{
    private String text;

    public Label() {
        super.setName("Etykieta");
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
