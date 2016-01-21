/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.text.spi;

import java.util.Optional;

/**
 *
 * @author simone
 */
public interface TextServiceStateless {
    
    public  Optional<String> getText(String uri);

}
