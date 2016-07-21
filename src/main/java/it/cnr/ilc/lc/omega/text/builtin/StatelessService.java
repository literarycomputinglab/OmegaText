/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.text.builtin;

import it.cnr.ilc.lc.omega.core.ManagerAction;
import it.cnr.ilc.lc.omega.text.spi.TextServiceStateless;
import it.cnr.ilc.lc.omega.core.datatype.Text;
import java.net.URI;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import sirius.kernel.di.std.Register;

/**
 *
 * @author simone
 */
@Register (classes = TextServiceStateless.class)
public class StatelessService implements TextServiceStateless {

    @Override
    public Optional<String> getText(String uri) {

        try {
            Text text = Text.load(URI.create(uri));
            return Optional.of(text.toString());
        } catch (ManagerAction.ActionException ex) {
            Logger.getLogger(StatelessService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex1) {
            Logger.getLogger(StatelessService.class.getName()).log(Level.SEVERE, null, ex1);
        }

        return Optional.empty();
    }

}
