package edu.school21.classes;

import edu.school21.interfaces.Renderer;
import edu.school21.interfaces.PreProcessor;

public class RendererErrImpl implements Renderer {
    PreProcessor    preProcessor;

    public RendererErrImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void render(String string) {
        string = preProcessor.process(string);
        System.err.println(string);
    }
}
