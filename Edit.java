package builder;

public class Edit extends Component{
    private String text;

    public Edit() {
        super.setName("PoleTekstowe");
    }

    public String getText() {
        return text;
    }

    public void setText(String placeholder) {
        this.text = placeholder;
    }

    @Override
    public String toString() {
        return super.getName() + "{" +
                "tekst  = ' " + text + " '" +
                '}';
    }
}
