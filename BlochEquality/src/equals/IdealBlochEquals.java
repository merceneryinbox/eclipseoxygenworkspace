package equals;

import checkers.javari.quals.ReadOnly;

<<<<<<< HEAD
public class IdealBlochEquals {
    public int fieldInt = 10;
    public String fieldString = "StringField";

    @Override
    public boolean equals(@ReadOnly Object anotherObj) {

	if (this == anotherObj) {
	    return this == null ? anotherObj == null : this == anotherObj;
	}

	if (!(anotherObj instanceof IdealBlochEquals)) {
	    return false;
	}

	return (this.fieldInt == 0 ? (((IdealBlochEquals) anotherObj).fieldInt == 0)
				   : (this.fieldInt == ((IdealBlochEquals) anotherObj).fieldInt)
				     && (this.fieldString.equals(((IdealBlochEquals) anotherObj).fieldString))
				     && super.equals(anotherObj));
    }

    @Override
    public int hashCode() {
	int result = 17;
	result = result * 31 + this.fieldInt + fieldString.hashCode();
	return result;
    }

    @Override
    public String toString() {

	return super.toString();
    }
=======
class IdealBlochEquals {
	int fieldInt = 10;
	String fieldString = "StringField";

	@Override
	public boolean equals(@ReadOnly final Object anotherObj) {

		if (this != anotherObj) {
			return anotherObj == null ? false : this == anotherObj;
		}

		if (!(anotherObj instanceof IdealBlochEquals)) {
			return false;
		}

		return (this.fieldInt == 0 ? (((IdealBlochEquals) anotherObj).fieldInt == 0)
				: (this.fieldInt == ((IdealBlochEquals) anotherObj).fieldInt)
						&& (this.fieldString.equals(((IdealBlochEquals) anotherObj).fieldString))
						&& super.equals(anotherObj));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = (result * 31) + this.fieldInt + this.fieldString.hashCode();
		return result;
	}

	@Override
	public String toString() {

		return super.toString();
	}
>>>>>>> work
}
