
/**
 * @author Christian Soler
 * @class: CSCI 315 (Rhode Island College)
 * @date 9/5/13
 */
public class Complex implements ComplexADT {
    /**
     * Fields
     */
    private int real;
    private int imaginary;

    /**
     * Constructor to set real and imaginary numbers
     * to zero.
     */
    public Complex() {
        // set numbers to zero
        this.real = 0;
        this.imaginary = 0;
    }

    /**
     * Constructor to set real and imaginary numbers
     * to the given parameters.
     *
     * @param r given real number
     * @param i given imaginary number
     */
    public Complex(int r, int i) {
        // set numbers to given values
        this.real = r;
        this.imaginary = i;
    }

    /**
     * Get the current set real number
     *
     * @return real number
     */
    @Override
    public int getReal() {
        // return real number
        return this.real;
    }

    /**
     * Get the current set imaginary number
     *
     * @return imaginary number
     */
    @Override
    public int getImaginary() {
        // return imaginary number
        return this.imaginary;
    }

    /**
     * Set real number given by user
     *
     * @param r given number
     */
    @Override
    public void setReal(int r) {
        // set real number
        this.real = r;
    }

    /**
     * Set imaginary number given by user
     *
     * @param i given number
     */
    @Override
    public void setImaginary(int i) {
        // set imaginary number
        this.imaginary = i;
    }

    /**
     * Add this complex number to given one
     *
     * @param c given complex number
     * @return the new complex number after addition
     */
    @Override
    public Complex add(Complex c) {
        // add numbers
        int tempReal = this.getReal() + c.getReal();
        int tempImaginary = this.getImaginary() + c.getImaginary();

        // return total
        return new Complex(tempReal, tempImaginary);
    }

    /**
     * Subtract this complex number to given one
     *
     * @param c given complex number
     * @return the new complex number after subtraction
     */
    @Override
    public Complex subtract(Complex c) {
        // subtract numbers
        int tempReal = this.getReal() - c.getReal();
        int tempImaginary = this.getImaginary() - c.getImaginary();

        // return total
        return new Complex(tempReal, tempImaginary);
    }

    /**
     * Multiply this complex number to given one
     *
     * @param c given complex number
     * @return the new complex number after multiplication
     */
    @Override
    public Complex multiply(Complex c) {
        // multiply all terms
        int tempReal = (this.getReal() * c.getReal()) - (this.getImaginary() * c.getImaginary());
        int tempImaginary = (this.getImaginary() * c.getReal()) + (this.getReal() * c.getImaginary());

        // return total
        return new Complex(tempReal, tempImaginary);
    }

    /**
     * Check if this complex number and given complex number
     * are equal to each other.
     *
     * @param c given complex number
     */
    @Override
    public boolean equals(Complex c) {
        // check if number are equal to each other
        return this.getReal() == c.getReal() && this.getImaginary() == c.getImaginary();
    }

    /**
     * Find and return the magnitude of the given complex number;
     * Formula: √(R^2 + I^2)
     *
     * @return magnitude value of the complex number
     */
    @Override
    public double findMagnitude() {
        // return total
        return Math.sqrt((this.getReal() * this.getReal()) + (this.getImaginary() * this.getImaginary()));
    }

    /**
     * Return the complex numbers value as a string
     *
     * @return total values as a string
     */
    @Override
    public String toString() {
        // temp string
        String tempReal = "";
        String tempImaginary = "";


        // check string
        if (this.getReal() == 0) {
            tempReal = "";
        } else {
            tempReal = String.valueOf(this.getReal());
        }

        if (this.getImaginary() == 0) {
            tempImaginary = "";
        } else if (this.getImaginary() == 1) {
            tempImaginary = "i";
        } else if (this.getImaginary() == -1) {
            tempImaginary = "-i";
        } else {
            tempImaginary = String.valueOf(this.getImaginary()) + "i";
        }

        // return formatted string
        if (tempReal.equals("") && tempImaginary.equals("")) {
            return String.valueOf(0);
        } else if (!tempReal.equals("") && tempImaginary.equals("")) {
            return String.format("%s", tempReal);
        } else if (tempReal.equals("") && !tempImaginary.equals("")) {
            return String.format("%s", tempImaginary);
        } else {
            if (tempImaginary.startsWith("-")) {
                return String.format("%s + (%s)", tempReal, tempImaginary);
            } else {
                return String.format("%s + %s", tempReal, tempImaginary);
            }
        }

    }
}
