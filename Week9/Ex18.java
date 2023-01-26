package Week9;

import Week9.moving.domain.Box;
import Week9.moving.domain.Item;
import Week9.moving.domain.Thing;
import Week9.moving.logic.Packer;

import java.util.ArrayList;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {

        List<Thing> things = new ArrayList<>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrush", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        Packer packer = new Packer(10);

        List<Box> boxes = packer.packThings( things );

        System.out.println("Number of boxes: "+boxes.size());

        for (Box box : boxes) {
            System.out.println("Items in the box: "+box.getVolume()+" dm^3");
            System.out.println(box);
        }
    }
}
