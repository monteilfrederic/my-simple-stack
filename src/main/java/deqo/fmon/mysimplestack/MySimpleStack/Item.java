package deqo.fmon.mysimplestack.MySimpleStack;

public class Item {

    private Object value;

    /* created by monteilfrederic on 25/10/19.

    Commentaire répondant à l'éxigence 1.

     */

    Item(Object value) {

        setValue(value);

    }

    public Object getValue() {

        return value;

    }

    public void setValue(Object value) {

        this.value=value;

    }

}
