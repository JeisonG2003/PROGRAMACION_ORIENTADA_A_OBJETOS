package SEMANA_2;

public class Técnicas_de_Programación {

    //  Abstracción
    static class Trabajador {
        private String nombre;
        private String area;
        private int experiencia;

        public Trabajador(String nombre, String area, int experiencia) {
            this.nombre = nombre;
            this.area = area;
            this.experiencia = experiencia;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Area: " + area);
            System.out.println("Anos de experiencia: " + experiencia);
        }

        public void aplicarMejora() {
            experiencia++;
            System.out.println("Se ha incrementado un año de experiencia.");
        }
    }

    //  Encapsulación
    static class Certificado {
        private boolean tieneCertificado;

        public Certificado(boolean tieneCertificado) {
            this.tieneCertificado = tieneCertificado;
        }

        public boolean isCertificadoValido() {
            return tieneCertificado;
        }

        public void actualizarCertificado(boolean nuevoEstado) {
            this.tieneCertificado = nuevoEstado;
        }
    }

    //  Herencia
    static class Ingeniero extends Trabajador {
        private Certificado certificado;

        public Ingeniero(String nombre, String area, int experiencia, boolean tieneCertificado) {
            super(nombre, area, experiencia);
            this.certificado = new Certificado(tieneCertificado);
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Certificacion internacional: " + (certificado.isCertificadoValido() ? "Si" : "No"));
        }

        @Override
        public void aplicarMejora() {
            System.out.println("El ingeniero ha completado una capacitacion tecnica.");
            super.aplicarMejora();
        }
    }

    static class Mecanico extends Trabajador {
        private String especialidad;

        public Mecanico(String nombre, String area, int experiencia, String especialidad) {
            super(nombre, area, experiencia);
            this.especialidad = especialidad;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Especialidad tecnica: " + especialidad);
        }

        @Override
        public void aplicarMejora() {
            System.out.println("El mecanico ha adquirido una nueva habilidad.");
            super.aplicarMejora();
        }
    }

    //  Método principal
    public static void main(String[] args) {
        // Abstracción
        System.out.println("🧪 Abstraccion:");
        Trabajador trabajador = new Trabajador("Luis", "General", 3);
        trabajador.mostrarInformacion();

        // Encapsulación
        System.out.println("\n🧪 Encapsulacion:");
        Certificado cert = new Certificado(true);
        System.out.println("¿Certificado valido?: " + (cert.isCertificadoValido() ? "Si" : "No"));
        cert.actualizarCertificado(false);
        System.out.println("¿Certificado actualizado?: " + (cert.isCertificadoValido() ? "Si" : "No"));

        // Herencia
        System.out.println("\n🧪 Herencia:");
        Ingeniero ing = new Ingeniero("Carlos", "Sistemas", 5, true);
        Mecanico mec = new Mecanico("Maria", "Automotriz", 8, "Soldadura avanzada");
        ing.mostrarInformacion();
        mec.mostrarInformacion();

        // Polimorfismo
        System.out.println("\n🧪 Polimorfismo:");
        Trabajador[] personal = {new Ingeniero("Ana", "Industrial", 6, false), new Mecanico("Pedro", "Mecanica", 4, "Electricidad")};
        for (Trabajador t : personal) {
            t.aplicarMejora();  // comportamiento diferente según tipo real
        }
    }
}
