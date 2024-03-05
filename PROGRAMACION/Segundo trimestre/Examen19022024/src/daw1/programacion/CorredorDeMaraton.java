package daw1.programacion;

/*public class Corredor {

    //atributos

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private float velocidadMaxima;
    private int dorsal;
    private float peso;
    private float altura;

    //constructores

    public Corredor(String dni) {
        this.dni= generarDNI();

    }

    public Corredor(String dni, String nombre, String apellido1, String apellido2) {
        this(dni);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;

    }

    public Corredor(String dni, String nombre, String apellido1, String apellido2, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this(dni, nombre, apellido1, apellido2);
        this.diaNacimiento =diaNacimiento;
        this.mesNacimiento =mesNacimiento;
        this.anioNacimiento =anioNacimiento;


    }








    //Métodos

    private String generarDNI() {
        int numdni = generarNumDNI();

        char letraDNI = generarLetraDNI(numdni);

        return this.dni = String.valueOf(numdni + letraDNI);
    }


    private int generarNumDNI() {
        int numDni = 0;
        for (int i = 0; i < 8; i++) {
            int numAleatorio;
            if (i == 0) {
                numAleatorio = (int) (Math.random() * 9 + 1);
            } else {
                numAleatorio = (int) (Math.random() * 9);
            }
            numDni = numDni * 10 + numAleatorio;



        }
        return numDni;
    }

    private char generarLetraDNI (int numDNI){
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion= numDNI%23;

        return letras.charAt(posicion);
    }

    private boolean contieneNulo (String prueba){
        return prueba==null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (contieneNulo(nombre)) {
            throw new NullPointerException("nombre no válido");
        }
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        if (contieneNulo(apellido1)) {
            throw new NullPointerException("apellido1 no válido");
        }
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        if (contieneNulo(apellido2)) {
            throw new NullPointerException("apellido2 no válido");
        }
        this.apellido2 = apellido2;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        if (diaNacimiento<=0){
            throw new IllegalArgumentException("día no válidO");
        }

        if (diaNacimiento>31&&mesNacimiento==1||diaNacimiento>31&&mesNacimiento==3||diaNacimiento>31&&mesNacimiento==5||diaNacimiento>31&&mesNacimiento==7||diaNacimiento>31&&mesNacimiento==8||diaNacimiento>31&&mesNacimiento==10||diaNacimiento>31&&mesNacimiento==12){
            throw new IllegalArgumentException("día no válidO");
        }

        if (diaNacimiento>28&&mesNacimiento==2){
            throw new IllegalArgumentException("día no válidO");
        }

        if (diaNacimiento>30&&mesNacimiento==4||diaNacimiento>30&&mesNacimiento==6||diaNacimiento>30&&mesNacimiento==9||diaNacimiento>30&&mesNacimiento==11){
            throw new IllegalArgumentException("día no válidO");
        }

        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {

        if (mesNacimiento<=0||mesNacimiento>12){
            throw new IllegalArgumentException("mes no válido");
        }
        this.mesNacimiento = mesNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento<=1900){
            throw new IllegalArgumentException("año no válido");
        }
        this.anioNacimiento = anioNacimiento;
    }

    public String getDni() {
        return dni;
    }


    public int getDiaNacimiento() {
        return diaNacimiento;
    }


    public int getMesNacimiento() {
        return mesNacimiento;
    }


    public int getAnioNacimiento() {

        return anioNacimiento;
    }


    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        if (velocidadMaxima<=0f){
            throw new IllegalArgumentException("velocidad no válida");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getDorsal() {

        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal<=0f){
            throw new IllegalArgumentException("dorsal no válido");
        }
        this.dorsal = dorsal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {

        if (peso<=0f){
            throw new IllegalArgumentException("dorsal no válido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {

        if (altura<=0f){
            throw new IllegalArgumentException("dorsal no válido");
        }
        this.altura = altura;
    }

    public int getEdad(int anioNacimiento){

        int edad= getAnioNacimiento()-2024;

      return edad;
    }

    @Override
    public String toString() {
        return "Corredor{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", dni='" + dni + '\'' +
                ", diaNacimiento=" + diaNacimiento +
                ", mesNacimiento=" + mesNacimiento +
                ", anioNacimiento=" + anioNacimiento +
                ", velocidadMaxima=" + velocidadMaxima +
                ", dorsal=" + dorsal +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }*/


    public class CorredorDeMaraton {

        private String nombre;
        private String apellido;
        private final String dni;
        private final String fechaDeNacimiento;
        private float velocidadMaxima;
        private int dorsal;
        private float peso;
        private float altura;
        private int anyoNacimiento;



        public CorredorDeMaraton(String dni) throws Exception {
            if (comprobarDNI(dni)) {
                this.dni = dni;
            } else {
                throw new Exception("DNI no valido");
            }
            this.fechaDeNacimiento = "1/1/1990";
            this.anyoNacimiento = 1990;
        }

        public CorredorDeMaraton(String dni, String nombre, String apellido) throws Exception {
            this(dni);
            setNombre(nombre);
            setApellido(apellido);
        }

        public CorredorDeMaraton(String dni, String nombre, String apellido, String fechaDeNacimiento) throws Exception {
            if (comprobarDNI(dni)) {
                this.dni = dni;
            } else {
                throw new Exception("DNI no valido");
            }
            setNombre(nombre);
            setApellido(apellido);
            if (comprobarFechaDeNacimiento(fechaDeNacimiento)) {
                this.fechaDeNacimiento = fechaDeNacimiento;
            } else {
                throw new Exception("Fecha no valida");
            }
        }


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) throws Exception {
            if (nombre != null) {
                this.nombre = nombre;
            } else {
                throw new Exception("Nombre no valido");
            }
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) throws Exception {
            if (apellido != null) {
                this.apellido = apellido;
            } else {
                throw new Exception("Apellido no valido");
            }
        }

        public String getDni() {
            return dni;
        }

        public String getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        public float getVelocidadMaxima() {
            return velocidadMaxima;
        }

        public void setVelocidadMaxima(float velocidadMaxima) throws Exception {
            if (velocidadMaxima > 0) {
                this.velocidadMaxima = velocidadMaxima;
            } else {
                throw new Exception("velocidad no valida");
            }
        }

        public int getDorsal() {
            return dorsal;
        }

        public void setDorsal(int dorsal) throws Exception {
            if (dorsal > 0) {
                this.dorsal = dorsal;
            } else {
                throw new Exception("Dorsal no valido");
            }
        }

        public float getPeso() {
            return peso;
        }

        public void setPeso(float peso) throws Exception {
            if (peso > 0) {
                this.peso = peso;
            } else {
                throw new Exception("Peso no valido");
            }
        }

        public float getAltura() {
            return altura;
        }

        public void setAltura(float altura) throws Exception {
            if (altura > 0) {
                this.altura = altura;
            } else {
                throw new Exception("Altura no valida");
            }
        }


        private boolean comprobarDNI(String dni) {
            if (dni.length() != 9) {
                return false;
            }
            String numeros = dni.substring(0, 8);
            char letra = dni.charAt(8);

            for (int i = 0; i < numeros.length(); i++) {
                if (!Character.isDigit(numeros.charAt(i))) {
                    return false;
                }
            }
            String abecedario = "TRWAGMYFPDXBNJZSQVHLCKE";
            int numeroDNI = Integer.parseInt(numeros);
            int posLetra = numeroDNI % 23;
            if (letra != abecedario.charAt(posLetra)) {
                return false;
            }

            return true;
        }


        private boolean comprobarFechaDeNacimiento(String fechaDeNacimiento) {
            String diaSt = "";
            String mesSt = "";
            String anyoSt = "";
            int contador = 0;

            String[] fecha=fechaDeNacimiento.split("/");

            int dia=Integer.parseInt(fecha[0]);
            int mes=Integer.parseInt(fecha[1]);
            int anyo=Integer.parseInt(fecha[2]);


            /*for (int i = 0; i < fechaDeNacimiento.length(); i++) {
                if (fechaDeNacimiento.charAt(i) == '/') {
                    contador++;
                } else if (contador == 0) {
                    diaSt += fechaDeNacimiento.charAt(i);
                } else if (contador == 1) {
                    mesSt += fechaDeNacimiento.charAt(i);
                } else {
                    anyoSt += fechaDeNacimiento.charAt(i);
                }
            }

            int dia = Integer.parseInt(diaSt);
            int mes = Integer.parseInt(mesSt);
            int anyo = Integer.parseInt(anyoSt);*/

            if (dia < 1 || anyo < 1900 || anyo > 2023) {
                return false;
            }
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia > 31) {
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 30) {
                        return false;
                    }
                    break;
                case 2:
                    if (dia > 28) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            this.anyoNacimiento = anyo;

            return true;
        }

        public int getEdad() {

            return 2024 - this.anyoNacimiento;
        }

        @Override
        public String toString() {
            return "CorredorDeMaraton{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", dni='" + dni + '\'' +
                    ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                    ", velocidadMaxima=" + velocidadMaxima +
                    ", dorsal=" + dorsal +
                    '}';
        }
    }

