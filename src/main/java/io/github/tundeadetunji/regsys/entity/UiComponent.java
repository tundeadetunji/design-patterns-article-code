package io.github.tundeadetunji.regsys.entity;

import io.github.tundeadetunji.regsys.strategy.IThemeStrategy;

public class UiComponent {
    private IThemeStrategy strategy;

    public UiComponent(IThemeStrategy strategy) {
        this.strategy = strategy;
        setTheme();
    }

    public void setStrategy(IThemeStrategy strategy){
        this.strategy = strategy;
    }

    public void setTheme(){
        strategy.paintUiComponent(this);
    }

    public void attendToOtherThings(){
        //assuming user is busy using the application...
    }
}
