package Hotel.Booking.modules;

import javax.persistence.Id;

public class Booking {

    @Id
    public String id;

    public String name;

    public String email;

    public Boolean checked;

    public Booking(String name, String email) {
        this.name = name;
        this.email = email;
        this.checked = false;
    }

    public Booking(){

    }

    @Override
    public String toString() {
        return  String.format(
                "Customer[id=%s, name='%s', email='%s', checked='%s']",
                id, name, email, checked);

    }

}
