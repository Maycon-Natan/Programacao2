/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB2.Models;

import com.p2.TRAB1.normais.Diretor;
import com.p2.TRAB2.Menu1;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class DiretorModel extends AbstractListModel implements ComboBoxModel {
    private Diretor selecionado;
    
    @Override
    public int getSize() {
        return Menu1.diretores.size();
    }

    @Override
    public Object getElementAt(int index) {
        return Menu1.diretores.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selecionado = (Diretor) anItem;
        fireContentsChanged(Menu1.diretores, 0, Menu1.diretores.size());
    }

    @Override
    public Object getSelectedItem() {
        return this.selecionado;
    }
    
}
