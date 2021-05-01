
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaInicialView;

/**
 *
 * @author Heloiza
 */
public class TelaInicialPresenter {
    private TelaInicialView view;    
    

    public TelaInicialPresenter() {
        this.view = new TelaInicialView();
        this.view.setVisible(true);        
        
        this.view.getMenuSalario().addActionListener(new ActionListener() { 
            private CalcularSalarioPresenter presenter;
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.abrir();               
            }
        });
        
        this.view.getMenuFuncionario().addActionListener(new ActionListener() {
            private ManterFuncionarioPresenter presenter;
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.abrir();
            }
        });
        
        this.view.getMenuFerramenta().addActionListener(new ActionListener() {
            private BuscarFuncionarioPresenter presenter;
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.abrir();
                
            }
        });
    }
    
    
    
    
}
