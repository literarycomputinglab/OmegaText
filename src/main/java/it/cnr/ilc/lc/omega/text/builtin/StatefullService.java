/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.text.builtin;

import it.cnr.ilc.lc.omega.core.ManagerAction;
import it.cnr.ilc.lc.omega.text.spi.TextServiceStatefull;
import it.cnr.ilc.lc.omega.core.datatype.Text;
import it.cnr.ilc.lc.omega.exception.InvalidURIException;
import java.net.URI;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simone
 */
public class StatefullService implements TextServiceStatefull {

    private Text text = null;

    private void setText(Text text) {
        this.text = text;
    }

    @Override
    public void createText(String text, String uri) {
        try {
            setText(Text.of(text, URI.create(uri)));
        } catch (ManagerAction.ActionException ex) {
            Logger.getLogger(StatefullService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidURIException ex) {
            Logger.getLogger(StatefullService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getText() {
        
        return text.toString();
    }

}
