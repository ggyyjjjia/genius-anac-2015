/*
*   Interface MinimisationFunction
*
*   This interface provides the abstract method for the function to be
*   minimised by the methods in the class, Minimisation
*
*   WRITTEN BY: Dr Michael Thomas Flanagan
*
*   DATE:	    April 2003
*   MODIFIED:   April 2004
*
*   DOCUMENTATION:
*   See Michael Thomas Flanagan's Java library on-line web page:
*   http://www.ee.ucl.ac.uk/~mflanaga/java/Minimisation.html
*   http://www.ee.ucl.ac.uk/~mflanaga/java/
*
*   Copyright (c) 2003 - 2008
*
*   PERMISSION TO COPY:
*   Permission to use, copy and modify this software and its documentation for
*   NON-COMMERCIAL purposes is granted, without fee, provided that an acknowledgement
*   to the author, Michael Thomas Flanagan at www.ee.ucl.ac.uk/~mflanaga, appears in all copies.
*
*   Dr Michael Thomas Flanagan makes no representations about the suitability
*   or fitness of the software for any or for a particular purpose.
*   Michael Thomas Flanagan shall not be liable for any damages suffered
*   as a result of using, modifying or distributing this software or its derivatives.
*
****************************************************************************************/

package flanagan.math;

// Interface for Minimisation class
// Calculates value of function to be minimised
public interface MinimisationFunction{

    double function(double[] param);
}