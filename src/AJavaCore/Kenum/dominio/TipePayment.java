package AJavaCore.Kenum.dominio;

public enum TipePayment {
    DEBITO {
        @Override
        public double decontCalc(double valor) {
            double desconto = valor * 0.12;
            return valor - desconto;
        }
    }, CREDITO {
        @Override
        public double decontCalc(double valor) {
            double desconto = valor * 0.4;
            return valor - desconto;
        }
    };

    public abstract double decontCalc(double valor);

}
