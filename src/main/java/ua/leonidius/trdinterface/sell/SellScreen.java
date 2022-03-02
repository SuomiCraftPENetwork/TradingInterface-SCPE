package ua.leonidius.trdinterface.sell;

import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.element.ElementSlider;
import cn.nukkit.form.window.FormWindowCustom;
import ua.leonidius.trdinterface.ItemName;
import ua.leonidius.trdinterface.Message;
import ua.leonidius.trdinterface.screens.Screen;
import ua.leonidius.trdinterface.sell.Sell;

/**
 * Created by Leonidius20 on 09.07.18.
 */
public class SellScreen extends FormWindowCustom implements Screen {

    String id;

    public SellScreen(String id, int amount) {
        super(Message.WDW_SELL_TITLE.getText(ItemName.get(id)));
        this.id = id;

        addElement(new ElementSlider(Message.WDW_BUY_AMOUNT.getText(), 1, amount, 1, 1));
    }

    public void onResponse(PlayerFormRespondedEvent event) {
        int amount = (int)getResponse().getSliderResponse(0);
        Sell.sellItem(event.getPlayer(), id, amount);
    }
}
