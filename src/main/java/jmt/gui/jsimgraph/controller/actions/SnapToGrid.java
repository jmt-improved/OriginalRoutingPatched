package jmt.gui.jsimgraph.controller.actions;

import jmt.gui.jsimgraph.controller.Mediator;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Created by raffaele on 1/26/17.
 */
public class SnapToGrid extends AbstractJmodelAction {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Defines an <code>Action</code> object with a default
     * description string and default icon.
     */
    public SnapToGrid(Mediator mediator) {
        super("Snap components to grid", "snap", mediator);
        putValue(SHORT_DESCRIPTION, "Snap components to grid");
        putValue(MNEMONIC_KEY, new Integer(KeyEvent.VK_S));
        setEnabled(false);
    }

    /**
     * Invoked when an action occurs.
     */
    boolean repeat = false;

    public void actionPerformed(ActionEvent e) {
        mediator.trySnapToGrid();
    }
}
