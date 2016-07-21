/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.text.api;

import it.cnr.ilc.lc.omega.core.OmegaCore;
import it.cnr.ilc.lc.omega.text.spi.TextServiceStatefull;
import it.cnr.ilc.lc.omega.text.spi.TextServiceStateless;
import java.util.Optional;
import sirius.kernel.Setup;
import sirius.kernel.Sirius;
import sirius.kernel.di.std.Part;
import sirius.kernel.di.std.Register;

/**
 *
 * @author simone
 */
@Register(classes = TextService.class)
public final class TextService {

    @Part
    private static TextServiceStatefull serviceStatefull;
    
    @Part
    private static TextServiceStateless serviceStateless;
    
    public void createText(String text, String uri) {

        serviceStatefull.createText(text, uri);
    }

    public Optional<String> getText(String uri) {// stateless

        return serviceStateless.getText(uri);

    }

    public String getText() { // statefull

        return serviceStatefull.getText();

    }

    public static void main(String[] args) {
        
        Setup.createAndStartEnvironment(ClassLoader.getSystemClassLoader());
        TextService service = new TextService();
        service.createText("bobbe", "malle 2");
        
        Sirius.stop();
        
    }
}
