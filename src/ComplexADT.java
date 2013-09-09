/**
 * @author Christian Soler
 * @class: CSCI 315 (Rhode Island College)
 * @date 9/5/13
 */
public interface ComplexADT {
    public int getReal();

    public int getImaginary();

    public void setReal(int r);

    public void setImaginary(int i);

    public String toString();

    public Complex add(Complex c);

    public Complex subtract(Complex c);

    public Complex multiply(Complex c);

    public boolean equals(Complex c);

    public double findMagnitude();
}
