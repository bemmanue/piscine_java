package edu.school21.classes;

import edu.school21.interfaces.Renderer;
import edu.school21.interfaces.PreProcessor;

public class RendererStandardImpl implements Renderer {
    PreProcessor    preProcessor;

    public RendererStandardImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void render(String string) {
        string = preProcessor.process(string);
        System.out.println(string);
    }
}
