/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcEJB;

import javax.ejb.Stateless;

/**
 *
 * @author Student
 */
@Stateless
public class NameBean implements NameBeanRemote, NameBeanLocal {
    
    public String setMessage(String name){
        return "Welcome" + name + "to the EJB World";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
