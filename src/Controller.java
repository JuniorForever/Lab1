import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view = new View();
    private Model model = new Model();
    public Controller(){
            view.button.addActionListener(new ButtonEventListener());
    }

    public void setView(Container pane){
            view.addComponentsToPane(pane);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            view.setRoot(model.getRoot(view.getAddend(), view.getResult(), view.getIntervalA(), view.getIntervalB()));
        }
    }
}
