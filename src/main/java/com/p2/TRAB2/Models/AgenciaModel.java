/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB2.Models;

import com.p2.TRAB1.normais.Agencia;
import com.p2.TRAB2.Menu1;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class AgenciaModel extends AbstractListModel implements ComboBoxModel {
    private Agencia selecionado;
    
    @Override
    public int getSize() {
        return Menu1.agencias.size();
    }

    @Override
    public Object getElementAt(int index) {
        return Menu1.agencias.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selecionado = (Agencia) anItem;
        fireContentsChanged(Menu1.agencias, 0,Menu1.agencias.size());
    }

    @Override
    public Object getSelectedItem() {
        return this.selecionado;
    }
    
}
