/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB2.Models;

import com.p2.TRAB1.normais.SecAcademica;
import com.p2.TRAB2.Menu1;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class SecAModel extends AbstractListModel implements ComboBoxModel{
    private SecAcademica selecionado;
    
    @Override
    public int getSize() {
        return Menu1.ACsecretarios.size();
    }

    @Override
    public Object getElementAt(int index) {
        return Menu1.ACsecretarios.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selecionado = (SecAcademica) anItem;
        fireContentsChanged(Menu1.ACsecretarios, 0, Menu1.ACsecretarios.size());
    }

    @Override
    public Object getSelectedItem() {
        return this.selecionado;
    }
    
}
