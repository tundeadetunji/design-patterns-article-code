package io.github.tundeadetunji.regsys;

import io.github.tundeadetunji.regsys.entity.UiComponent;
import io.github.tundeadetunji.regsys.strategy.GreenStrategy;
import io.github.tundeadetunji.regsys.strategy.RedStrategy;

import java.util.List;
import java.util.Stack;

public class Start {
    public static void main(String[] args) {
        UiComponent component = new UiComponent(new RedStrategy());
        //component is red
        component.attendToOtherThings();
        //user decides to change to green theme and presses button
        //button should change the theme to green
        //the next two lines are called from the button
        component.setStrategy(new GreenStrategy());
        //from now on, it'll be green
        component.setTheme();
        //as usual
        component.attendToOtherThings();
        //...

    }
}