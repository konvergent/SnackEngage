package org.ligi.snackengage.snacks;

import org.ligi.snackengage.R;

public class BetaTestSnack extends OpenURLSNack {

    public BetaTestSnack(final String uriString) {
        super(uriString);
    }

    @Override
    public int getText() {
        return R.string.betatest_snack_msg;
    }

    @Override
    public int getActionText() {
        return R.string.betatest_snack_action;
    }


}
