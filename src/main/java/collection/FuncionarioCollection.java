
package collection;

import java.awt.List;
import java.util.ArrayList;
import model.Funcionario;
import observer.Observer;
import observer.Subject;



/**
 *
 * @author Heloiza
 */
public class FuncionarioCollection implements Subject {
     
    private ArrayList<Funcionario> funcionarios;
    private List<Observer> observers;
    private static FuncionarioCollection INSTANCE = null;
    private Funcionario funcionarioSelecionado;

    public FuncionarioCollection() {
        funcionarios = new ArrayList<>();
        this.observers = new ArrayList();
    }
    
    public static FuncionarioCollection instance() {
        if (INSTANCE == null) {
            INSTANCE = new FuncionarioCollection();
        }
        return INSTANCE;
    }
    
    
    
    

    
    
    
    
    
    
    
    
    @Override
    public void addSubject(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSubject(Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObservers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
