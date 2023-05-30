/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB2.Models;

import com.p2.TRAB1.interfaces.Conta;
import com.p2.TRAB2.Menu1;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class ContaModel extends AbstractListModel implements ComboBoxModel {
    private Conta contaselect;
    
    @Override
    public int getSize() {
        return Menu1.contas.size();
    }

    @Override
    public Object getElementAt(int index) {
        return Menu1.contas.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.contaselect = (Conta) anItem;
        fireContentsChanged(Menu1.contas, 0, Menu1.contas.size());
    }

    @Override
    public Object getSelectedItem() {
        return this.contaselect;
    }
    
}
