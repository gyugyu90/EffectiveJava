package ch4.item22;

import java.util.List;

public class Envelope {



    void x() {
        System.out.println("Hello");
        StaticInner.y();
    }

    class Enclosure {
        void x() {
            Envelope.this.x();
        }
    }

    static class StaticInner {
        static void y() {
            Envelope envelope = new Envelope();
            envelope.x();
        }
    }

    void a(List<? extends Envelope> list) {

    }

    void b(List<? extends Protocol> list) {

    }


    interface Protocol {

    }


}
