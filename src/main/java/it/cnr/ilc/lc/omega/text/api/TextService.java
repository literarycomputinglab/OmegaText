/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.text.api;

import it.cnr.ilc.lc.omega.text.spi.TextServiceStatefull;
import it.cnr.ilc.lc.omega.text.spi.TextServiceStateless;
import java.util.Optional;

/**
 *
 * @author simone
 */
public final class TextService {

    private TextServiceStatefull serviceStatefull;
    private TextServiceStateless serviceStateless;

    public void createText(String text, String uri) {

        serviceStatefull.createText(text, uri);
    }

    public Optional<String> getText(String uri) {// stateless

        return serviceStateless.getText(uri);

    }

    public String getText() { // statefull

        return serviceStatefull.getText();

    }

}
