package com.traffic_lights.input;

/**
 * Interface of a button used by input components and provied by user components.
 *
 * @author Andr&eacute; Bauer
 */
public interface Button {

    /**
     * Push the button, the internal state of the button should be switched to a state,
     * that represents the fact hat it has been pushed.
     */
    void push();

}

