package Models;

/**
 * Created by Patrick on 11/23/2014.
 */
public class Bar {

    //Default Constructor
    public Bar(String name, String address, int rating){
        super();
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    private String name;
    private String address;
    private int rating;

    public String getName(){return name;}
    public String getAddress(){return address;}
    public int getRating(){return rating;}

    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}
    public void setRating(int rating){this.rating = rating;}

}
