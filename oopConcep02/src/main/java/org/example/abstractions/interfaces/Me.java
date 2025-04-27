package org.example.abstractions.interfaces;

public class Me  implements Mom ,Dad {

    // 10. multiple inheritance in interface
    @Override
    public void hi() {
        System.out.println("from amma");
    }

    @Override
    public void kohomada() {
        System.out.println("from thaththa");
    }
}
