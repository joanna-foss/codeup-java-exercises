package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String info){
        this.name = name;
        this.category = info;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(){
        this.category = category;
    }

    public void setName(){
        this.name = name;
    }
}
