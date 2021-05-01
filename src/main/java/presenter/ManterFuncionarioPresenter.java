package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ManterFuncionarioView;

/**
 *
 * @author Heloiza
 */
public class ManterFuncionarioPresenter {
    private ManterFuncionarioView view;

    public ManterFuncionarioPresenter(ManterFuncionarioView view) {
        view = new ManterFuncionarioView();
        
        this.view.getBtnEditar().addActionListener(new ActionListener() {            
            @Override
            public void actionPerformed(ActionEvent e) {
                             
            }
        });
        
        this.view.getBtnFechar().addActionListener(new ActionListener() {             
            @Override
            public void actionPerformed(ActionEvent e) {
                              
            }
        });
        
        this.view.getBtnExcluir().addActionListener(new ActionListener() {             
            @Override
            public void actionPerformed(ActionEvent e) {
                               
            }
        });
        
        this.view.getBtnSalvar().addActionListener(new ActionListener() {            
            @Override
            public void actionPerformed(ActionEvent e) {
                              
            }
        });
          
    }
    
    public void abrir(){
        view.setVisible(true);
    }
    
    
    
    
}
