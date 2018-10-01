/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex003;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author franz
 */
public class AppointmentModell extends AbstractListModel
{
    private ArrayList<Appointment> termine = new ArrayList<>();
    
    @Override
    public int getSize() {
        return termine.size();
    }

    @Override
    public Object getElementAt(int index) {
        return termine.get(index);
    }

    public void addTermin(Appointment m) {
        termine.add(m);
        super.fireContentsChanged(termine, 0, termine.size() - 1);
    }

    public void deleteTermin(int x []) {
        for(int i = x.length -1; i > -1; i--)
        {
            termine.remove(x[i]);
        }
        super.fireContentsChanged(termine, 0, termine.size() -1);
    }
    
}
