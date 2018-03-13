/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proves;

/**
 *
 * @author GuillemGuipuvaCrack9
 */
public class Cercle{
 private float x;
 private float y;
 
    public Cercle(float xx, float yy)
    {
         x=xx;
         y=yy;
    }
    
     public Cercle() {
        this.x = 0;
        this.y = 0;
    }
    
    public Cercle(Cercle c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cercle{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }
    
	    public static void main(String[] args) {
        
        Cercle c = new Cercle();
    }
	
}
