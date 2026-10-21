import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        int sum = 0;
        for (Title t : titles) {
            sum += t.calculateRoyalty();
        }
        return Math.round(sum * 100.0) / 100.0; //Afrunder beløbet til 2 decimaler
    }

    public String getName() {
        return name;
    }
}
