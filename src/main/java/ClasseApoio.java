
import model.Funcionario;


/**
 *
 * @author Heloiza
 */
public class ClasseApoio {
      private Funcionario funcionario;
    
    // método calculo bonus assiduidade
    
    public double calculaBonusAssiduidade(){
      double salarioBase = funcionario.getSalarioBase();
      
         if (funcionario.getFalta() == 0) 
         {
             double percentual = 10/100;             
             double salario = salarioBase + (salarioBase*percentual);
         } else 
         {
             if (funcionario.getFalta() >=1) && (funcionario.getFalta <= 3)
             {
             double percentual = 5/100;
             double salario = salarioBase + (salarioBase*percentual);
             } else
             {
             if (funcionario.getFalta()>=4)
             {
             double percentual = 1/100;
             double salario = salarioBase + (salarioBase*percentual);        
                     
            }
                     
         
         }
     
    
        return salario;
    
    }
    
    
     // método calculo bonus por tempo de serviço
    
    public double calculaBonusTempo(){
    
    
        return 0;
    
    }
    
    
     // método calculo bonus por falta
    
    public double calculaBonusPorFilho(){
    
    
        return 0;
    
    }
    
     // método calculo bonus idade
    
    public double calculaBonusIdade(){
    
    
        return 0;
    
    }
    
    
    
    
 
}
