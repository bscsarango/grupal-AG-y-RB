/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redBayesiana;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openmarkov.core.exception.ParserException;
import org.openmarkov.core.model.network.ProbNet;
import org.openmarkov.core.model.network.ProbNode;
import org.openmarkov.io.probmodel.PGMXReader;

/**
 *
 * @author barcelona
 */
public class LeerRedJugador {
    final private String bayesnetwork_name ="BN-two-diseases.pgmx";
     final public static List<String> lis = new ArrayList<String>();
     
     
     public void leer() throws ParserException{
        try {
            InputStream file = new FileInputStream("D:\\BORYS\\9MODULO\\Sistemas inteligentes\\Redes B grupal\\jugadores_grupal.pgmx");
            
           PGMXReader pgmxrd = new PGMXReader();
           ProbNet probnet = pgmxrd.loadProbNet(file, bayesnetwork_name).getProbNet();
           List<ProbNode> lista = probnet.getProbNodes();
            for (int i = 0; i < lista.size(); i++) {
                ProbNode probnode = lista.get(i);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerRedJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     
     }
}
