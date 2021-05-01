package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CalcularSalarioView;

/**
 *
 * @author Heloiza
 */
public class CalcularSalarioPresenter {
    private CalcularSalarioView view;

    public CalcularSalarioPresenter() {
        view = new CalcularSalarioView();     
        
        this.view.getBtnBuscar().addActionListener(new ActionListener() {             
            @Override
            public void actionPerformed(ActionEvent e) {
                              
            }
        });
        
        this.view.getBtnCalcular().addActionListener(new ActionListener() {             
            @Override
            public void actionPerformed(ActionEvent e) {
                              
            }
        });
        
        this.view.getBtnFechar().addActionListener(new ActionListener() {             
            @Override
            public void actionPerformed(ActionEvent e) {
                              
            }
        });
        
        this.view.getBtnListar().addActionListener(new ActionListener() {             
            @Override
            public void actionPerformed(ActionEvent e) {
                              
            }
        });
                
    }
    
    public void abrir(){
        view.setVisible(true);
    }
    
    
}
