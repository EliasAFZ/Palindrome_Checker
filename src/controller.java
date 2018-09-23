import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Manages the flow of the entire program and works with model and view
 * @author Elias
 */
public class controller {

    private view v;
    private model m;

    /**
     *  constructor initializes data
     * @param v
     * @param m
     */
    public controller(view v, model m) {
        this.v = v;
        this.m = m;
        this.v.addViewButtonListener(new submitListener());
    }

    /**
     *  interclass allows controller to have encapsulated control
     *  entire program control work-flow is managed here
     */
    class submitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            try {
                m.load(v.getUserInput().toLowerCase());
                m.palinCheck();
                v.displayAnswer(m.getPalinVal());

            } catch (Exception ex) {
                v.displayErrorMessage("Please enter a String");
            }
        }

    }

}
