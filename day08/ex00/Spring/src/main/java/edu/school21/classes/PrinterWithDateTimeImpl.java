package edu.school21.classes;

import edu.school21.interfaces.Printer;
import edu.school21.interfaces.Renderer;
import java.time.LocalDateTime;

public class PrinterWithDateTimeImpl implements Printer {
    final private Renderer  renderer;
    private LocalDateTime   time;

    public PrinterWithDateTimeImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public void print(String string) {
        if (time == null) {
            renderer.render(string);
        } else {
            renderer.render(time + " " + string);
        }
    }
}
