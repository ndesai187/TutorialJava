/**
 * Created by Nirav on 09/08/16.
 */
public class UsersList {

    private int id;
    private String name;
    private String country;

    public void setId(int idvalue){
        id = idvalue;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountry (String country){
        this.country = country;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCountry (){
        return country;
    }

    public UsersList(int id, String name, String country){
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public UsersList(){
        // do nothing
    }

}