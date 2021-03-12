package fx_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AppController {

    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Label displayLabel;
    public AppController(){
        super();
    }
    public void onButtonClick(ActionEvent actionEvent) {
        if(isBasicImplementationSelected()){
            ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
            IMetier metier = context.getBean(IMetier.class);
            setDisplayLabel("with basic implementation " + metier.calcul());
        }else if(isMysqlImplementationSelected()) {
            ApplicationContext context = new AnnotationConfigApplicationContext("ext", "metier");
            IMetier metier = context.getBean(IMetier.class);
            setDisplayLabel("with mysql implementation " + metier.calcul());
        }
    }
    public boolean isBasicImplementationSelected(){
        if(choiceBox.getSelectionModel().getSelectedIndex()==0)
            return true;
        return false;
    }
    public boolean isMysqlImplementationSelected(){
        if(choiceBox.getSelectionModel().getSelectedIndex()==1)
            return true;
        return false;
    }
    public void setDisplayLabel(String result){
        this.displayLabel.setText(result);
    }
}
