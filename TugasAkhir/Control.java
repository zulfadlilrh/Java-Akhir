/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

import Model.Pendataan;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import view.PendaftaranVlaza;

/**
 *
 * @author Acer
 */
public class Control {
    private PendaftaranVlaza vlaza;
    private Pendataan pdt;
    
    public Control(PendaftaranVlaza vlaza){
        this.vlaza = vlaza;
    }
    public void opload (){
        pdt = new Pendataan();
        pdt.setNama(vlaza.getnama().getText());
        pdt.setNopendaftaran(vlaza.getnopendaftaran().getText());
        pdt.setUmur(Integer.parseInt(vlaza.getumur().getText()));
        pdt.setTujuan(vlaza.gettujuan().getText());
        if (vlaza.getpria().isSelected()  && !vlaza.getwanita().isSelected()){
            pdt.setJk("pria");
        } else if (!vlaza.getpria().isSelected()  && !vlaza.getwanita().isSelected()) {
            pdt.setJk("wanita");
        }
        JOptionPane.showMessageDialog(vlaza,pdt.getNama()+"\n"+pdt.getNopendaftaran()+"\n"+pdt.getJk()+"\n"+pdt.getTujuan());
        pdt.getJk();
    }
}
