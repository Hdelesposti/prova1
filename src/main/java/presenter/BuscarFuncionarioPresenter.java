
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscarFuncionarioView;

/**
 *
 * @author Heloiza
 */
public class BuscarFuncionarioPresenter {
    private BuscarFuncionarioView view;

    public BuscarFuncionarioPresenter(BuscarFuncionarioView view) {
        view = new BuscarFuncionarioView();
        
        
        this.view.getBtnBonus().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
        
        this.view.getBtnBuscar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
        
        this.view.getBtnFechar().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
        
        this.view.getBtnNovo().addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
            }    
        });
                
       
    }
    
    
    
    
}
