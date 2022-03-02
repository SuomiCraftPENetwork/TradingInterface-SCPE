/*
 * A button, which represents an item available for buying
 * and stores stores an id, a meta and a price of the item.
 * Created by Leonidius20 on 26.06.18.
 * This class is a part of "Trading Interface".
 */
package ua.leonidius.trdinterface.elements;

import cn.nukkit.form.element.ElementButton;
import ua.leonidius.trdinterface.ItemName;
import ua.leonidius.trdinterface.Message;
import ua.leonidius.trdinterface.Trading;

public class ItemButton extends ElementButton {

    private String id;

    // For EditCategoryScreen
    public ItemButton(String id) {
        super(ItemName.get(id));
        this.id = id;
        //addItemIcon(id);
    }

    public ItemButton(String id, double price) {
        super(Message.BTN_ITEM_BUY.getText(ItemName.get(id), price, Trading.settings.currency));
        this.id = id;
        //addItemIcon(id);
    }

    public ItemButton(String id, double price, int discount) {
        super(Message.BTN_ITEM_BUY_SALE.getText(ItemName.get(id), price, Trading.settings.currency, discount));
        this.id = id;
        //addItemIcon(id);
    }

    /*private void addItemIcon(String id) {
        File image = new File(Trading.imageFolder, id+".png");
        if (image.exists()) {
            addImage(new ElementButtonImageData(ElementButtonImageData.IMAGE_DATA_TYPE_PATH, image.getPath()));
        }
    }*/

    public String getStringId() {
        return id;
    }

}
