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

    public String toString(){
        return "( id is : " + this.id + " | name is : " + this.name  + " | country is : " + this.country + " )";
    }


    public UsersList(){
        // do nothing
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersList usersList = (UsersList) o;

        if (getId() != usersList.getId()) return false;
        if (!getName().equals(usersList.getName())) return false;
        return getCountry().equals(usersList.getCountry());

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getCountry().hashCode();
        return result;
    }
}
