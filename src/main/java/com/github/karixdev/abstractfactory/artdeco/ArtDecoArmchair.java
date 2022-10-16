package com.github.karixdev.abstractfactory.artdeco;

import com.github.karixdev.abstractfactory.Armchair;

public class ArtDecoArmchair implements Armchair {
    @Override
    public void sit() {
        System.out.println("You have sat on victorian armchair");
    }
}
