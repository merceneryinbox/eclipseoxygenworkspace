
public final class MerceneryLogger {

    public MerceneryLogger() {
    }

    public void giveMeAllinfo() {
	System.out.println("+++++++++++++++++++++ this.getClass().getPackageName() = "
			   + this.getClass().getPackageName().toString()
			   + "\n" + "+++++++++++++++++++++ this.getClass().getModifiers() = "
			   + this.getClass().getModifiers() + "\n"
			   + "+++++++++++++++++++++ this.getClass().getName() = " + this.getClass().getName() + "\n"
			   + "+++++++++++++++++++++ this.getClass().getCanonicalName() = "
			   + this.getClass().getCanonicalName() + "\n"
			   + "+++++++++++++++++++++ this.getClass().getSimpleName() =" + this.getClass().getSimpleName()
			   + "\n"
			   + "+++++++++++++++++++++ this.getClass().getTypeName() = " + this.getClass().getTypeName()
			   + "\n"
			   + "+++++++++++++++++++++ this.getClass().getEnclosingClass() = "
			   + this.getClass().getEnclosingClass() + "\n"
			   + "+++++++++++++++++++++ this.getClass().getSuperclass() = "
			   + this.getClass().getSuperclass()
			   + "\n"
			   + "+++++++++++++++++++++ this.getClass().getSigners()  = "
			   + this.getClass().getSigners() + "\n"
			   + "+++++++++++++++++++++ this.getClass().getResource(this.getClass().getName()) = "
			   + this.getClass().getResource(this.getClass().getName()));
    }

}
