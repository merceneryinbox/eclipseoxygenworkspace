package equals;

public class IdealBlochEquals {
    public int fieldInt = 10;
    public String fieldString = "StringField";

    @Override
    public boolean equals(Object anotherObj) {

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
}
