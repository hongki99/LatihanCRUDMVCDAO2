/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mhongkialfikram.latihanmvcjdbc.event;

import edu.mhongkialfikram.latihanmvcjdbc.entity.Pelanggan;
import edu.mhongkialfikram.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Administrator
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
    public void onInsert(Pelanggan pelanggan);
    
}
