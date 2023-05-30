/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB2.Models;

import com.p2.TRAB1.abstratas.Pessoa;
import com.p2.TRAB2.Menu1;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class PessoasModel extends AbstractListModel implements ComboBoxModel {
    private Pessoa selecionado;
    
    @Override
    public int getSize() {
        return Menu1.pessoas.size();
    }

    @Override
    public Object getElementAt(int index) {
        return Menu1.pessoas.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selecionado = (Pessoa) anItem;
        fireContentsChanged(Menu1.pessoas, 0, Menu1.pessoas.size());
    }

    @Override
    public Object getSelectedItem() {
        return this.selecionado;
    }
    
}
