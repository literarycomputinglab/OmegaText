/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.text.spi;

/**
 *
 * @author simone
 */
public interface TextServiceStatefull {
    
    public void createText(String Text, String URI);
 
    public  String getText();

}
